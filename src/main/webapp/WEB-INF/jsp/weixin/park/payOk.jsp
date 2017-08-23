<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="PATH" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	 <title>支付结果</title>
     <meta http-equiv="Expires" CONTENT="-1">
     <meta http-equiv="Pragma" CONTENT="no-cache">
     <meta http-equiv="Cache-Control" CONTENT="no-cache">
     <meta name="format-detection" content="telephone=no">
     <meta name="apple-mobile-web-app-capable" content="yes">
     <meta name="apple-mobile-web-app-status-bar-style" content="black">
     <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
     <link rel="stylesheet" href="${PATH}/resource/weixin/css/css.css">
	 <script type="text/javascript" src="${PATH}/resource/common/js/jquery-1.12.3.min.js"></script>
	 <script type="text/javascript" src="${PATH}/resource/common/js/content.js"></script>
	 <%  
		String code = request.getParameter("code");  
		String carLicense = request.getParameter("state"); 
   	 %>  
</head>
<body>
<div class="page">
	<div class="brand-wrap"></div>
	<input type="hidden" id="code" value="<%out.print(code); %>"/>  
	<input type="hidden" id="openId" value=""/>  
	<div class="payInfo">
	    <h2 class="title">
            <i></i>
            <span>支付成功</span>
        </h2>
	    <div class="con" style="padding-top:5px;">
	        <ul class="info">
	        	<li class="clearfix">
	                <span>车牌号：</span><span id="carLicense"><% out.print(carLicense); %></span>
	            </li>
	            <li class="clearfix">
	                <span>停车场名称：</span><span>江苏迪泰柯停车场</span>
	            </li>
	        	<li class="clearfix">
	                <span>入场时间：</span><span id="inTimeSpan">2017-07-28 09:12:23</span>
	            </li>
	        
	            <li class="clearfix">
	                <span>计费开始时间：</span><span id="inTimeSpan">2017-07-28 09:12:23</span>
	            </li>
	            <li class="clearfix">
	                <span>计费结束时间：</span><span class="long">2017-07-28 09:12:23</span>
	            </li>
	            <li class="clearfix">
	                <span>停车时长：</span><span><i class="cost">2</i>小时</span>
	            </li>
	            <li class="clearfix">
	                <span>缴费金额：</span><span id="carLicense"><i class="cost">2</i>元</span>
	            </li>
	            <li class="clearfix">
	                <span>订单号：</span><span id="carLicense">${outTradeNo }</span>
	            </li>
	            <li class="clearfix">
	                <span>微信订单号：</span><span id="carLicense">12316546546</span>
	            </li>
	            
	        </ul>
	    </div>
	</div>              
</div>
</body>
<script type="text/javascript">
	var contextPath = platform_URL + platform_basePath;
	//必须在页面所有Element之前加载脚本文件先实例化fastclick
	$(function() {  
	    FastClick.attach(document.body);
	});
</script>
<script src="${PATH}/resource/weixin/js/main/dialog.js" type="text/javascript"></script>
<script src="${PATH}/resource/common/js/fastclick.js" type="text/javascript"></script>
</html>
