<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="PATH" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	 <title>停车缴费</title>
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
	<div class="page bind">
	<input type="hidden" id="plateNoPrefixHidden" value="苏">
   	<h2 class="h2-tit">请输入车牌号</h2>
   	<div class="brand"> 
		<select id="licenceType" class="t_choosetxt">	    	
			<option value="0" selected="selected">蓝牌</option>
			<option value="1">黄牌</option>
			<option value="2">新能源绿牌</option>
			<option value="3">新能源黄绿牌</option>
		</select>
      	<div id="bindCar" class="inner">
           	<input type="text" maxlength="1" value="" readonly="readonly">
           	<input type="text" maxlength="1" value="" readonly="readonly">
           	<input type="text" maxlength="1" value="" readonly="readonly">
           	<input type="text" maxlength="1" value="" readonly="readonly">
           	<input type="text" maxlength="1" value="" readonly="readonly">
           	<input type="text" maxlength="1" value="" readonly="readonly">
           	<input type="text" maxlength="1" value="" readonly="readonly">
           	<!-- 
           	<input type="text" maxlength="1" value="" readonly="readonly">
           	 -->
       	</div>
   	</div>
   
   <div class="btns clearfix">
       <a id="changeBrand" class="orangebtn fl" href="javascript:;">已绑定车牌</a>
       <a id="sureBrand" class="orangebtn fr" href="javascript:;">确定缴费</a>
       <a id="rule" class="orangebtn" href="javascript:;">缴费规则</a>
   </div> 
   <div class="paymentInfo">
       <div class="title"><span>场内停车记录</span></div>
       <div class="historyList">
           <table id="positions"></table>
       </div>
   </div>
   <div class="openout"></div>       
   <!-- 弹窗-缴费规则 -->
   <div class="fixcont" id="js-rule">
       <div class="fixbottom">
           <h2 class="title">
               <span>缴费规则</span>
               <a href="javascript:;" class="close">×</a>
           </h2>
           <div class="rulesBox">
				<div class="rulesInner">
					<p>停车场收费须知 :1、<span>8:00-20:00</span></p>
					<p style="padding-left:120px;">4元/小时，6元封顶</p>
					<p style="padding-left:100px;">2、<span>4元/小时，6元封顶</span></p>
					<p style="padding-left:120px;">1元/小时，6元封顶</p>
	           </div>
	       </div>
	   </div>
   </div>
   <!-- 弹窗-选择车牌 -->
   <div class="fixcont" id="js-choose">
       <div class="fixbottom">
           <h2 class="title">
               <span>选择车牌</span>
               <a href="javascript:;" class="close">×</a>
           </h2>
       </div>
   </div> 
   
   <!-- 键盘 -->
<div id="key-chinese" class="keybox">
    <ul class="clearfix">
        <li><span class="keys">京</span></li>
        <li><span class="keys">津</span></li>
        <li><span class="keys">沪</span></li>
        <li><span class="keys">渝</span></li>
        <li><span class="keys">蒙</span></li>
        <li><span class="keys">新</span></li>
        <li><span class="keys">藏</span></li>
        <li><span class="keys">宁</span></li>
        <li><span class="keys">桂</span></li>                
    </ul>
    <ul class="clearfix">
        <li><span class="keys">贵</span></li>
        <li><span class="keys">云</span></li>
        <li><span class="keys">黑</span></li>
        <li><span class="keys">吉</span></li>
        <li><span class="keys">辽</span></li>
        <li><span class="keys">晋</span></li>
        <li><span class="keys">冀</span></li>
        <li><span class="keys">青</span></li>
        <li><span class="keys">鲁</span></li>
    </ul>
    <ul class="clearfix">
        <li><span class="keys">使</span></li>
        <li><span class="keys">豫</span></li>
        <li><span class="keys">苏</span></li>
        <li><span class="keys">皖</span></li>
        <li><span class="keys">浙</span></li>
        <li><span class="keys">闽</span></li>
        <li><span class="keys">赣</span></li>
        <li><span class="keys">湘</span></li>
        <li><a class="undo" href="javascript:void(0)">&nbsp;</a></li>
    </ul>
    <ul class="clearfix">
        <li>&nbsp;</li>
        <li><span class="keys">鄂</span></li>
        <li><span class="keys">粤</span></li>
        <li><span class="keys">琼</span></li>
        <li><span class="keys">甘</span></li>
        <li><span class="keys">陕</span></li>
        <li><span class="keys">川</span></li>
        <li class="doubleLi"><a class="clearBtn" href="javascript:void(0)">&nbsp;</a></li>
    </ul>
