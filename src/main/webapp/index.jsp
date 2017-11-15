<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="icon" href="images/logo.ico" type="image/x-icon"/> 
    <link rel="stylesheet" href="css/login.css" />
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
					<a href="index.jsp" id="log">登录</a>
				</b>
                <b class="reg">
					<a href="register.jsp" >注册</a>
				</b>
            </div>
        </div>
    </div>
    <!-- top end -->
    <!-- msg begin -->
    <div id="msgShow">
        <h2>${user.msg}</h2>
    </div>
    <!-- msg end -->
    <!-- centent begin -->
    <div id="centent">
        <div class="login">
            <div class="login-left">
            <form action="userLogin">
                <font>用户登录</font>
                <h3>
    		  	<img src="images/user.png">
    		  	<input type="text" name="loginAccount" placeholder="请输入您的手机号">
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
    		  	<a href="AdminLogin.jsp">管理员登录</a>
    		    </h3>	  
    		  	<button>登录</button>
    		  	</form>
            </div>
            <div class="login-right">
            	<div class="signIn">
            		<p><a href="register.jsp">还没有账号</a></p>
            		<a href="register.jsp"><button>立即注册</button></a>
            	</div>
            </div>
        </div>
    </div>
    <!-- centent end -->
     <script src="plugins/jquery.js" type="text/javascript"></script>
    <script src="js/login.js" type="text/javascript"></script>
</body>

</html>