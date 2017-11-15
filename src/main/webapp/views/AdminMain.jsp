<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" 
    	uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>管理首页</title>
	<link rel="stylesheet" type="text/css" href="css/AdminMain.css">
	<script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/AdminMain.js"></script>
	<script type="text/javascript">
	
	
	</script>
	
 


</head>
<body>
	<div class="background">
		<div class="personal">
			<div class="a">
				<span id="mainPage"  style="cursor:pointer;" >首页</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="AdminLogin.jsp" style="color: #FFFFFF">退出</a></div>	
			</div>
		<div class="function">
			<div class="lcon"></div>
			<div class="yhgl">管理系统
				
			</div>
			<iframe width="420" scrolling="no" height="60" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=12&icon=1&num=5&site=12" class="weather2"></iframe>

				<div class="yhglxxts">
					<font class="span1">用户名：${adminName}</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<font class="span1">用户级别：管理员</font>
				</div>

				<div id="main" >				
						<div style=" width: 1175px; height: 55px; background: #A2A2A2; margin-left: 20px;">
							<div id="div2">
								<a href="#" ><span id="a1">用户管理</span></a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a href="#" ><span id="a2">消息推送</span></a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a href="#" ><span id="a3">贷款处理</span></a>
							</div>
					</div>
					<div id="div3">
					<div id="div1" style="margin-top:-1px; width: 1175px;height: 500px;">
						<h2 id="h1">慧与千人大数据培训计划</h2>
						
						<h2 id="h2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;官方指定理财平台</h2>
					

						<h4> Copyright&copy;2017_轻实训版权所有</h4>

					</div>
					</div>
					</div>
	
	</div>
</div>
</body>
</html>