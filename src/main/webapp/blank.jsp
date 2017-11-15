<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="assets/css/icons.css" rel="stylesheet" />
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/main.css" rel="stylesheet" />
    <link rel="icon" href="images/logo.ico" type="image/x-icon"/>
    <link href="css/blank.css" rel="stylesheet" />    
</head>
<body>
   <!-- Start #header -->
    <div id="header">
        <div class="container-fluid">
            <div class="navbar">
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.html">
                            <span class="text-slogan">&nbsp;&nbsp;个人理财精灵</span> 
                        </a>
                </div>
                <nav class="top-nav" role="navigation">
                    <ul class="nav navbar-nav pull-left">
                        <li id="toggle-sidebar-li">
                             <a href="clearUser" id="toggle-sidebar"><i class="en-arrow-left2"></i>
                        </a>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav pull-right">
                        <li class="dropdown">
                            <a href="#" data-toggle="dropdown">
                            <img class="user-avatar" src="assets/img/avatars/48.jpg" alt="SuggeElson">SuggeElson</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" data-toggle="dropdown">
                            	<i class="br-alarm"></i>
                                <span class="notification">5</span>
                            </a>
                        </li>
                        <li id="toggle-right-sidebar-li"><a href="#" id="toggle-right-sidebar"><i class="ec-users"></i> <span class="notification">3</span></a>
                        </li>
                         <li class="dropdown">
                            <a href="#" data-toggle="dropdown"><i class="im-home2"></i></a>
                        </li>  
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
            	<li>
                    <a href="main.jsp">首页<i class="fa-th-list"></i></a>
                </li>
                <li>
                    <a href="toMyPurse">&nbsp;&nbsp;我的钱包
                    <i class="fa-yen"></i></a>
                </li>
               
                <li>
                	<a href="toCardManage">银行卡管理<i class="en-credit-card"></i></a>
                </li>
                <li>
                	<a href="toYuebao">余额宝<i class="fa-github-alt"></i></a>
                </li>
                <li>
                	<a href="loanBorrow.jsp">马上借呗<i class="fa-strikethrough"></i></a>
                </li>
               
                <li>
                    <a href="PersonalCenter.jsp" id="user4">个人中心<i class="im-user4"></i></a>
                </li>
                <li>
                	<a href="safeInfo.jsp"><i class="ec-locked"></i>安全中心</a>
                </li>
                <li>
                	<a href="fundAnalysis.jsp">账单<i class="st-files"></i></a>
                </li>
            </ul>
            <!-- End #sideNav -->
        </div>
        <!-- End .sidebar-inner -->
    </div>
    <!-- End #sidebar -->
    <!-- Start #content -->
    <div id="mycontent">
       
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
            <p><a href="#">18984240332</a></p>
        </div>
        <div class="chat-bottom">
        	<hr>
            <a href="#"><i class="im-users"></i></a>
            <a href="#"><i class="fa-envelope"></i></a>
        </div>
    </div>
    <!-- End #chat -->
    <script src="plugins/jquery.js" type="text/javascript"></script>
    <script src="js/common.js" type="text/javascript"></script>
</body>
</html>