</div>
<!-- 键盘 -->
<div id="key-characters" class="keybox">
    <ul class="clearfix">
        <li class="numberLi"><span class="keys">1</span></li>
        <li class="numberLi"><span class="keys">2</span></li>
        <li class="numberLi"><span class="keys">3</span></li>
        <li class="numberLi"><span class="keys">4</span></li>
        <li class="numberLi"><span class="keys">5</span></li>
        <li class="numberLi"><span class="keys">6</span></li>
        <li class="numberLi"><span class="keys">7</span></li>
        <li class="numberLi"><span class="keys">8</span></li>
        <li class="numberLi"><span class="keys">9</span></li>
        <li class="numberLi"><span class="keys">0</span></li>
    </ul>
    <ul class="clearfix">
        <li class="letterLi"><span class="keys">Q</span></li>
        <li class="letterLi"><span class="keys">W</span></li>
        <li class="letterLi"><span class="keys">E</span></li>
        <li class="letterLi"><span class="keys">R</span></li>
        <li class="letterLi"><span class="keys">T</span></li>
        <li class="letterLi"><span class="keys">Y</span></li>
        <li class="letterLi"><span class="keys">U</span></li>
        <li class="letterLi"><span class="keys">P</span></li>
        <li class="letterLi"><span class="keys">A</span></li>
        <li class="letterLi"><span class="keys">S</span></li>
    </ul>
    <ul class="clearfix">
        <li class="letterLi"><span class="keys">D</span></li>
        <li class="letterLi"><span class="keys">F</span></li>
        <li class="letterLi"><span class="keys">G</span></li>
        <li class="letterLi"><span class="keys">H</span></li>
        <li class="letterLi"><span class="keys">J</span></li>
        <li class="letterLi"><span class="keys">K</span></li>
        <li class="letterLi"><span class="keys">L</span></li>
        <li class="letterLi"><span class="keys">Z</span></li>
        <li class="letterLi"><span class="keys">X</span></li>
        <li><a class="undo" href="javascript:void(0)">&nbsp;</a></li>
    </ul>
    <ul class="clearfix">
        <li class="letterLi"><span class="keys">C</span></li>
        <li class="letterLi"><span class="keys">V</span></li>
        <li class="letterLi"><span class="keys">B</span></li>
        <li class="letterLi"><span class="keys">N</span></li>
        <li class="letterLi"><span class="keys">M</span></li>
        <li class="specialLi"><span class="keys">港</span></li>
        <li class="specialLi"><span class="keys">澳</span></li>
        <li class="specialLi"><span class="keys">学</span></li>
        <li class="specialLi"><span class="keys">领</span></li>
        <li><a class="clearBtn" href="javascript:void(0)">&nbsp;</a></li>
    </ul>
