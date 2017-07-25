<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="PATH" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
	<head>  
		<title>微信测试支付</title>  
	   	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />  
	   	<meta name="apple-mobile-web-app-capable" content="yes" />  
	   	<meta name="apple-mobile-web-app-status-bar-style" content="black" />  
	   	<meta name="format-detection" content="telephone=no" />  
	   	<script type="text/javascript" src="${PATH}/resource/weixin/js/common/jquery-1.12.3.min.js"></script>
	</head>  
	<body>  
		<input type="hidden" id="openId" value="oTYlf1Ap7USBffF6z8rlwctWkgik"/>  
		<%  
			String code = request.getParameter("code");  
    	%>  
   		<div><hr/>  code:<%out.print(code); %>  </div>  
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