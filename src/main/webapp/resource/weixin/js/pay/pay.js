$(function(){
	getCode();
	
	
})


function getCode(){
	var code = document.getElementById("code").value;  
	var data={'code':code};
	$.post("http://wylsr.imwork.net/platform/weixin/pay/getCode.do",data,function(result){
		if(result.code != null && result.code == "1"){
			$("#openId").val(result.openId);
		}else{
			$.promptDialog({poptxt:result.message});
		}
	});
}


function onBridgeReady(param) {
	try {
        WeixinJSBridge.invoke(
                'getBrandWCPayRequest', {
                    "appId": param.appId,     //公众号名称，由商户传入
                    "timeStamp": param.timeStamp,         //时间戳，自1970年以来的秒数
                    "nonceStr": param.nonceStr, //随机串
                    "package": param.package,
                    "signType": param.signType,         //微信签名方式:
                    "paySign": param.paySign    //微信签名
                },
                function (res) {
                	alert(res.err_msg);
                    // 使用以上方式判断前端返回,微信团队郑重提示：res.err_msg将在用户支付成功后返回    ok，但并不保证它绝对可靠。
                    if (res.err_msg == 'get_brand_wcpay_request:ok') {
                        $.promptDialog({poptxt: "支付成功"});
                        getOrderPayStatus(param.outTradeNo);
                    }else if(res.err_msg == 'get_brand_wcpay_request:cancel'){
                    	$.promptDialog({poptxt: "您已经取消微信支付!-----"});
 		        	   	isDisabled( $("#payAction"),false); 
                    }else{
                    	$.promptDialog({poptxt: "支付失败"});
                    }
                }
        );
    }catch(e){
		$.promptDialog({poptxt: e.description});
	}
}

function getOrderPayStatus(outTradeNo){
	var isSuc = false;
	var count = 0;
	while(count<3){
		$.ajax({
			type : "post",
			url : "http://wylsr.imwork.net/platform/weixin/pay/queryOrder.do",
			data : {outTradeNo: outTradeNo},
			async : false,
			success : function(data){
				if(data.resultCode=="SUCCESS") {
		  			window.location.href="http://wylsr.imwork.net/platform/weixin/pay/payOk.do?outTradeNo="+outTradeNo;
		  			isSuc = true;
		  			count=3;//停止循环
		  		}
			},
			error: function(data) {
				$.promptDialog({poptxt: data});
			}
	    });
		count++;
	}
	return isSuc;
}
