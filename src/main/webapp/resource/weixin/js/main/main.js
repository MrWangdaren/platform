//获取最大值
Array.prototype.max = function() {
    return Math.max.apply(null, this);
};
// 缴费窗口
var paymentBox = {
	couponsListObj: $(".coupons").find("p").on('click', function(e){  // 用户拥有的优惠券列表
		var _this = $(this);
		var checkSpan = _this.find("span");
		if (checkSpan.hasClass("checked")) {
			checkSpan.removeClass("checked");
			paymentBox.isUseCoupon = false;
			paymentBox.useCoupon = -1;
		} else {
			paymentBox.isUseCoupon = true;
			paymentBox.useCoupon = paymentBox.couponsListObj.index(_this); 
		}
		paymentBox.isUseIntergral = true;
		paymentBox.useIntergral = 0;
		paymentBox.render();
	}), 	
	useIntergralObj: $('#cancel-integral').on('click', function(e){   //选择是否使用积分
		var _this = $(this);
		_this.toggleClass("checked");
		// 判断是否选择的有优惠券
		paymentBox.isUseCoupon = (paymentBox.couponsListObj.find("span").filter('.checked').length > 0)
		paymentBox.isUseIntergral = $(this).hasClass("checked");		
		paymentBox.render();
	}),	
	minusObj: $('.minus').on('click', function(e){  //减积分
		if(paymentBox.useIntergral <= 0) {
			paymentBox.useIntergral = 0;
			return false;
		} else {
			paymentBox.useIntergral -= parseInt(paymentBox.needIntergral);
			if (paymentBox.useIntergral <= 0) {
				paymentBox.isUseIntergral = false;
			}
			paymentBox.render();
		}
	}),
	plusObj: $('.plus').on('click', function(e){  //加积分
		// 如果当前支付金额小于1元，或者使用的积分已是用户最大积分
		if (paymentBox.mustPay < 1 || paymentBox.useIntergral >= paymentBox.totalIntergral) {
			return false;
		} else {
			var currentTotalIntergral = paymentBox.totalIntergral - paymentBox.useIntergral;
			if(currentTotalIntergral < paymentBox.needIntergral) {
				return false;
			} else {
				paymentBox.useIntergral += parseInt(paymentBox.needIntergral);
			}
			
			if (paymentBox.useIntergral >= 0) {
				paymentBox.isUseIntergral = true;
				if (paymentBox.useIntergral > paymentBox.totalIntergral) {
					paymentBox.useIntergral = paymentBox.totalIntergral;
				}
			}
			paymentBox.render();
		}
	}),
	currentObj: $('.current').find('i'), // 当前总积分
	totalPay: 0, // 总金额
	totalIntergral: 0, // 总积分
	mustPay: 0, // 最终缴费金额
	isUseCoupon: true, // 是否使用优惠券
	useCoupon: -1, //最终使用的优惠券
	isUseIntergral: true, // 是否使用积分
	needIntergral: 100, // 1元抵扣的积分数量
	useIntergral: 0, // 最终使用的积分数量
	couponPay: 0,  // 兑换的优惠券金额
	couponArr: [], // 优惠券数组
	convertCouponData: function(){ // 优惠券列表转换为数组
		for (var i = 0; i < this.couponsListObj.length; i++) {
			this.couponArr[i] = parseFloat( this.couponsListObj.eq(i).find(".amount").text())
		};
	}, 
	getBestCoupon: function(paymoney) { // 获取最优惠的优惠券
		// 如果待付金额不正确则直接返回
		if (paymoney <= 0) {
			return -1;
		}

		// 如果优惠券金额都小于总金额则返回优惠券最大金额的
		var max = this.couponArr.max();
		if (max <= paymoney) {
			return this.couponArr.indexOf(max);
		}

		// 选择优惠金额大于待支付的金额，但超出最少的
		var min = max;
		var diff = 0;
		var index = -1;
		for (var i = 0; i < this.couponArr.length; i++) {
	    	diff = this.couponArr[i] - paymoney; 
	    	if(diff >= 0 && diff <= min) {
	            index = i;
	            min = diff;
	        }
	    }

	    return index
	}, 
	getIntergral: function(paymoney, needIntergral) {// 获取需要扣除的积分信息
		totalIntergral = parseInt(this.totalIntergral/needIntergral);
		// needIntergral积分是1块钱
		return Math.min(totalIntergral, paymoney)*needIntergral
	},
	init: function(totalIntergral, totalPay, needIntergral) {
		// 缴费总金额
		this.totalPay = totalPay;
		$('.cost').text(totalPay);
		$('.money-total').text(totalPay);

		// 当前总积分
		this.totalIntergral = totalIntergral;
		if(this.totalIntergral<=0) {
			this.totalIntergral = 0;
		}
		paymentBox.currentObj.text(totalIntergral);
		

		// 默认最终缴费金额就是总缴费金额
		this.mustPay = this.totalPay;
		this.needIntergral = needIntergral;

		// 如果兑换比例为0，则不使用积分
		if(this.needIntergral <= 0) {
			this.isUseIntergral = false;
			$('dl.integer').hide();
		}

		this.render();
	},
	render: function() {
		// 默认付款等于总付款
		this.mustPay = this.totalPay;

		this.couponsListObj.find("span").removeClass("checked");
		// 如果使用优惠券
		if (this.isUseCoupon) {
			// 如果没有传入要使用的优惠券，则选择一个最合理的优惠券
			if (this.useCoupon < 0) {
				this.useCoupon = this.getBestCoupon(this.totalPay);
				// 最佳优惠券排在第一个
				var cur = paymentBox.couponsListObj.eq(this.useCoupon)
				var original = paymentBox.couponsListObj.eq(0)
				// cur.insertBefore(original)
			}

			if (this.useCoupon >= 0) {
				// 首先根据要付费金额获取优惠券
				this.couponPay = this.couponArr[this.useCoupon];
				// 显示选中的优惠券
				this.couponsListObj.find("span").eq(this.useCoupon).addClass("checked");
			}
		} else {
			this.couponPay = 0;
		}		
		this.mustPay = this.totalPay - this.couponPay;
		$(".money-coupon").text(this.couponPay.toFixed(2));

		// 如果剩余缴费金额大于0则判断是否可以使用积分
		if (this.isUseIntergral && this.mustPay > 0) {
			if (this.useIntergral <= 0) {
				// 使用的积分数量
				this.useIntergral = this.getIntergral(parseInt(this.mustPay), this.needIntergral);
			}
		} else {
			this.useIntergral = 0;
		}

		if (this.useIntergral > 0) {
			this.useIntergralObj.addClass("checked");
		} else {
			this.useIntergralObj.removeClass("checked");
		}

		if(this.needIntergral == 0) { // 如果兑换比例为0，则不使用积分
			var intergralSale = 0;
		} else {
			var intergralSale = this.useIntergral/this.needIntergral;
		}		

		// 计算还需缴费金额
		this.mustPay = this.mustPay - intergralSale;
		
		// 显示使用的积分
		$('.number-integer').text(paymentBox.useIntergral.toFixed(0));
		$('.money-integer').text(intergralSale.toFixed(2));
		// 当前剩余总积分
		paymentBox.currentObj.text(this.totalIntergral - this.useIntergral);

		var sale = this.totalPay - this.mustPay;

		// 如果最终缴费金额小于0，则为0
		if (this.mustPay < 0) {
			this.mustPay = 0;
		}

		// 实际支付金额
		$(".money-need").text(this.mustPay.toFixed(2));
	}
}
paymentBox.convertCouponData();
