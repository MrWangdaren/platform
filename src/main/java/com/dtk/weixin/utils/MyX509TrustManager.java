package com.dtk.weixin.utils;

import java.security.cert.CertificateException;  
import java.security.cert.X509Certificate;  
  
import javax.net.ssl.X509TrustManager;  
  
/**
 * <p>Description:证书信任管理器（用于https请求）  </p>
 * @author wy
 * @date 2017年6月21日 上午10:29:08
 */
public class MyX509TrustManager implements X509TrustManager {  
  
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {  
    }  
  
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {  
    }  
  
    public X509Certificate[] getAcceptedIssuers() {  
        return null;  
    }  
}  