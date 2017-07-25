$(function(){
	getCode();
	
	
	
	function onBridgeReady(param) {
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
//                    alert(res.err_msg);
                    // 使用以上方式判断前端返回,微信团队郑重提示：res.err_msg将在用户支付成功后返回    ok，但并不保证它绝对可靠。
                    if (res.err_msg == 'get_brand_wcpay_request:ok') {
                        alert("支付成功");
                    }else if(res.err_msg == 'get_brand_wcpay_request:cancel'){
                        alert("取消支付");
                    }else{
                        alert("支付失败");
                    }
                }
        );
    }

    $("#payAction").click(function(){
        var openId = $("#openId").val();

        $.post('/platform/weixin/pay/doPay.do', {openId: openId}, function (ret) {
            if (ret.code == 0){
                console.log(ret);
                if (typeof WeixinJSBridge == "undefined"){
                    if( document.addEventListener ){
                        document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
                    }else if (document.attachEvent){
                        document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
                        document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
                    }
                }else{
                    var param = ret.param;
                    onBridgeReady(param);
                }
            }else{
                alert(ret.msg);
            }
        });

    });
	
})


function getCode(){
	var code = document.getElementById("code").value;  
	var data={'code':code};
	$.post("http://wylsr.imwork.net/platform/weixin/pay/getCode.do",data,function(result){
		if(result.code != null && result.code == "1"){
			$("#openId").val(result.openId);
		}else{
			alert(result.message);
		}
	});
}
