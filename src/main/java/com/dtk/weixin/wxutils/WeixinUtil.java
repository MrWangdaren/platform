package com.dtk.weixin.wxutils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;
import com.dtk.weixin.model.enums.ResultCode;

/**
 * 
 * <p>Description: 微信http网络请求工具 </p>
 * @author wy
 * @date 2017年7月24日 下午5:57:17
 */
public class WeixinUtil {
	
	
	
    public static final Log logger = LogFactory.getLog(WeixinUtil.class);
    
    
    public static final String TOKEN = "asfpofqfkjfpoiqwadsfpkojopeiopro";

    /**
     * 可以处理中文乱码，
     */
    public static String postXml(String url, String xml) {
        StringBuilder sb = new StringBuilder();
        HttpPost httpPost = new HttpPost(url);
        HttpEntity entity = null;

        httpPost.setHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
        try {
        	//CloseableHttpClient 官方已弃用
//          HttpClient client = new CloseableHttpClient();
        	CloseableHttpClient client = HttpClients.createDefault();
            StringEntity payload = new StringEntity(xml, "UTF-8");
            httpPost.setEntity(payload);
            HttpResponse response = client.execute(httpPost);
            entity = response.getEntity();
            String text;
            if (entity != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent()));
                while ((text = bufferedReader.readLine()) != null) {
                    sb.append(text);
                }

            }
        } catch (Exception e) {
            logger.error("与[" + url + "]通信过程中发生异常,堆栈信息如下", e.getCause());
        } finally {
            try {
                EntityUtils.consume(entity);
            } catch (IOException ex) {
                ex.printStackTrace();
                logger.error("net io exception");
            }
        }
        return sb.toString();
    }

    /**
     * 可以处理中文乱码， 带上 证书信息
     */
    public static String postXmlWithKey(String url, String xml, InputStream in, String mchId) throws Exception {

        KeyStore keyStore = KeyStore.getInstance("PKCS12");

        try {
            keyStore.load(in, mchId.toCharArray());
        } finally {
            in.close();
        }

        // Trust own CA and all self-signed certs
        SSLContext sslcontext = SSLContexts.custom()
                .loadKeyMaterial(keyStore, mchId.toCharArray())
                .build();
        // Allow TLSv1 protocol only
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                sslcontext,
                new String[]{"TLSv1"},
                null,
                SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        CloseableHttpClient client = HttpClients.custom()
                .setSSLSocketFactory(sslsf)
                .build();

        StringBuilder sb = new StringBuilder();
        HttpPost httpPost = new HttpPost(url);
        HttpEntity entity = null;

        httpPost.setHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
        try {

            StringEntity payload = new StringEntity(xml, "UTF-8");
            httpPost.setEntity(payload);
            HttpResponse response = client.execute(httpPost);
            entity = response.getEntity();
            String text;
            if (entity != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent()));
                while ((text = bufferedReader.readLine()) != null) {
                    sb.append(text);
                }

            }
        } catch (Exception e) {
            logger.error("与[" + url + "]通信过程中发生异常,堆栈信息如下", e.getCause());
        } finally {
            try {
                EntityUtils.consume(entity);
            } catch (IOException ex) {
                ex.printStackTrace();
                logger.error("net io exception");
            }
        }
        return sb.toString();
    }
    
    
    public static String getResult(ResultCode resultCode, String returnMsg) {
        Map<String, Object> data = new HashMap<String, Object>(2);
        data.put("return_code", resultCode.getCode());
        data.put("return_msg", returnMsg);
        return XmlUtil.toXml(data);
    }
    
    
    
    /** 
     * 发起https请求并获取结果 
     * @param requestUrl 请求地址 
     * @param requestMethod 请求方式（GET、POST） 
     * @param outputStr 提交的数据 
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值) 
     */  
    public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {  
        JSONObject jsonObject = null;  
        StringBuffer buffer = new StringBuffer();  
        try {  
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化  
            TrustManager[] tm = { new MyX509TrustManager() };  
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");  
            sslContext.init(null, tm, new java.security.SecureRandom());  
            // 从上述SSLContext对象中得到SSLSocketFactory对象  
            SSLSocketFactory ssf = sslContext.getSocketFactory();  
  
            URL url = new URL(requestUrl);  
            HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();  
            httpUrlConn.setSSLSocketFactory(ssf);  
  
            httpUrlConn.setDoOutput(true);  
            httpUrlConn.setDoInput(true);  
            httpUrlConn.setUseCaches(false);  
            // 设置请求方式（GET/POST）  
            httpUrlConn.setRequestMethod(requestMethod);  
  
            if ("GET".equalsIgnoreCase(requestMethod))  
                httpUrlConn.connect();  
  
            // 当有数据需要提交时  
            if (null != outputStr) {  
                OutputStream outputStream = httpUrlConn.getOutputStream();  
                // 注意编码格式，防止中文乱码  
                outputStream.write(outputStr.getBytes("UTF-8"));  
                outputStream.close();  
            }  
  
            // 将返回的输入流转换成字符串  
            InputStream inputStream = httpUrlConn.getInputStream();  
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
  
            String str = null;  
            while ((str = bufferedReader.readLine()) != null) {  
                buffer.append(str);  
            }  
            bufferedReader.close();  
            inputStreamReader.close();  
            // 释放资源  
            inputStream.close();  
            inputStream = null;  
            httpUrlConn.disconnect();  
            jsonObject = JSONObject.parseObject(buffer.toString());
//            		fromObject(buffer.toString());  
        } catch (ConnectException ce) {  
        	logger.error("Weixin server connection timed out.");  
        } catch (Exception e) {  
        	logger.error("https request error:{}", e);  
        }  
        return jsonObject;  
    } 
   
    
}
