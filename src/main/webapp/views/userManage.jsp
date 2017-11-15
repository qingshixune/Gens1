<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" 
    		uri="http://java.sun.com/jsp/jstl/core" %>
    	<script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/AdminMain.js"></script>
	
		<div style="background: #63625a;height: 70px;width: 1175px; margin-left: 0px; opacity:0.8;">	
				<hr style="border:1px ;  height:3px;  background-color:#ADADAD; " >
				<div style="margin-left: 100px; margin-top:-15px;">
					
					<input id="input1" type="text" name="userName" placeholder="请输入姓名" style="height: 25px; opacity: 0.8;margin-left: 100px;">&nbsp;&nbsp;<button type="button" style="height:30px;width:50px; background: #7EB2FF; opacity: 0.8;" id="btn1">查询</button>
				</div>
					<div id="barcon" class="barcon" >  
    				  
       		 		<div id="barcon2" class="barcon2">  
           		 		<ul>  
                			<li>
                				<a href="###" id="firstPage">首页</a>
                			</li>  
                			<li>
                				<a href="###" id="prePage">上一页</a>
                			</li>  
                			<li>
                				<a href="###" id="nextPage">下一页</a>
                			</li>  
                			<li>
                				<a href="###" id="lastPage">尾页</a>
                			</li>  
                			<li>
                				<select id="jumpWhere"></select>
                			</li>  
                			<li>
                				<a href="###" id="jumpPage" onclick="jumpPage()">跳转</a>
                			</li>  
            </ul>  
        </div>  
</div>
				<hr style="border:1px ;  height:3px;  background-color:#ADADAD;" >
				<div style="width: 897px;height: 500px; " id="div6">
					 <table rules="rows">
						<tr class="tr1">
	   						<th>用户编号</th>
	   						<th>用户名 </th>
	   						<th>电话号码</th>
	   						<th>性别</th>				
	   						<th>银行卡号</th>
	   						<th>状态 </th>   						
	   						<th colspan="2" style="cursor: pointer;">操作  </th>
						</tr>
						
						<c:forEach items="${users}" var="item"> 
										
						<tr style="width: 800px;">
	    					<td>${item.id}</td>
	    					<td>${item.userName}</td>
	    					<td>${item.loginAccount}</td>    					
	    					<td>${item.sex}</td>
	    					<td>${item.idNumber}</td>
	    					<td>${item.state}</td>
	    					<td style="cursor: pointer;"><a href="lockUser?id=${item.id}" id="lock"><span id="span4">锁定</span></a>&nbsp;&nbsp;|</td><td><a href="unlockUser?id=${item.id}" id="unlock">解锁</a></td>    					
						</tr>
						</c:forEach>
					</table>
					<h3 id="message1" style="margin-left:400px;">${message1}</h3>
				</div>
			</div>		
	