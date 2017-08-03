<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="PATH" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	 <title>停车记录</title>
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
</head>

	<body>  
		<input type="hidden" id="openId" value=""/>  
		<input type="hidden" id="carNo" value="${STATE}"/>
		<%  
			String code = request.getParameter("code");  
			String carNo = request.getParameter("state"); 
    	%>  
   		<div><hr/>  code:<%out.print(code); %>  </div>  
   		<div><hr/>  carNo:<%out.print(carNo); %>  </div>  
		<div class="index_box">  
        	<div class="apply_name">微信支付测试</div>  
        	<div class="branch_con">  
            	<ul>
		        	<li><span class="name">测试支付信息，1分钱</span></li>
		        	<input type="text" id="code" value="<%out.print(code); %>"/>  
   					<input type="text" id="path" value="${pageContext.request.contextPath}"/>  
		        </ul>
               	<p class="cz_btn"><a href="javascript:void(0);" class="btn_1" id="payAction">立即支付</a></p>  
           </div>  
       </div>  
       <script type="text/javascript" src="${PATH}/resource/weixin/js/pay/pay.js"></script>  
	 
   </body>  
   </html>  