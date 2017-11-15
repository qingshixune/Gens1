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