package com.dtk.weixin.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dtk.weixin.wxtools.WeixinUtil;

@Controller
@RequestMapping("/weixin/api")
public class TokenContoller{
	
	

	@RequestMapping(value="/verify",method = RequestMethod.GET)
	@ResponseBody
	public void verifyUrlInterfaceGet(HttpServletRequest request ,HttpServletResponse response)throws IOException{
		try{
			String signature=request.getParameter("signature");
			String timeStamp=request.getParameter("timestamp");
			String nonce=request.getParameter("nonce");
			String echostr=request.getParameter("echostr");
			String token =WeixinUtil.TOKEN;
			
			System.out.println("GET"+signature+"--"+timeStamp+"--"+nonce+"--"+echostr+"--"+token);
			
			ArrayList<String> list=new ArrayList<String>();
			list.add(timeStamp);
			list.add(nonce);
			list.add(WeixinUtil.TOKEN);
			
			Collections.sort(list);
			String sss=DigestUtils.sha1Hex(list.get(0)+list.get(1)+list.get(2));
			System.out.println("signature:"+sss);
			if(sss.equals(signature)){
				response.getWriter().print(echostr);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			response.getWriter().print("请求失败");
		}
		
	}
	
	@RequestMapping(value="/verify",method = RequestMethod.POST,produces = "application/xml;charset=UTF-8")
	@ResponseBody
	public void verifyUrlInterface(HttpServletRequest request ,HttpServletResponse response)throws IOException{
		try{
			
			
//			String toUserName=msg.getToUserName();
//			String fromUserName=msg.getToUserName();
//			String createTime=msg.getToUserName();
//			String msgType=msg.getToUserName();
//			String event=msg.getToUserName();
//			String eventKey=msg.getToUserName();
//			System.out.println(toUserName+":"+fromUserName+":"+createTime+":"+msgType+":"+event+":"+eventKey);
			
			String signature=request.getParameter("signature");
			String timeStamp=request.getParameter("timestamp");
			String nonce=request.getParameter("nonce");
			String token =WeixinUtil.TOKEN;
			InputStream is=request.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader bf=new BufferedReader(isr);
			
			
			if(bf!=null){
				String body="";
				String line="";
				while((line=bf.readLine())!=null){
					body+=line;
				}
				Document r = DocumentHelper.parseText(body);
				String from=r.selectSingleNode("/xml[1]/FromUserName[1]").getStringValue();
				String event=r.selectSingleNode("/xml[1]/Event[1]").getStringValue();
				
				switch(event)
				{
				case "subscribe":{
					String eventKey=r.selectSingleNode("/xml[1]/EventKey[1]").getStringValue();
					System.out.println("eventKey"+eventKey);
					break;
				}
				}
				if(event.equals("sub")){}
				System.out.println("body:---"+body);
			}
			
			
			System.out.println("POST"+signature+"--"+timeStamp+"--"+nonce+"--"+"--"+token);
			
			ArrayList<String> list=new ArrayList<String>();
			list.add(timeStamp);
			list.add(nonce);
			list.add(WeixinUtil.TOKEN);
			
			Collections.sort(list);
			String sss=DigestUtils.sha1Hex(list.get(0)+list.get(1)+list.get(2));
			System.out.println("signature:"+sss);
			if(sss.equals(signature)){
				response.getWriter().print("");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			response.getWriter().print("");
		}
		
	}
	
	
	
	
	@RequestMapping("/paynotice")
	@ResponseBody
	public void payNotice(HttpServletRequest request ,HttpServletResponse response )throws IOException{

			try{
				String productId=request.getParameter("productId");
				String productName=request.getParameter("productName");
				
			}catch(Exception e){
				
			}

	}
	
//	public static void main(String[] args){
//		String xml="<xml><ToUserName><![CDATA[toUser]]></ToUserName>"+
//	"<FromUserName><![CDATA[FromUser]]></FromUserName><CreateTime>123456789</CreateTime>"+
//				"<MsgType><![CDATA[event]]></MsgType><Event><![CDATA[subscribe]]></Event>"+
//	"<EventKey><![CDATA[qrscene_123123]]></EventKey><Ticket><![CDATA[TICKET]]></Ticket>"+
//"</xml>";
//		try {
//			Document r = DocumentHelper.parseText(xml);
//			String msgType=r.selectSingleNode("/xml[1]/Event[1]").getStringValue();
//			System.out.println(msgType);
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}
