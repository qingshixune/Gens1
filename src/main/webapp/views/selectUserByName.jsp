<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" 
    		uri="http://java.sun.com/jsp/jstl/core" %>
    	<script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/AdminMain.js"></script>
	<div style="width: 897px;height: 500px; ">
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
						
						 					
						<tr style="width: 800px;">
	    					<td>${user1.id}</td>
	    					<td>${user1.username}</td>
	    					<td>${user1.loginaccount}</td>    					
	    					<td>${user1.sex}</td>
	    					<td>${user1.idnumber}</td>
	    					<td>${user1.state}</td>
	    					<td style="cursor: pointer;"><a href="lockUser?id=${user1.id}" >锁定</a>&nbsp;&nbsp;|</td><td><a href="unlockUser?id=${user1.id}">解锁</a></td>    					
						</tr>
						
					</table>
					<h3 id="message1" style="margin-left:400px;">${message1}</h3>
				</div>