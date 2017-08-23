//弹出层-2s关闭
$.promptDialog = function(settings){
	var defaults = {
		poptxt:'',
		time:2,
		img:false		
	};
	settings = $.extend(defaults, settings);
	var starWheel={
		//初始化
		innt:function(){
			this.clickPop();
		},
		creatElementDiv:function(){
			if(settings.img==true){
				var creatDiv = $("<div class='sentdiv'><img src='../../img/yellowright.png' style='width: 17%;display: block;margin: -5% auto 12px;'>"+settings.poptxt+"</div>");
			}
			else{
				var creatDiv = $("<div class='sentdiv'>"+settings.poptxt+"</div>");
			}
			return creatDiv;
		},
		//弹出层
		clickPop:function(){
			$("body").append(this.creatElementDiv());
			this.clickClose();	
		},
		//关闭层
		clickClose:function(){
			var _this=this;
			setTimeout(function(){
				$("."+_this.creatElementDiv().attr("class")).remove();
			},settings.time*1000);
		}
	}
	starWheel.innt();		
}
//弹出层-等待
$.promptDialog_wait = function(settings){
	var starWheel={
		//初始化
		innt:function(){
			this.clickPop();
		},
		creatElementDiv:function(){
			var creatDiv = $("<div class='fixcont1'><div class='sentdiv1'><p>" + settings +"</p><img src='" + contextPath + "/resource/weixin/img/loading_big.gif'></div></div>");
			return creatDiv;
		},
		//弹出层
		clickPop:function(){
			$("body").append(this.creatElementDiv());
		}
	}
	starWheel.innt();		
}
//弹出层-带关闭
$.promptDialog_close = function(settings){
	var starWheel={
		//初始化
		innt:function(){
			this.clickPop();
		},
		creatElementDiv:function(){
			var creatDiv = $("<div class='fixcont2'><div class='sentdiv2'><div class='clearfix'><button class='close_pop'>×</button></div><p>"+settings+"</p></div></div>");
			return creatDiv;
		},
		//弹出层
		clickPop:function(){
			$("body").append(this.creatElementDiv())
		},
		//关闭层
		clickClose:function(){
			var _this=this;			
			$("."+_this.creatElementDiv().attr("class")).remove();
		}
	}
	starWheel.innt();
}
//弹出层-带确定，取消
$.promptDialog_coop = function(settings,func,par){
	var starWheel={
		//初始化
		innt:function(){
			this.clickPop();
		},
		creatElementDiv:function(){
			var creatDiv = $("<div class='fixcont3'><div class='sentdiv3'>"+settings+"<p><button class='btn-sure'>确定</button><button class='btn-cancel'>取消</button></p></div></div>");
			return creatDiv;
		},
		//弹出层
		clickPop:function(){
			$("body").append(this.creatElementDiv());
		},
		//关闭层
		clickClose:function(){
			var _this=this;			
			$("."+_this.creatElementDiv().attr("class")).remove();
		}
	}
	starWheel.innt();

	$(".btn-sure").on("click", function(){
		if (func) {
			func(par);
		}
		starWheel.clickClose();
	});
	
}
//滚动加载更多
$.scrollLoadMore = function(settings){
	var defaults = {
		obj:".tablist",
		url : "",
		data :"data",
		success : "",
	};
	settings = $.extend(defaults, settings);
	var starWheel={
		//公共属性
		creatDiv : $("<div class='loadmore'>"+"<i></i><span>加载更多...</span>"+"</div>"),
		iNum:2,
		state:true,
		//初始化
		innt:function(){
			this.scrollMore();
			this.backTop();
		},
		//滚动到底部
		scrollMore:function(){
			var That=this;
			That.creatDiv.css({
				"text-align":"center",
				"width":"100%",
				"height":"30px",
				"clear":"both",
				"font-size":"1.2rem"
			})
			if(parseInt($(settings.obj).attr("maxpage"))!=1){
				$(settings.obj).append(That.creatDiv);
				$(window).on("scroll",function(){
					var scrollTop = $(this).scrollTop();
					var scrollHeight = $(document).height();
					var windowHeight =  $(this).height();
					if(scrollTop>200){
						$(".backtop").show();
					}
					else{
						$(".backtop").hide()
					}
					if (scrollTop + windowHeight >= scrollHeight) {//页面滚动至底部下拉加载更多
						if(That.state){	
							if(!That.ifEndPage()){
								setTimeout(function(){
									That.creatDiv.html("<i></i><span>努力加载中，请稍后...</span>");
								},400);
								setTimeout(function(){
									That.ajaxJoinHtml();
								},600);
							}
						}
					}
				})
			}
		},	
		//回到顶部
		backTop:function(){
			var backtopDiv = $("<div class='backtop'></div>");
			$(".page").append(backtopDiv);
			backtopDiv.on("click",function() {
				$('body,html').animate({ scrollTop: 0 }, "fast",function(){
					backtopDiv.hide();
				});
				return false;	
			});
		},
		//ajax请求加载更多数据
		ajaxJoinHtml:function(){
			var that=this;
			var oUrl;
			if(settings.url.indexOf("?")>0){
				oUrl=settings.url+"&"+"pageNo="+that.iNum
			}
			else{
				oUrl=settings.url+"?"+"pageNo="+that.iNum
			}
			$.ajax({
				url : oUrl,
				data :"data",
				type : "post",
				dataType : "json",
				success : function(idata){
					that.sucessfn(idata);
				},
			});
		},
		sucessfn:function(idata){
			var dom=$(idata.data.data);
			if(parseInt($(settings.obj).attr("maxpage"))==2){
				this.state=false;
				this.creatDiv.before(dom);
				this.creatDiv.html("已经到了最后一页");
				$.promptDialog({
					poptxt:'已经到了最后一页',
				})
			}
			else{
				this.creatDiv.before(dom);
				this.creatDiv.html("<i></i><span>加载更多...</span>");
				this.iNum++;	
			}
			if(typeof(settings.success)=="function"){
				settings.success(idata);
			}
		},
		ifEndPage:function(){
			if(this.iNum>parseInt($(settings.obj).attr("maxpage"))){
				this.creatDiv.html("已经到了最后一页");
				this.iNum=parseInt($(settings.obj).attr("maxpage"))
				$.promptDialog({
					poptxt:'已经到了最后一页',
				})
				this.state=false;
				return true;
			}
			
			else{
				return false;
			}
		},
	}
	starWheel.innt();
}
//关闭等待弹窗
var close_waitpop = function(){
	$(".fixcont1").hide();
}
// 弹窗，显示隐藏
var show = function(obj){	
	$(".fixcont").hide();
	$(obj).show();
}
// 匹配目标项
var matching = {
	itemsArr: [],  //类目列表数组
	currentIndex: -1,  // 匹配到的索引值数组
	convertItems: function(items){ // 所有排列的类目转换为数组
        for (var i = 0; i < items.length; i++) {
            matching.itemsArr[i] = items.eq(i).text();
        }
    },
    init: function(items, str) {
    	matching.convertItems(items);
		matching.currentIndex = -1;
    	for (var i = 0;i<=matching.itemsArr.length - 1;i++) {
    		if (matching.itemsArr[i] == str) {
    			matching.currentIndex = i;
    			break;
    		}
    	}
    	items.parent().removeClass("cur");
    	if(matching.currentIndex >= 0){
    		items.eq(matching.currentIndex).parent().addClass("cur");
    	}
    }
}
//判断输入框是否为空
function inputNull(obj){
	if($(obj).val()==""||$(obj).val()==null){
		return true;
	}
	else{
		return false;	
	}
}

