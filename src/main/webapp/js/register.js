$(function() {
	var smsNum = "";
	$("h3 input")
			.on(
					{
						blur : function() {
							var i = $("h3 input").index(this);
							var vals = $("h3 input").eq(i).val().replace(
									/\s+/g, "");
							var len = $("h3 input").eq(i).val().replace(/\s+/g,
									"").length;

							if (i ==1) {
								if (isNaN(vals)) {
									$("h4").eq(0).text("*账户名称只能是数字").css(
											"visibility", "visible");
								}
								if (len == 0) {
									$("h4").eq(0).text("*账户名称不能为空").css(
											"visibility", "visible");
								} else if (len != 11) {
									$("h4").eq(0).text("*有效长度在为11位").css(
											"visibility", "visible");
								} else {
									$("h3 input").eq(i).val(vals)
									$("h4").eq(0).css("visibility", "hidden");
								}
							}
							if (i == 2) {
								if (isNaN(vals)) {
									$("h4").eq(1).text("*验证码只能是数字").css(
											"visibility", "visible");
								}
								if (len == 0) {
									$("h4").eq(1).text("*验证码不能为空").css(
											"visibility", "visible");
								} else if (len != 6) {
									$("h4").eq(1).text("*有效长度为6位").css(
											"visibility", "visible");
								} else {
									$("h3 input").eq(i).val(vals)
									$("h4").eq(1).css("visibility", "hidden");
								}
							}
							if (i == 3) {
								if (len == 0) {
									$("h4").eq(2).text("*密码不能为空").css(
											"visibility", "visible");
								} else if (len < 6 || len > 20 && len != 0) {
									$("h4").eq(2).text("*有效长度在6~20之间").css(
											"visibility", "visible");
								} else {
									$("h3 input").eq(i).val(vals);
									$("h4").eq(2).css("visibility", "hidden");
								}
							}
							if (i == 4) {
								var a = $("h3 input").eq(3).val(), b = $(
										"h3 input").eq(4).val();
								if (len == 0) {
									$("h4").eq(3).text("*重复密码不能为空").css(
											"visibility", "visible");
								} else if (a != b) {
									$("h4").eq(3).text("*两次输入密码不一致").css(
											"visibility", "visible");
								} else {
									$("h4").eq(3).css("visibility", "hidden");
								}
							}
						},
						focus : function() {
							var i = $("h3 input").index(this);
							$("h4").eq(i).css("visibility", "hidden")
						}
					})
	$("form").submit(function() {
		var nameval = $("h3 input").eq(1).val();
		var name = $("h3 input").eq(1).val().length;
		var sms = $("h3 input").eq(2).val();

		var password = $("h3 input").eq(3).val();

		if (smsNum.length == 0) {
			$("h4").eq(1).text("*请先获取验证码").css("visibility", "visible");
		}
		if (name == 0 && password.length == 0) {
			$("h4").eq(0).text("*账号不能为空！").css("visibility", "visible");
			$("h4").eq(2).text("*密码不能为空！").css("visibility", "visible");
			return false;
		} else if (name != 11) {
			$("h4").eq(0).text("*账号长度为11位！").css("visibility", "visible");
			return false;
		} else if (isNaN(nameval)) {
			$("h4").eq(0).text("*账户名称只能是数字").css("visibility", "visible");
			return false;
		} else if (sms.length == 0) {
			$("h4").eq(1).text("*验证码不能为空").css("visibility", "visible");
			return false;
		} else if (isNaN(sms)) {
			$("h4").eq(1).text("*验证码只能是数字").css("visibility", "visible");
			return false;
		} else if (sms.length != 6) {
			$("h4").eq(1).text("*验证码为六位数字").css("visibility", "visible");
			return false;
		} else if (sms != smsNum) {
			$("h4").eq(1).text("*验证码输入有误").css("visibility", "visible");
			return false;
		} else if (password.length < 6 || password.length > 20) {
			$("h4").eq(2).text("*密码有效长度在6~20之间").css("visibility", "visible");
			return false;
		} else if (password != repassword) {
			$("h4").eq(3).text("*两次输入密码不一致！").css("visibility", "visible");
			return false;
		} else {
			return true;
		}

	})

	$("#myRegister").click(function() {
		var phone = $("#userPhone").eq(0).val().replace(/\s+/g, "");
		;
		if(phone.length==0){
			$("h4").eq(0).text("*账号不能为空！").css("visibility", "visible");
			return;
		} else if(phone.length!=11){
			$("h4").eq(0).text("*账号为11位！").css("visibility", "visible");
			return;
		} else if(isNaN(phone)){
			$("h4").eq(0).text("*账号只能是数字！").css("visibility", "visible");
			return;
		}
		$.ajax({
			type : "GET",
			url : "sendSms",
			data : "phone=" + phone,
			success : function(random) {
				smsNum = random;
			}
		})

	})

})