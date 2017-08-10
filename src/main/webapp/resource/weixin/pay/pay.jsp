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
<div class="page">
	<div class="brand-wrap"></div>
	<%  
		String carLicense = request.getParameter("carLicense");  
    %>  
	<div class="payInfo">
	    <h2 class="title">
            <i></i>
            <span>待支付</span>
        </h2>
	    <div class="con" style="padding-top:5px;">
	        <ul class="info">
	        	<li class="clearfix">
	                <span>车牌号：</span><span id="carLicense"><%out.print(carLicense); %></span>
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
	                <span>入场图片：</span><span class="red">
	                	<img class="fresh" src="http://res.mallshow.net/wx/img/MicroParking/white/fresh.png">
	                </span>
	            </li>
	        </ul>
	    </div>
	</div>              
	
	<div class="payInfo">
	    <div class="con" style="padding-top:5px;">
	        <ul class="info">
	        	<li class="clearfix">
	                <span>支付方式：</span><span id="carLicense">微信</span>
	            </li>
	            <li class="clearfix">
	                <span>应收金额</span><span class="red"><i class="cost" id="totalFee">2</i>元</span>
	            </li>
	        	<li class="clearfix">
	                <span>优惠券：</span><span class="red"><i class="cost">0</i>元</span>
	            </li>
	        
	            <li class="clearfix">
	                <span>积分：</span><span class="red">
						<span class="plus fr">+</span>
		                <b class="number-integer fr">500</b>                            
		                <span class="minus fr">-</span>
					</span>
	            </li>
	            <li class="clearfix">
	                <span>实收金额：</span><span class="big red"><i class="cost" id="factMoney">2</i>元</span>
	            </li>
	        </ul>
	        <div class="clearfix">
	            <a class="redbtn fr" href="javascript:void(0);" id="payAction">立即支付</a>
	        </div>
	    </div>
	</div>         
	<div class="footerTips"><a href="javascript:void(0);">对此停车记录有疑问？</a></div>


<!-- 弹窗-大图 -->
<div class="fixcont" id="js-big">
    <div class="fiximg">
        	<img class="bigImg" src="http://res.mallshow.net/wx/img/MicroParking/white/defaultImg.jpg">
    </div>
</div>
<script type="text/javascript">
//开始支付

$("#payAction").on("click", function(e){
	var totalFee = 2;//应付
	var factMoney = $("#factMoney").val();
	var openId = $("#openId").val();
	var carLicense = $("#carLicense").val();
	
	if(totalFee == 0) {
		$.promptDialog({poptxt:"无需缴费"});
		return ;
	}
	isDisabled( $("#payAction"),true);
	
	var data = {
//		carLicense:carLicense,
//		totalFee:totalFee,
//		factMoney: factMoney,
		openId: openId
	};
	$.promptDialog_wait("正在提交请稍后....")
    $.post('/platform/weixin/pay/doPay.do', data, function (ret) {
    	close_waitpop();
        if (ret.code == 0){
            if (typeof WeixinJSBridge == "undefined"){
                if( document.addEventListener ){
                    document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
                }else if (document.attachEvent){
                    document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
                    document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
                }
            }else{
                var param = ret.param;
                param.outTradeNo = ret.outTradeNo;
                onBridgeReady(param);
            }
        }else{
            $.promptDialog({poptxt:ret.msg});
        }
    });

});

function isDisabled(btn,tag){
    if(tag == true){
        btn.attr("disabled",true);
        btn.addClass('btn-default');
    }else{
        btn.removeAttr("disabled");
        btn.removeClass('btn-default');
    }
}
</script>
		
	</div>
</body>
<script type="text/javascript">
	var contextPath = platform_URL + platform_basePath;
	//必须在页面所有Element之前加载脚本文件先实例化fastclick
	$(function() {  
	    FastClick.attach(document.body);
	});
</script>
<script type="text/javascript" src="${PATH}/resource/weixin/js/pay/pay.js?verson=0123"></script> 
<script type="text/javascript" src="${PATH}/resource/weixin/js/main/dialog.js?verson=0119"></script>
<script type="text/javascript" src="${PATH}/resource/weixin/js/main/main.js?verson=0119"></script>
<script type="text/javascript" src="${PATH}/resource/common/js/fastclick.js"></script>
</html>
