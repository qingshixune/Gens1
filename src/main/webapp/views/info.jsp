<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" 
    		uri="http://java.sun.com/jsp/jstl/core" %>
    		<script src="plugins/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/AdminMain.js"></script>
<div  style="height: 70px;width: 1175px; margin-left: 0px; opacity:0.8;">
			<div class="left">
			        <div class="yh">用户列表</div>
			        <div class="z">
			        	<table cellpadding="0" cellspacing="0">
					        <thead>
					        <c:forEach items="${users }" var="item">
								<tr >
								
									<div class="one" id="frist">
									<input type="text" value="${item.id}" hidden="hidden">${item.userName}</div>
								</tr>
								</c:forEach>
							</thead>
						</table>
			        </div>
				        
				</div>
				<div class="right">
				
					<div class="top">消息推送</div>
					<form action="sendMessage">
					<div class="top2">
					
						
						标&nbsp;&nbsp;&nbsp;题:<input type="text" name="title" style="height: 25px;width: 300px;font-size: 15px" id="title"><br>
						发送给:<input type="text" name="userName" style="height: 25px;width: 300px;font-size: 18px" id="userName">
					</div>
					
					<textarea id="content" name="messages" cols="63" rows="15" style="margin-left: 240px ; width:400px;font-size: 15px"></textarea>					    
					   	
					
					<input type="submit" name="" style="height: 35px;width: 50px ;position: absolute; margin-top: 150px;margin-left: 40px;" value="发送" id="send" >
					  		</form>
				</div>
			
				</div>