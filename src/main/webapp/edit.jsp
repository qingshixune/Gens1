<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<body>
	 	<form action="information">
            <ul>
                <li>昵称： <input type="text" name="userName" class="input-1"></li>
                <li>年龄： <input type="text" name="age" class="input-1"></li>
                <li>性别： <select name="sex" size="1" class="input-2">
                                <option value="男">男</option>
                                <option value="女">女</option>
                            </select>
                </li>
                <li>星座：
                    <select class="input-1" type="text" name="constellations">
                            <option value="白羊座" selected="selected">白羊座</option>
                            <option value="金牛座" >金牛座</option>
                            <option value="双子座" >双子座</option>
                            <option value="巨蟹座" >巨蟹座</option>
                            <option value="狮子座" >狮子座</option>
                            <option value="处女座" >处女座</option>
                            <option value="天秤座" >天秤座</option>
                            <option value="天蝎座" >天蝎座</option>
                            <option value="射手座" >射手座</option>
                            <option value="摩羯座" >摩羯座</option>
                            <option value="水瓶座" >水瓶座</option>
                            <option value="双鱼座" >双鱼座</option>
                    </select><br>
                </li>
                <li>爱好： <input type="text" name="hobby" class="input-1"></li>
                <br><br>
                <li>职业：
                    <select class="input-1" type="text" name="occupation">
                            <option value="学生" >学生</option>
                            <option value="教师" >教师</option>
                            <option value="上班族" >上班族</option>
                            <option value="程序猿" >程序猿</option>
                    </select>
                </li>
                <li>邮箱： <input type="email" name="email" class="input-1"></li>
                <li>地址： <input type="text" name="address" class="input-1"></li>
                <li>公司： <input type="text" name="company" class="input-1"></li>
                <li>个人标签： <input type="text" name="labelling" class="input-1"></li>
            </ul>
             <button class="btn btn1" type="submit">提 交</button> <button type="button" class="btn1 btn2" id="ajax2">返 回</button>
        </form>
        
        <script type="text/javascript">
        $(document).ready(function(){
            $("#ajax2").click(function(){
                $.ajax({
                    type : "GET",
                    url : "/Financial-Genius-SOS/PersonalCenter.jsp",
                    success : function(dates){       
                        $("#content1").load("PersonalCenter.jsp");
                    }
                })
            })
        })
    </script>
</body>
