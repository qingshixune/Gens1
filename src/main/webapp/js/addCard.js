$(function() {
    $("#imMoney").on({
        blur: function() {
            var i = $("#imMoney").index(this);
            var vals = $("#imMoney").eq(i).val();
            var len = $("#imMoney").eq(i).val().length;

            if (i == 0) {
                if (isNaN(vals)) {
                    $("#imP").eq(0).text("*银行卡号只能是数字").css("visibility", "visible");
                }
                if (len == 0) {
                    $("#imP").eq(0).text("*银行卡号不能为空").css("visibility", "visible");
                } else if (len != 19) {
                    $("#imP").eq(0).text("*有效长度为19位").css("visibility", "visible");
                }
            }

        },
        focus: function() {
            var i = $("#imMoney").index(this);
            $("#imP").eq(i).css("visibility", "hidden")
        }
    })
    $("form").submit(function() {
        var nameval = $("#imMoney").eq(0).val();
        var name = $("#imMoney").eq(0).val().length;
        var password = $("#imMoney").eq(1).val();

        if (name == 0 ) {
            $("#imP").eq(0).text("*银行卡号不能为空！").css("visibility", "visible");
            return false;
        } else if (name != 19) {
            $("#imP").eq(0).text("*卡号有效长度为19位！").css("visibility", "visible");
            return false;
        } else if (isNaN(nameval)) {
            $("#imP").eq(0).text("*银行卡号只能是数字").css("visibility", "visible");
            return false;
        }  else {
            return true;
        }

    })

})