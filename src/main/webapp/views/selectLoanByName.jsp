<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" 
    		uri="http://java.sun.com/jsp/jstl/core" %>
    		<script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
			<script type="text/javascript" src="js/AdminMain.js"></script>
			<div style="width: 1175px;height: 500px;margin-top: -3px; ">
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
					<tr class="tr1">
    					<td>${loan.id}</td>
    					<td>${loan.username}</td>
    					<td>${loan.loanmoney}</td>    			
    					<td>${loan.loandate}</td>
    					<td>${loan.repayment}</td>
    					<td>${loan.processState}</td>
    					<td><a href="loanProcess?id=${loan.id}&loanMoney=${loan.loanmoney}&userName=${loan.username}" id="agree">同意</a>&nbsp;&nbsp;&nbsp;|</td><td><a href="disagreeProcess?id=${loan.id}" id="disagree">驳回</a></td>    			
					</tr>
				</table>	
							
			</div>