$(function() {
	$("#imInput").on({
        focus: function() {
            var i = $("#imInput").index(this);
            $("#imP").eq(0).css("visibility", "hidden")
        }
    })
    $("form").submit(function() {
        var nameval = $("#imInput").eq(0).val();
        var name = $("#imInput").eq(0).val().length;
        if (name == 0 ) {
            $("#imP").text("*金额不能为空！").css("visibility", "visible");
            return false;
        } else if (isNaN(nameval)) {
             $("#imP").text("*金额只能是数字").css("visibility", "visible");
            return false;
        } else {
            return true;
        }

    })

})