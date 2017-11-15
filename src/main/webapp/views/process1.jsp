<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" 
    		uri="http://java.sun.com/jsp/jstl/core" %>
    	<script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/AdminMain.js"></script>
		<div style="width: 1175px;height: 500px;margin-top: -3px; " id="div5">
				 <table rules="rows" frame="below"  id="tab">
					<tr  class="tr1">
   						<th>贷款编号</th>
   						<th>贷款人 </th>
   						<th>贷款金额</th>
   						<th>贷款日期</th>				
   						<th>还款日期</th>
   						<th>请求状态</th>
   						<th colspan="2">操作  </th>
					</tr>
					<c:forEach items="${loans}" var="item"> 					
					<tr class="tr1">
    					<td>${item.id}</td>
    					<td>${item.username}</td>
    					<td>${item.loanmoney}</td>    			
    					<td>${item.loandate}</td>
    					<td>${item.repayment}</td>
    					<td> ${item.processState}</td>
    					<td><a href="loanProcess?id=${item.id}&loanMoney=${item.loanmoney}&userName=${item.username}" id="agree">同意</a>&nbsp;&nbsp;&nbsp;|</td><td><a href="disagreeProcess?id=${item.id}" id="disagree">驳回</a></td>    			
					</tr>
				</c:forEach>
				</table>
				<h3 id="message1" style="margin-left:400px;">${message1}</h3>				
			</div>