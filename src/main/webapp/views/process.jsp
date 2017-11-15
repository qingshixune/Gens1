<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" 
    		uri="http://java.sun.com/jsp/jstl/core" %>
    		<script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/AdminMain.js"></script>
<div style="background: #63625a;width:1175px;height: 65px;  opacity:0.8; margin-left: 0px;">				
				<hr style="border:1px ;  height:3px;  background-color:#ADADAD; " >
			<form style="margin-left: 100px; margin-top:-15px;">
				
				<input id="input2" type="text" name="userName" placeholder="请输入姓名" style="height: 25px; opacity: 0.8; margin-left: 50px;">&nbsp;&nbsp;<button type="button" style="height:30px;width:50px; background: #7EB2FF; opacity: 0.8;" id="btn2">查询</button>
			</form>
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
			</div>
		</div>