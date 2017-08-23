<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="PATH" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>车辆设置</title>
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
	<div class="page whitepage">
<input type="hidden" id="plateNoPrefixHidden" value="苏">
<input type="hidden" id="limitNumHidden" value="4">
   <div class="manapage">
       <div class="addBrand clearfix">
           <span>*最多可绑定4张车牌</span>
           <a class="addbtn" href="javascript:;"></a>
       </div>
       <ul class="brandList">
       </ul>
       <div class="enterWrap">
           <div class="bind">
               <div class="brand">
               	
					<select id="licenseType" class="t_choosetxt">	    	
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
                       <input type="text" maxlength="1" value="" readonly="readonly" placeholder="+">
                        -->
                   </div>
               </div>
           </div>
           <div class="btns clearfix">
               <a class="orangebtn submit-add fl" href="javascript:;">确定绑定</a>
               <a class="orangebtn brand-cancel fr" href="javascript:;">取消绑定</a>
           </div>
       </div> 
   </div> 
   <div class="openout"></div>     
   <!-- 弹窗-解绑车牌 -->
   <div class="fixcont" id="js-unbind">
       <div class="popflipper">
           <p class="p1">您确定要解绑车牌吗？</p>
           <p class="p2">解绑后不能使用任何的优惠券等优惠</p>
           <div class="btns clearfix">
               <a class="orangebtn cancelbtn fl" href="javascript:;">取消</a>
               <a class="greybtn deleteCar fr" href="javascript:;">确定</a>
           </div>
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
	<div class="footerMenu">
   		<a  href="${PATH}/weixin/main/init.do">停车缴费</a>
   		<a  href="${PATH}/weixin/record/init.do">记录查询</a>
   		<a class="active" href="${PATH}/weixin/center/init.do">个人中心</a>
	</div>
</div>
</body>
<script type="text/javascript">
	var contextPath = platform_URL + platform_basePath;
	$(function() {  
	    FastClick.attach(document.body);
	}); 
</script>
<script src="${PATH}/resource/weixin/js/main/dialog.js" type="text/javascript"></script>
<script src="${PATH}/resource/common/js/fastclick.js" type="text/javascript"></script>
</html>
<script type="text/javascript">


var loadLicenseInfoUrl = contextPath + "weixin/license/loadLicenseInfo.do?t="+new Date().getTime();
//加载用户车牌信息
$.ajax({
	url:loadLicenseInfoUrl,
	type:"POST",
	dataType:"JSON",
	async: false,
	success:function(res){
		if(res.code == '1'){
			var licenseInfo = res.licenseInfo;
			if(licenseInfo != null && licenseInfo.length != 0){
				for(var i=0;i<licenseInfo.length;i++){
					var temp = licenseInfo[i];
					$(".brandList").append(
						"<li class='clearfix'>" +
				            "<div class='brand'>" +
				            	"<div class='inner'>" +
				                    "<span>" + temp.carLicense + "</span>" +
				                "</div>" +
				            "</div>" +
				            "<a class='delete' data-id=" + temp.id + " href='javascript:;'></a>" +
				        "</li>");
				}
			}else{
				$(".brandList").after("<div class='manatips'></div>");
				$(".manatips").append("<p> 您尚未绑定车牌，请点击“+”按钮绑定车牌。</p>");
			}
		}else{
			poptxt:'数据加载失败，请至岗亭缴费！';
		}
	}
});


    var brandObj = $(".brandList"),
        tipObj = $(".manatips"),
        switchObj = $(".switch"),
        enterObj = $(".enterWrap"),
        inputs = $('#bindCar').find('input'),
        brandList = brandObj.find("li"); 
    
    fillPlatePrefix();
    
    // 点击+号按钮        
    var limitNum = $("#limitNumHidden").val();
        limitNum = parseInt(limitNum);
    $(".addbtn").on("click", function(e){
        if(brandList.length >= limitNum) {
            $.promptDialog({
                poptxt:'最多可绑定' + limitNum + '张车牌',
            });
            return;
        }
        brandObj.addClass('brandopen');
        switchObj.hide();
        tipObj.hide();
        enterObj.show().find('input').focus();            
    });
    // 点击取消按钮        
    $(".brand-cancel").on("click", function(e){
        inputs.val('');
        fillPlatePrefix();
        brandObj.removeClass('brandopen');
        switchObj.show();
        tipObj.show();
        enterObj.hide();            
    });
    // 点击提交按钮
    $(".submit-add").on("click", function(e){
        var arr = [];
        for (var i = 0; i < inputs.length; i++) {
            arr.push($(inputs[i]).val());
        }
        var text = arr.join("");
        var str = text.substring(0, 2)+" " +text.substring(2);
        if(text.length < 7){
            $.promptDialog({
                poptxt:'输入正确的车牌号',
            });
            return;
        }          
        var data = {
        	'carLicense': text,
        	'licenseType' : $("#licenseType").val()
        }
        var addLicenseUrl = contextPath + "weixin/license/addLicense.do?t="+new Date().getTime();
        $.post(addLicenseUrl, data, function(returnData){
        	if(returnData.code == '1') {
        		window.location.reload();
        	}else {
        		$.promptDialog({poptxt: returnData.message});
        	}
        });
    });

    // 解除绑定
    var obj;
    var bindId;
    $(".delete").on("click", function(e){
        obj = $(this);
        bindId = $(this).data("id");
        show("#js-unbind");
    });
    
    var deleteLicenseUrl =  contextPath + "weixin/license/deleteLicense.do?t="+new Date().getTime();
    $(".deleteCar").on("click", function(e){
    	$.post(deleteLicenseUrl, {id: bindId}, function(returnData){
    		if(returnData.code == '1') {
    			window.location.reload();
    		}else {
        		$.promptDialog({poptxt: returnData.message});
        	}
    	});
    });

	//	车牌前缀
    function fillPlatePrefix() {
    	var plateNoPrefix = $("#plateNoPrefixHidden").val();
    	if(plateNoPrefix != "") {
    		for(var i = 0; i < plateNoPrefix.length; i++) {
    			$("#bindCar input").eq(i).val(plateNoPrefix[i]);
    		}
    	}
    }
</script>