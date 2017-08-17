<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="PATH" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>个人中心</title>
	<meta http-equiv="Expires" CONTENT="-1">
    <meta http-equiv="Pragma" CONTENT="no-cache">
    <meta http-equiv="Cache-Control" CONTENT="no-cache">
    <meta name="format-detection" content="telephone=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
	<link href="${PATH}/resource/common/stylesheets/bootstrap/bootstrap.min.css" rel="stylesheet">
	<link href="${PATH}/resource/common/stylesheets/bootstrap/bootstrap-theme.min.css" rel="stylesheet">
	<script type="text/javascript" src="${PATH}/resource/common/js/jquery.min.js"></script>
	<script type="text/javascript" src="${PATH}/resource/common/js/template.js"></script>
	<script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="bootstrap" src="${PATH}/resource/common/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
	<link rel="stylesheet" href="${PATH}/resource/weixin/css/center.css">
</head>
<body>
<div id="content" class="container con">
	<input type="hidden" id="userId" value="">
	<div>
		<div class="row">
			<img src="${PATH}/resource/weixin/img/center/bg.png" style="width:100%;height: 13em;" />
		</div>
		<div class="memberinfo ct">
			<div id="portrait" class="row"></div>
			<div id="membername" class="row"></div>
		</div>
	</div>
	<div class="row accountdiv">
		<div class="col-xs-3 bd clickable" onclick="document.location='/memberAccount/balancePage?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJvZlFINnNwLXg1NXVid1lpWVgxVWUxYnhEXzRVIiwiZXhwIjoxNTAyOTUwOTE4OTE4fQ.aHHSFVE3v2eU8SILbHx8D4-v41PQnUsRB0sY2Q8QnLM';">
			<div class="account">
				<div class="accountvalue">0元</div>
				<div class="accountname">账户余额</div>
			</div>
		</div>
		<div class="col-xs-3 bd">
			<div class="account">
				<div class="accountvalue">
					2张
				</div>
				<div class="accountname">绑定车牌</div>
			</div>
		</div>
		<div class="col-xs-3 bd clickable" onclick="document.location='/memberAccount/showAllTicket?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJvZlFINnNwLXg1NXVid1lpWVgxVWUxYnhEXzRVIiwiZXhwIjoxNTAyOTUwOTE4OTE4fQ.aHHSFVE3v2eU8SILbHx8D4-v41PQnUsRB0sY2Q8QnLM&DelFlag=0&status=0';">
			<div class="account">
				<div class="accountvalue">1张</div>
				<div class="accountname">优惠券</div>
			</div>
		</div>
		<div class="col-xs-3 bd">
			<div class="account">
				<div class="accountvalue">100分</div>
				<div class="accountname">积分</div>
			</div>
		</div>
	</div>
	<div class="row itemdiv clickable" onclick="document.location='/toBound/carList.do';">
		<div class="icon"><img src="${PATH}/resource/weixin/img/center/car2.png" style="width:auto;height: 1.2em;"/></div>
		<div class="item">车辆设置</div>
		<div class="rightIcon"><img src="${PATH}/resource/weixin/img/center/arrow.png" style="width:auto;height: 1.2em;"/></div>
		<div class="rightValue">苏A12345</div>
	</div>
	<div class="row itemdiv clickable" onclick="document.location='/wx/charge';">
		<div class="icon"><img src="${PATH}/resource/weixin/img/center/phone.png" style="width:auto;height: 1.4em;"/></div>
		<div class="item">修改手机号码</div>
		<div class="right"><img src="${PATH}/resource/weixin/img/center/arrow.png" style="width:auto;height: 1.2em;"/></div>
	</div>
	<div class="row itemdiv clickable" onclick="document.location='/memberAccount/parkingListPage.do';">
		<div class="icon"><img src="${PATH}/resource/weixin/img/center/advice.png" style="width:auto;height: 1.2em;"/></div>
		<div class="item">意见反馈</div>
		<div class="right"><img src="${PATH}/resource/weixin/img/center/arrow.png" style="width:auto;height: 1.2em;"/></div>
	</div>
	<div class="row itemdiv clickable" onclick="document.location='/memberAccount/parkingListPage.do';">
		<div class="icon"><img src="${PATH}/resource/weixin/img/center/coupon.png" style="width:auto;height: 1.2em;"/></div>
		<div class="item">优惠券</div>
		<div class="right"><img src="${PATH}/resource/weixin/img/center/arrow.png" style="width:auto;height: 1.2em;"/></div>
	</div>
	<div class="row itemdiv clickable" onclick="document.location='/wx/charge';">
		<div class="icon"><img src="${PATH}/resource/weixin/img/center/dollar.png" style="width:auto;height: 1.4em;"/></div>
		<div class="item">我的钱包</div>
		<div class="right"><img src="${PATH}/resource/weixin/img/center/arrow.png" style="width:auto;height: 1.2em;"/></div>
	</div>
</div>

<div class="footerMenu">
  		<a  href="${PATH}/weixin/main/init.do">停车缴费</a>
  		<a  href="${PATH}/weixin/record/init.do">记录查询</a>
  		<a class="active" href="${PATH}/weixin/center/init.do">个人中心</a>
</div>

<script type="text/javascript">
	$(function () {
		//加载页面数据
		$.getJSON("${PATH}/weixin/center/getUser.do?t=" + new Date().getTime(), function(res){
			console.log(res);
			if(res != null){
				$("userId").val(res.id);
				var vipHeaderIcon = res.vipHeaderIcon;
				if(vipHeaderIcon != null && vipHeaderIcon != ''){
					$("#portrait").append("<img src='" + vipHeaderIcon + "' style='width:auto;height: 5em;'/>");
				}else{
					$("#portrait").append("<i class='fa fa-user fa-5x white'></i>");
				}
				$("#membername").append("<p>" + res.vipName + "</p>");
			}
		});
	});
</script>
<div style="display: none;">
	<script src="https://s22.cnzz.com/z_stat.php?id=1262225622&web_id=1262225622" language="JavaScript"></script>
</div>
</body>
</html>
