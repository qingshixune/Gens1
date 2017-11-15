<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link rel="icon"  href="images/logo.ico" type="image/x-icon"/> 
    <link rel="stylesheet" href="css/register.css" />
</head>
<body>
    <!-- top begin -->
    <div id="top">
        <div class="title">
            <div class="title-left">
                <img src="images/logo.png">
            </div>
            <div class="title-right">
                <b class="log">
					<a href="#" id="log">登录</a>
				</b>
                <b class="reg">
					<a href="#" >注册</a>
				</b>
            </div>
        </div>
    </div>
    <!-- top end -->
    <!-- msg begin -->
    <div id="msgShow">
        <h2>${msg}</h2>
    </div>
    <!-- msg end -->
    <!-- centent begin -->
    <div id="centent">
        <div class="login">
            <div class="login-left">
            <form action="registed">
                <font>用户注册</font>
                <h3>
    		  	<img src="images/phone.png">
    		    <input type="hidden" value="" id="imHidden">
    		  	<input type="text" name="loginAccount" placeholder="请输入您的手机号" id="userPhone">
    		  	<h4>&nbsp;</h4>
    		    </h3>
                <hr>
                <h3>
    		  	<img src="images/phone.png">
    		  	<input type="text" name="" placeholder="请输入手机验证码">
    		  	<h4>&nbsp;</h4>
    		    </h3>
                <hr>
                <h3>
    		  	<img src="images/password.png">
    		  	<input type="password" name="password" placeholder="请输入您的密码">
    		  	<h4>&nbsp;</h4>
    		    </h3>
                <hr>
                <h3>
    		  	<img src="images/password.png">
    		  	<input type="password" name="password2" placeholder="请重复输入您的密码">
    		  	<h4>&nbsp;</h4>
    		    </h3>
                <hr>
             
    		  	<button>注册</button>
    		  	
    		  	</form>
            </div>
            <div class="login-right">
            	<div class="signIn">
            		<p><a href="#">已有账号</a></p>
            		<button id="myRegister">获取验证码</button>
            	</div>
            </div>
        </div>
    </div>
    <!-- centent end -->
    <script src="plugins/jquery.js" type="text/javascript"></script>
    <script src="js/register.js" type="text/javascript"></script>
</body>

</html>