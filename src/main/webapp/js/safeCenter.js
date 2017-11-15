$(function() {
    $(".imInput").on({
            blur: function() {
                var i = $(".imInput").index(this);
                var vals = $(".imInput").eq(i).val().replace(
                    /\s+/g, "");
                var len = $(".imInput").eq(i).val().replace(/\s+/g,
                    "").length;
                if (i == 0) {
                    if (len == 0) {
                        $(".imSpan").eq(0).text("*姓名不能为空").css(
                            "visibility", "visible");
                    }  else {
                        $(".imInput").eq(i).val(vals);
                    }
                }
                if (i == 1) {
                    if (len == 0) {
                        $(".imSpan").eq(1).text("*ID不能为空").css(
                            "visibility", "visible");
                    } else if (len != 18) {
                        $(".imSpan").eq(1).text("*有效长度为18位").css(
                            "visibility", "visible");
                    } else {
                        $(".imInput").eq(i).val(vals);
                    }
                }
                if (i == 2) {
                	if (isNaN(vals)) {
                        $(".imSpan").eq(2).text("*支付密码只能是数字").css(
                            "visibility", "visible");
                    }
                    if (len == 0) {
                        $(".imSpan").eq(2).text("*支付密码不能为空").css(
                            "visibility", "visible");
                    } else if (len != 6) {
                        $(".imSpan").eq(4).text("*有效长度为6位").css(
                            "visibility", "visible");
                    } else {
                        $(".imInput").eq(i).val(vals);
                    }
                }
            },
            focus: function() {
                var i = $(".imInput").index(this);
                $(".imSpan").eq(i).css("visibility", "hidden")
            }
        })
    $("form").submit(function() {
        var nameval = $(".imInput").eq(0).val().replace(/\s+/g, "");
        var name = $(".imInput").eq(0).val().replace(/\s+/g, "").length;
        var idNum = $(".imInput").eq(1).val().replace(/\s+/g, "");
        var income = $(".imInput").eq(2).val().replace(/\s+/g, "");
       
        if (name == 0 && idNum.length == 0&&income.length == 0) {
            $(".imSpan").eq(0).text("*姓名不能为空").css("visibility", "visible");
            $(".imSpan").eq(1).text("*ID号码不能为空").css("visibility", "visible");
            $(".imSpan").eq(2).text("*支付密码不能为空").css("visibility", "visible");
            return false;
        } else if (idNum.length!= 18) {
            $(".imSpan").eq(0).text("*ID长度为11位！").css("visibility", "visible");
            return false;
        } else if (!isNaN(name)) {
        	$(".imSpan").eq(0).text("*姓名不包含数字").css("visibility", "visible");
          
            return false;
        } else if (idNum.length!=18) {
           $(".imSpan").eq(1).text("*有效长度为18位").css("visibility", "visible");
            return false;
        } else if (address.length==0) {
            $(".imSpan").eq(3).text("*地址不能为空").css("visibility", "visible");
            return false;
        } else if (income.length==0) {
           $(".imSpan").eq(2).text("*支付密码不能为空").css("visibility", "visible");
            return false;
        } else if (isNaN(income)) {
            $(".imSpan").eq(2).text("*支付密码只能是数字").css("visibility", "visible");
            return false;
        }else {
            $(".imInput").eq(0).val(nameval);
            $(".imInput").eq(1).val(idNum);
            $(".imInput").eq(2).val(income);
            return true;
        }

    })

})