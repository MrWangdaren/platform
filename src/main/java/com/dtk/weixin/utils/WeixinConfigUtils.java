package com.dtk.weixin.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dtk.platform.tools.ParkConfig;

/**
 * 微信的配置参数
 * @author iYjrg_xiebin
 * @date 2015年11月25日下午4:19:57
 */
@SuppressWarnings("unused")
public class WeixinConfigUtils {

	private static final Log log = LogFactory.getLog(WeixinConfigUtils.class);


	public static String appid;
	public static String mch_id;
	public static String notify_url;

	static {
		try{
			appid = ParkConfig.getConfigItem("weixin", "appid");
			mch_id = ParkConfig.getConfigItem("weixin", "mch_id");
			notify_url = ParkConfig.getConfigItem("weixin", "notify_url");
		}catch(Exception ex){
			log.debug("加载配置文件："+ex.getMessage());
		}
	}


	public static void main(String[] args) throws IOException {
		String appid = "";
		try{
			appid = ParkConfig.getConfigItem("weixin", "appid");
		}catch(Exception ex){
			log.debug("加载配置文件："+ex.getMessage());
		}
		System.out.println(appid);
	}

}
