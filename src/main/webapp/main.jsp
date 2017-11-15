<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>理财精灵首页</title>
    <link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
    <!-- Css files -->
    <!-- Icons -->
    <link href="assets/css/icons.css" rel="stylesheet" />
    <!-- jQueryUI -->
    <link href="assets/css/sprflat-theme/jquery.ui.all.css" rel="stylesheet" />
    <!-- Bootstrap stylesheets (included template modifications) -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- Plugins stylesheets (all plugin custom css) -->
    <link href="assets/css/plugins.css" rel="stylesheet" />
    <!-- Main stylesheets (template main css file) -->
    <link href="assets/css/main.css" rel="stylesheet" />
    <!-- Custom stylesheets ( Put your own changes here ) -->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <link href="css/main.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/calendar.css">
    <script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/main.js"></script>
     
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
                            <a href="javascript :;" onClick="javascript :history.back(-1);" id="toggle-sidebar"><i class="en-arrow-left2"></i>
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
                	<a href="finacialAnalysis">账单<i class="st-files"></i></a>
                </li>
            </ul>
            <!-- End #sideNav -->
            <!-- End #sideNav -->
            <!-- Start .sidebar-panel -->
            <div class="sidebar-panel">
                <h4 class="sidebar-panel-title"><i class="im-fire"></i>每日利率(百元每份)</h4>
                <div class="sidebar-panel-content">
                    <ul class="server-stats">
                        <li>
                            <span class="txt">
                            余额宝收益</span>
                            <span class="percent">0.7163</span>
                            <div id="usage-sparkline" class="sparkline">Loading...</div>
                            <div class="pie-chart" data-percent="78"></div>
                        </li>
                    </ul>
                    <ul class="server-stats">
                        <li>
                            <span class="txt">
                            马上借呗利息
                            </span>
                            <span class="percent">
                            1.121
                            </span>
                            <div id="cpu-sparkline" class="sparkline">Loading...</div>
                            <div class="pie-chart" data-percent="56"></div>
                        </li>
                    </ul>
                </div>
            </div>
            <!-- End .sidebar-panel -->
        </div>
        <!-- End .sidebar-inner -->
    </div>
    <!-- End #sidebar -->
    <!-- Start #content -->
    <div id="content">
        <!-- Start .content-wrapper -->
        <div class="content-wrapper">
            <div class="row">
                <!-- Start .row -->
                <!-- Start .page-header -->
                <div class="col-lg-12 heading">
                    <h1 class="page-header"><i class="fa-th-list"></i> 
                        首页</h1>
                </div>
                <!-- End .row -->
                <div class="outlet">
                    <!-- Start .outlet -->
                    <!-- Page start here ( usual with .row ) -->
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 sortable-layout">
                            <div class="panel panel-default plain panelMove blog-post-widget">
                                <!-- Start .panel -->
                                <div class="panel-heading white-bg pl0 pr0">
                                    <a href="#" id="aSystem">
                                        系统消息
                                    </a>
                                </div>
                                <div class="panel-body pt0">
                                   
                                        <h3 id="check"  style="cursor:pointer;">查看系统消息</h3>
                                    
                                    <span class="blog-post-date"><i class="ec-clock"></i> 23.04.2014</span>
                                    <div class="blog-post-text" id="blog-post-text">
                                        
                                    </div>
                                </div>
                                <div class="panel-footer white-bg">
                                    <div class="blog-post-info">
                                        <a href="#" class="blog-post-author">
                                            <i class="ec-user mr5"></i>SuggeElson
                                        </a>
                                        <a href="#" class="blog-post-comments">
                                            <i class="ec-chat mr5"></i>38
                                        </a>
                                        <a href="#" class="pull-right">Read more<i class="en-arrow-right8"></i></a>
                                    </div>
                                </div>
                            </div>
                            <!-- End .panel -->
                            <!-- 聊天内个框 -->
                            <div class="panel panel-primary toggle panelMove panelClose panelRefresh mb25">
                                <!-- Start .panel -->
                                <div class="panel-heading">
                                    <h4 class="panel-title"><i class="ec-chat"></i> Chat widget</h4>
                                </div>
                                <div class="panel-body p0">
                                    <ul class="chat-ui chat-messages chat-widget">
                                        <li class="chat-user">
                                            <p class="avatar">
                                                
                                            </p>
                                            <p class="chat-name">Chad Engle <span class="chat-time">15 seconds ago</span>
                                            </p>
                                            <p class="chat-txt">Check the last activity in the site.</p>
                                            <p class="chat-attach-file">
                                            </p>
                                        </li>
                                        <li class="chat-me">
                                            <p class="avatar">
                                                <img src="assets/img/avatars/48.jpg" alt="SuggeElson">
                                            </p>
                                            <p class="chat-name">SuggeElson <span class="chat-time">10 seconds ago</span>
                                            </p>
                                            <p class="chat-txt">Ok i will check it out.</p>
                                        </li>
                                        <li class="chat-user">
                                            <p class="avatar">
                                                <img src="assets/img/avatars/49.jpg" alt="@chadengle">
                                            </p>
                                            <p class="chat-name">Chad Engle <span class="chat-time">now</span>
                                            </p>
                                            <p class="chat-txt">Thank you, have a nice day</p>
                                        </li>
                                    </ul>
                                </div>
                                <div class="panel-footer white-bg">
                                    <div class="chat-write chat-widget">
                                        <form action="#" class="form-horizontal" role="form">
                                            <div class="form-group relative">
                                                <textarea name="replymsg" id="replymsg" class="form-control elastic" rows="3"></textarea>
                                                <a role="button" class="btn attach_photo_btn pull-left mt5">
                                                    <i class="fa-picture s20"></i>
                                                </a>
                                                <input type="file" name="attach_photo" class="attach_photo_input">
                                                <div class="pull-right mt10">
                                                    <a href="#" class="btn btn-primary">Reply</a>
                                                </div>
                                                <div class="pull-right mt10 mr10">
                                                    <label class="checkbox">
                                                        <input type="checkbox" id="sendOnEnter" value="yes">Send on <strong>ENTER</strong>
                                                    </label>
                                                </div>
                                            </div>
                                            <!-- End .form-group  -->
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <!-- End .panel -->
                            
                        </div>
                       
                        <!-- 天气那个框 -->
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 sortable-layout">
                            <!-- col-lg-4 start here -->
                            <div class="weather-widget panel panel-primary plain toggle panelMove panelClose panelRefresh">
                                <!-- Start .panel -->
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                    选择个人理财精灵？
                                    </h4>
                                </div>
                                <div class="panel-body blue-bg text-center"
                                id="text-center">
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    个人理财精灵是全球不知名的SOS集团的核心金融衍生产品的交易平台，为全球专业金融投资机构和个人提供最专业和最完善的交易服务。<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;轻松理财，享受生活，理性投资，个人理财精灵护航<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;个人理财精灵为您的投资，全力以赴服务，让您轻松享受生活！<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;巧投资，妙理财，瑞达让您的财富无极限！<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;脚步稳一点，道路宽一点，SOS让您投资更稳更准!<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;选择SOS，精彩每一天 <br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SOS新投资，都市新生活<br>
                                </div>
                                <div class="panel-footer white-bg text-center">
                                    <iframe width="420" scrolling="no" height="60" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=12&icon=1&py=honghuagang&num=3&site=12"></iframe>
                                </div>
                            </div>
                            <!-- End .panel -->
                            <div class="panel panel-primary panelMove">
                                <!-- Start .panel -->
                                <div class="panel-heading">
                                    <h4 class="panel-title"><i class="im-calendar2"></i> 日历</h4>  
                                </div>
                                <div class="panel-body p0">
                                    <div class="twitter-widget">
                                           <div id="calendar" class="calendar"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- col-lg-4 end here -->
                    </div>
                    <!-- End .row -->
                    <!-- Page End here -->
                </div>
                <!-- End .outlet -->
            </div>
            <!-- End .content-wrapper -->
            <div class="clearfix"></div>
        </div>
        <!-- End #content -->
        <!-- Javascripts -->
    
     <script src="plugins/calendar.js"></script>

</body>
</html>