// 软键盘
var keyBox = {
	$brand: $('.brand'),
	chineseObj: $("#key-chinese"),  // 文字键盘
	charactersObj: $("#key-characters"), // 数字键盘
	numberLi: $('li.numberLi'), // 数字键
	letterLi: $('li.letterLi'), // 字母键
	specialLi: $('li.specialLi'), // 新能源键
	current: 0, // 当前点击的输入框
	ospan: $("#bindCar").find("input").on('click', function(e){ // 点击输入框
		e.stopPropagation();

		var $this = $(this),
			$index = $this.index();
		
		keyBox.ospan.removeClass('active');
		$this.addClass('active');

		keyBox.current = $index;
		keyBox.chenckIndex();
	}),
	chineseKey: $("#key-chinese").find('span.keys').bind({ // 点击文字键盘
		touchstart: function(e){
			e.stopPropagation();
			if (keyBox.current > keyBox.ospan.length - 1) {
				return false;
			}
			$(this).addClass('active');
		},
		touchend: function(e){
			e.stopPropagation();
			if (keyBox.current > keyBox.ospan.length - 1) {
				return false;
			}

			var $this = $(this),
				text = $this.text();

			keyBox.ospan.removeClass('active');
			keyBox.ospan.eq(0).val(text);
			keyBox.ospan.eq(1).addClass('active');

			$this.removeClass('active');
			keyBox.chineseObj.hide();
			keyBox.charactersObj.show();

			keyBox.current++;
			keyBox.chenckIndex();
			console.log(keyBox.current);
		},
		click: function(e){
			e.stopPropagation();
		}
	}),
	charactersKey: $("#key-characters").find('span.keys').bind({ //点击字符键盘
		touchstart: function(e){
			e.stopPropagation();
			if (keyBox.current > keyBox.ospan.length) {
				return false;
			}
			$(this).addClass('active');
		},
		touchend: function(e){
			e.stopPropagation();
			if (keyBox.current > keyBox.ospan.length) {
				return false;
			}

			var $this = $(this),
				text = $this.text();

			$this.removeClass('active');

			keyBox.ospan.eq(keyBox.current).val(text);
			keyBox.ospan.removeClass('active');
			keyBox.ospan.eq(keyBox.current+1).addClass('active');

			if(keyBox.current != keyBox.ospan.length){
				keyBox.current++;
			}
			keyBox.chenckIndex();
			console.log(keyBox.current);
		},
		click: function(e){
			e.stopPropagation();
		}
	}),
	clearBtn: $(".keybox .clearBtn").on("click",function(e){     //清除按钮
		e.stopPropagation();

		for (var i = 0; i <= keyBox.ospan.length - 1; i++) {
			keyBox.ospan.eq(i).val('');
        }
        keyBox.ospan.removeClass('active');
        keyBox.ospan.eq(0).addClass('active');

		keyBox.charactersObj.hide();
		keyBox.chineseObj.show();

		keyBox.current = 0;
		keyBox.chenckIndex();
	}),
	undo: $(".keybox .undo").on("click",function(e){     //撤销按钮	
		e.stopPropagation();
		
		if (keyBox.current <= 0) {
			return false;
		}

		keyBox.current--;
		keyBox.ospan.eq(keyBox.current).val('');
		keyBox.ospan.removeClass('active');
		keyBox.ospan.eq(keyBox.current).addClass('active');
		
		keyBox.chenckIndex();
		console.log(keyBox.current);
	}),
	chenckIndex: function(){
		if (keyBox.current == 0) {
			keyBox.chineseObj.show();
			keyBox.charactersObj.hide();
		} else {
			keyBox.chineseObj.hide();
			keyBox.charactersObj.show();
		}

		if (keyBox.current == 1) {
			keyBox.numberLi.each(function(){
				var that = $(this);
				that.find('.keys').addClass('keys-disabled');
				$('<span class="disabled"></span>').on('click', function(e){
					e.stopPropagation();
				}).appendTo(that);
			});

			keyBox.specialLi.each(function(){
				var that = $(this);
				that.find('.keys').addClass('keys-disabled');
				$('<span class="disabled"></span>').on('click', function(e){
					e.stopPropagation();
				}).appendTo(that);
			});
		}
		if (keyBox.current >= 2 && keyBox.current <= 5) {
			keyBox.numberLi.each(function(){
				var that = $(this);
				that.find('.keys').removeClass('keys-disabled');
				that.find('.disabled').remove();
			});

			keyBox.specialLi.each(function(){
				var that = $(this);
				that.find('.keys').addClass('keys-disabled');
				$('<span class="disabled"></span>').on('click', function(e){
					e.stopPropagation();
				}).appendTo(that);
			});
		}
		if (keyBox.current >= 6) {
			keyBox.numberLi.each(function(){
				var that = $(this);
				that.find('.keys').removeClass('keys-disabled');
				that.find('.disabled').remove();
			});

			keyBox.specialLi.each(function(){
				var that = $(this);
				that.find('.keys').removeClass('keys-disabled');
				that.find('.disabled').remove();
			});
		}
	},
	init: function(){
		// 根据输入框个数调节样式
		if(keyBox.ospan.length == 8){
			keyBox.$brand.addClass('brand-long');
		} else {
			keyBox.$brand.removeClass('brand-long');
		}

		//点击屏幕任意地方隐藏键盘
		$("body").on('click',function(e){
			keyBox.charactersObj.hide();
			keyBox.chineseObj.hide();
			keyBox.ospan.removeClass('active');
		});
	}
}

$(function(){
	// 刷新按钮
	$(".fresh").on("touchstart",function(e){
		window.location.href=window.location.href;
	});
	// 弹窗操作
	$("#rule").on("touchstart", function(e){show("#js-rule");});
	$(".close").on("touchstart", function(e){$(".fixcont").hide();return false;});
	$(".cancelbtn").on("touchstart", function(e){$(".fixcont").hide();return false;});
	$("body").on('touchstart', '.close_pop', function(e){$(".fixcont2").hide();return false;});
	$("body").on('touchstart', '.btn-cancel', function(e){$(".fixcont3").hide();return false;});
	$(".smallImg").on("touchstart", function(e){show("#js-big");});
    $("#js-big").on("touchstart", function(e){$(".fixcont").hide();return false;});

	// 软键盘
	keyBox.init();

	// ios readonly失效
	$('input[readonly]').focus(function(){
        console.log('ok');
        $(this).blur();
        document.activeElement.blur();
    });
});