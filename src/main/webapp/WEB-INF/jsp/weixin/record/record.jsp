<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="PATH" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <meta http-equiv="Expires" CONTENT="-1">
     <meta http-equiv="Pragma" CONTENT="no-cache">
     <meta http-equiv="Cache-Control" CONTENT="no-cache">
     <meta name="format-detection" content="telephone=no">
     <meta name="apple-mobile-web-app-capable" content="yes">
     <meta name="apple-mobile-web-app-status-bar-style" content="black">
     <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
     <title>停车缴费</title>
</head>
<link rel="stylesheet" href="${PATH}/resource/weixin/css/css.css">
<link rel="stylesheet" href="${PATH}/resource/weixin/css/main.css">
<script src="${PATH}/resource/weixin/js/common/jquery-1.12.3.min.js" type="text/javascript"></script>
<body>
	<div class="page detailspage">
		<div class="norecord">暂无停车记录，快去停车吧~</div>
		<div class="openout"></div>   

		<div class="footerMenu">
	   		<a class="active" href="/parking/parking/fee/index.html">停车缴费</a>
	   		<a  href="/parking/parking/his/index.html">记录查询</a>
	   		<a  href="/parking/parking/car/index.html">个人中心</a>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function() {  
	    FastClick.attach(document.body);
	});
</script>

<script src="${PATH}/resource/weixin/js/main/dialog.js" type="text/javascript"></script>
<script src="${PATH}/resource/weixin/js/main/main.js" type="text/javascript"></script>
<script src="${PATH}/resource/weixin/js/common/fastclick.js" type="text/javascript"></script>
</html>
