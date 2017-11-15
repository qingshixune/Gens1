<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE >
<html>
<head>
<meta charset="utf-8">
<title>资金分析</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<!-- Force IE9 to render in normal mode -->
<!--[if IE]><meta http-equiv="x-ua-compatible" content="IE=9" /><![endif]-->
<meta name="author" content="SuggeElson" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="application-name" content="sprFlat admin template" />
<link href="assets/css/icons.css" rel="stylesheet" />
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<link href="assets/css/main.css" rel="stylesheet" />
<link rel="icon" href="images/logo.ico" type="image/x-icon" />
<link href="css/fundAnalysis.css" rel="stylesheet" />
</head>

<body>
	<!-- Start #header -->
	<div id="header">
		<div class="container-fluid">
			<div class="navbar">
				<div class="navbar-header">
					<a class="navbar-brand" href="index.html"> <span
						class="text-slogan">&nbsp;&nbsp;个人理财精灵</span>
					</a>
				</div>
				<nav class="top-nav" role="navigation">
				<ul class="nav navbar-nav pull-left">
					<li id="toggle-sidebar-li"><a href="clearUser"
						id="toggle-sidebar"><i class="en-arrow-left2"></i> </a></li>
				</ul>
				<ul class="nav navbar-nav pull-right">
					<li class="dropdown"><a href="#" data-toggle="dropdown"> <img
							class="user-avatar" src="assets/img/avatars/48.jpg"
							alt="SuggeElson">SuggeElson
					</a></li>
					<li class="dropdown"><a href="#" data-toggle="dropdown"> <i
							class="br-alarm"></i> <span class="notification">5</span>
					</a></li>
					<li id="toggle-right-sidebar-li"><a href="#"
						id="toggle-right-sidebar"><i class="ec-users"></i> <span
							class="notification">3</span></a></li>
					<li class="dropdown"><a href="#" data-toggle="dropdown"><i
							class="im-home2"></i></a></li>
				</ul>
				</nav>
			</div>
		</div>
		<!-- Start .header-inner -->
	</div>
	<!-- End #header -->
	<!-- Start #sidebar -->
	<div id="sidebar">
		<!-- Start .sidebar-inner -->
		<div class="sidebar-inner">
			<!-- Start #sideNav -->
			<ul id="sideNav" class="nav nav-pills nav-stacked">
				<li><a href="main.jsp">首页<i class="fa-th-list"></i></a></li>
				<li><a href="toMyPurse">&nbsp;&nbsp;我的钱包 <i class="fa-yen"></i></a>
				</li>

				<li><a href="toCardManage">银行卡管理<i class="en-credit-card"></i></a>
				</li>
				<li><a href="toYuebao">余额宝<i class="fa-github-alt"></i></a></li>
				<li><a href="loanBorrow.jsp">马上借呗<i
						class="fa-strikethrough"></i></a></li>

				<li><a href="PersonalCenter.jsp" id="user4">个人中心<i
						class="im-user4"></i></a></li>
				<li><a href="safeInfo.jsp"><i class="ec-locked"></i>安全中心</a></li>
				<li><a href="fundAnalysis.jsp">账单<i class="st-files"></i></a></li>
			</ul>
			<!-- End #sideNav -->
		</div>
		<!-- End .sidebar-inner -->
	</div>
	<!-- End #sidebar -->
	<!-- Start #content -->
	<div id="mycontent">
		<div id="mycontent-top">
			<i class="st-files"></i> <span>账单</span>
			<div id="mycontent-top-bottom"></div>
		</div>
		<div id="mycontent-left">
			<div class="p15">
				<a id="write-email" href="email-write.html"
					class="btn btn-danger btn-block uppercase"><i class="im-quill"></i>
					compose</a>
			</div>
			<ul id="email-nav" class="nav nav-pills nav-stacked">
				<li><a href="email-inbox.html"><i class="st-clipboard"></i>
						资金记录</a></li>
				<li><a href="#"><i class="st-chart"></i>&nbsp;资金分析</a>
			</ul>
		</div>
		<div id="mycontent-right">
			<div id="mycontent-right-top">
				<span>资金分析</span>
				<hr>
			</div>
			<div class="balance">
				<div id="selectDiv">
					<input type="hidden" value="${yearTotalIncome}" id="yearIncome">
					<input type="hidden" value="${yearTotalPay}" id="yearPay">
					<select id="pie" onchange="window.location=this.value;">
						<option>请选择年份</option>
						<c:forEach var="year" items="${years}">
							<option value="fundAnalysisData?year=${year}">${year}</option>
						</c:forEach>
					</select> <span>收入<b>${yearTotalIncome}</b></span> <span>支出<b
						id="pay">${yearTotalPay}</b></span>
				</div>
				<canvas id="canvas1" height="250" width="250"></canvas>
				<canvas id="canvas2" height="270" width="410"></canvas>
			</div>
		</div>
	</div>
	<!-- End #content -->
	<!-- Start #chat -->
	<div id="chat">
		<div class="chat-top">
			<div class="chat-show">
				<span>好友列表</span>
				<hr>
			</div>
		</div>
		<div class="chat-content">
			<p>
				<a href="#">18984240332</a>
			</p>
		</div>
		<div class="chat-bottom">
			<hr>
			<a href="#"><i class="im-users"></i></a> <a href="#"><i
				class="fa-envelope"></i></a>
		</div>
	</div>
	<!-- End #chat -->
	<script src="plugins/jquery.js" type="text/javascript"></script>
	<script src="plugins/Chart.js" type="text/javascript"></script>
	<script type="text/javascript">
    var pieData = [
    				{   
    					value: ${yearTotalIncome},
    					color:"#F38630",
    					lable:"wwww"
    					
    				},
    				
    		     	{
    					value :  ${yearTotalPay},
    					color : "#69D2E9",
    					
    				},
    			];

    var myPie = new Chart(document.getElementById("canvas1").getContext("2d")).Pie(pieData);


    var barChartData = {
			labels : ["Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"],
			datasets : [
				{
					fillColor : "#69D2E9",
					strokeColor : "rgba(220,220,220,1)",
					data : ${monthIncomes}
				},
				{
					fillColor : "#F38630",
					strokeColor : "rgba(151,187,205,1)",
					data : ${monthPays} 
				}
			]
			
		}

	var myLine = new Chart(document.getElementById("canvas2").getContext("2d")).Bar(barChartData);
    	
    </script>
</body>

</html>