</div>
<script type="text/javascript">
	//车牌前缀
	var plateNoPrefix = $("#plateNoPrefixHidden").val();
	if(plateNoPrefix != "") {
		for(var i = 0; i < plateNoPrefix.length; i++) {
			$("#bindCar input").eq(i).val(plateNoPrefix[i]);
		}
	}
	
	//加载车牌与停车信息
	$.ajax({
		url:"loadCarInfo.do?t="+new Date().getTime(),
		type:"POST",
		dataType:"JSON",
		async: false,
		success:function(res){
			if(res.code == '1'){
				var carInfoList = res.carInfoList;
				
				if(carInfoList != null && carInfoList.length != 0){
					$("#js-choose").find(".title").after("<ul class='chooseList'></ul>");
					for(var i = 0 ; i< carInfoList.length; i++){
						$(".chooseList").append("<li><span>" + carInfoList[i].carLicense + "</span></li>");
					}
				}else{
					$("#js-choose").find(".title").after("<p class='chooseno'></p>");
					$(".chooseno").append("您尚未绑定车牌，请在“个人中心”中绑定车牌。");
				}
				
				var inParkList = res.inParkList;
				$("#positions").html( 
					"<thead>"+
						"<tr>"+
							"<th>车牌号</th>"+
							"<th>入场日期</th>"+
							"<th>时长</th>"+
							"<th>选此车</th>"+
						"</tr>"+
					"</thead>");
						
				//加载数据
				if(inParkList.length>0){
					for(var i=0;i<inParkList.length;i++){
						var temp=inParkList[i];
						$("#positions").append(
							"<tbody>"+
								"<tr>"+
									"<td><span class='number'>"+ temp.carLicense + "</span></td>" +
									"<td>"+ temp.comeTime + "</td>"+
									"<td>"+ minuteToHour(temp.stopTime) + "h</td>"+
									"<td><a class='littlebtn' onclick='confirmPay(`" + temp.carLicense +"`," + temp.licenseType + ")'>确定缴费</a></td>" +
								"</tr>"+
							"<tbody>"
						);
					}
				}else{
					$("#positions").append("<tr>"+"</tr>");
				}
						
			}else{
				poptxt:'数据加载失败，请至岗亭缴费！';
			}
		}
	});
	

    //选择已绑定车牌
    var items = $(".chooseList").find("li");
    var ospan = $("#bindCar").find("input");
    $("#changeBrand").on("click", function(e){
    	
        var str = '';
        for (var i = 0; i <= ospan.length - 1; i++) {
            str += $(ospan[i]).val();
        }
        matching.init(items.find("span"),str);
        show("#js-choose");
    });        
    items.each(function(i){     
        var _this = $(this);
        _this.on("click", function(e) {
            var text = _this.find("span").text();
            for (var i = ospan.length - 1; i >= 0; i--) {
                var con = text.substr(i,1);
                $(ospan[i]).val(con);
            }
            $("#js-choose").hide();
         	// 匹配历史车牌
            hisList.removeClass('checked');
            hisList.each(function(i){     
                var _this = $(this);
                var str = _this.closest('tr').find("span.number").text();
                if (text==str) {
                    _this.addClass('checked');
                }
            });
            
        });
    });

    //选择历史记录车牌
    var hisList = $('.checkbox');
    hisList.each(function(i){     
        var _this = $(this);
        _this.on("click", function(e) {
            if(_this.hasClass('checked')){
                _this.removeClass('checked');
                ospan.val('');
            } else {
                hisList.removeClass('checked');
                _this.addClass('checked');

                var text = _this.closest('tr').find("span.number").text();
                for (var i = ospan.length - 1; i >= 0; i--) {
                    var con = text.substr(i,1);
                    $(ospan[i]).val(con);
                }
            }                
        });
    });

 	// 确定按钮
    $('#sureBrand').on('click', function(e){
 		var str = '';
 	   	for(var i = 0; i < ospan.length; i++) {
 		   if($(ospan[i]).val() == "" && i!=7) {
 			   $.promptDialog({
                    poptxt:'请输入完整的车牌号',
                });
                return;
 		   }else {
 			   str += $(ospan[i]).val();
 		   }
 	   	}
 	   confirmPay(str, $("#licenceType").val());
    });
 	
 	//确认支付
 	function confirmPay(carLicense, licenseType){
 		var data = {
 	 	   		carLicense:carLicense,
 	 	   		licenseType:licenseType
 	 	   	}
 	 	    $.promptDialog_wait("请稍后....")
 	 	   	$.post("${PATH}/weixin/main/isInPark.do",data,function(data) {
 	 	   		if(data.code == 200) {
 	 	   			window.location.href = "${PATH}/weixin/pay/init.do?carLicense=" + carLicense + "&licenseType=" + licenseType;
 	 	   		}else {
 	 	   			close_waitpop();
 		 	   		$.promptDialog({
 		                poptxt:data.msg
 		            });
 		 	   		return;
 	 	   		}
 	 	   	});
 	}
 	//分钟转小时
 	function minuteToHour(minute){
 		var hour = 0.0;
		if(minute != null && minute > 0){
			hour = (parseFloat(minute)/60).toFixed(1);
		}
 		return hour;
 	}
 	
</script>
	<div class="footerMenu">
   		<a class="active" href="${PATH}/weixin/main/init.do">停车缴费</a>
   		<a  href="${PATH}/weixin/record/init.do">记录查询</a>
   		<a  href="${PATH}/weixin/center/init.do">个人中心</a>
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
<script src="${PATH}/resource/weixin/js/main/main.js" type="text/javascript"></script>
<script src="${PATH}/resource/common/js/fastclick.js" type="text/javascript"></script>
</html>
