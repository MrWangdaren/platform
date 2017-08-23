<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="PATH" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	 <title>记录查询</title>
     <meta http-equiv="Expires" CONTENT="-1">
     <meta http-equiv="Pragma" CONTENT="no-cache">
     <meta http-equiv="Cache-Control" CONTENT="no-cache">
     <meta name="format-detection" content="telephone=no">
     <meta name="apple-mobile-web-app-capable" content="yes">
     <meta name="apple-mobile-web-app-status-bar-style" content="black">
     <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
     <link rel="stylesheet" href="${PATH}/resource/weixin/css/css.css">
	 <script type="text/javascript" src="${PATH}/resource/common/js/jquery-1.12.3.min.js"></script>
</head>
<body>
	<div class="page detailspage">
	
		<div class="paymentInfo">
		
			<select id="licenceType" class="record_choosetxt">	    	
				<option value="0" selected="selected">停车记录</option>
				<option value="1">缴费记录</option>
				<option value="2">优惠券记录</option>
				<option value="3">充值记录</option>
			</select>
			<span class="pand_left">时间：</span>
			<select id="licenceType" class="record_choosetxt">	
			    	
				<option value="0" selected="selected">日</option>
				<option value="1">周</option>
				<option value="2">月</option>
				<option value="3">季</option>
				<option value="4">年</option>
			</select>
			
			<select id="licenceType" class="record_choosetxt">	    	
				<option value="0" selected="selected">星期一</option>
				<option value="1">星期二</option>
				<option value="2">星期三</option>
				<option value="3">星期四</option>
				<option value="4">星期五</option>
				<option value="5">星期六</option>
				<option value="6">星期七</option>
			</select>
		</div>
	
		<div class="norecord">暂无停车记录，快去停车吧~</div>
		<div class="openout"></div>   

		<div class="footerMenu">
	   		<a  href="${PATH}/weixin/main/init.do">停车缴费</a>
	   		<a class="active" href="${PATH}/weixin/record/init.do">记录查询</a>
	   		<a  href="${PATH}/weixin/center/init.do">个人中心</a>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function() {  
	    FastClick.attach(document.body);
	});
</script>

<script src="${PATH}/resource/weixin/js/main/dialog.js" type="text/javascript"></script>
<script src="${PATH}/resource/common/js/fastclick.js" type="text/javascript"></script>
</html>
