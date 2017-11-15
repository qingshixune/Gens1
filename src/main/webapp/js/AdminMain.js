$(document).ready(function(){

			$("#a1").click(function(){

    			$("#a1").css("color","blue");
    			$("#a2").css("color","black");
    			$("#a3").css("color","black");
    			$.ajax({
    				type:"POST",
    				url:"toUserManage",
    				success:function(datas){
    					$("#div1").html(datas);
    				}
    			});
    			
    			
    	});
			$("#a2").click(function(){
    			$("#a1").css("color","black");
    			$("#a2").css("color","blue");
    			$("#a3").css("color","black");
    			$.ajax({
    				type:"POST",
    				url:"toInfo",
    				success:function(datas){
    					$("#div1").html(datas);
    				}
    			});
    			
    	});
			$("#a3").click(function(){
    			$("#a1").css("color","black");
    			$("#a2").css("color","black");
    			$("#a3").css("color","blue");
    			$.ajax({
    				type:"POST",
    				url:"toProcess",
    				success:function(datas){
    					$("#div1").html(datas);
    				}
    			});
    			
    			$("#mainPage").click(function(){
    				$.ajax({
    					type:"POST",
    					url:"toAdminMain",
    					success:function(datas){
    						$(".background").html(datas);
    					}
    				})
    			})
    	});
			$("#btn1").click(function(){
				var userName=$("#input1").val();
				$.ajax({
					type:"POST",
					url:"selectUserByName",
					data:"userName="+userName,
					success:function(datas){
						$("#div6").html(datas);
					}
				});
			});
			$("#btn2").click(function(){
				var userName=$("#input2").val();
				$.ajax({
					type:"POST",
					url:"selectLoanByName",
					data:"userName="+userName,
					success:function(datas){
						$("#div5").html(datas);
					}
				});
			});
			
			$("#span4").click(function(){
				var result=true;
				if(result){
				if(confirm("确认要锁定该用户?")==true){
					result=false;
					alert("锁定成功！");
				}
				}
			});
			$("#unlock").click(function(){
				var result=true;
				if(result)
				if(confirm("确认要解锁该用户?")==true){
					result=false;
					alert("解锁成功！");
				}
			});
			$("#send").click(function(){
				var content =$("#content").val();
				var userName=$("#userName").val();
				
				if(userName==""){
					if(confirm("发送人不能为空!")==true){
						if(content==""){
						if(confirm("发送内容不能为空!")==true){
						return false;
						}
					}
						}
				
					
					
					
					
				}else{
					alert("推送成功!");
				}
				
			});
			$("#agree").click(function(){
				if(confirm("确认要同意该申请?")==true){
					alert("操作成功！");
				}
			});
			$("#disagree").click(function(){
				if(confirm("确认要驳回该申请?")==true){
					alert("操作成功！");
				}
			});
		})
			