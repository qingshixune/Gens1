<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>管理员登录系统</title>
	<link rel="stylesheet" type="text/css" href="css/AdminLogin.css">
	<script type="text/javascript" src="js/adminLogin.js"></script>
	<script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
	<script>
	$(function(){
	
	            $("input").on({
	                blur:function(){ 
	                    var i = $("input").index(this);
	                    var vals = $("input").eq(i).val();
	                    var len = $("input").eq(i).val().length;
	                        if(i==0){
	                            if(len==0){
	                                $("span").eq(0).text("*账户名不能为空").css("visibility","visible");
	                                return false;
	                        }
	                       }
	                        if(i==1){
	                           if(len==0){
	                               $("span").eq(1).text("*密码不能为空").css("visibility","visible");
	                               return false;
	                           }else if(len<6||len>20&&len!=0){
	                               $("span").eq(1).text("*有效长度在6~20之间").css("visibility","visible");
	                               return false;
	                           }
	                       }
	                  
	              },focus:function(){var i = $("input").index(this);
	                     $("span").eq(i).css("visibility","hidden")}
	            })
	            $("form").submit(function(){
	                var nameval = $(" input").eq(0).val();
	                var name=$(" input").eq(0).val().length;
	                var password=$("input").eq(1).val();

	                if(name==0&&password.length==0){
	                    $("span").eq(0).text("*账号不能为空！").css("visibility","visible");
	                    $("span").eq(1).text("*密码不能为空！").css("visibility","visible");
	                    return false;
	                }else if(password.length<6||password.length>20){
	                    $("span").eq(1).text("*密码有效长度在6~20之间").css("visibility","visible");
	                    return false;
	                }else{
	                    return true;
	                }

	            });
	})
	    
	
	</script>
</head>
<body>
	<div class="background">
		<div class="A"><a href="">管理登录系统</a></div>
		<div class="two">
			<div class="login">登&nbsp;&nbsp; 录</div>
			<div class="content">
			
			<form action="adminLogin">
				&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="adminName" placeholder="请输入您的用户名" value="" size="33" style="height: 30px"><br>&nbsp;&nbsp;&nbsp;&nbsp;<span style="color:white;font-family：黑体;"></span><br><br>
				
				&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="adminPassword" placeholder="请输入您的密码" value="" size="33" style="height: 30px "><br>&nbsp;&nbsp;&nbsp;&nbsp;<span  style="color:white;font-family：黑体;"></span><br><br><br>
				&nbsp;&nbsp;&nbsp;&nbsp;<input id="btn1" type="submit" name="submit" style="height: 35px; width: 260px;" value="login"/>
				</form>
				
				
			</div>
		</div>
	</div>
</body>
</html>