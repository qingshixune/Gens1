$(document).ready(function(){
	 
	  $("#check").click(function() {
		 
			      	$.ajax({
			      		type:"POST",
			      		url:"check",
			      		success:function(datas){
			      			$("#blog-post-text").html(datas);
			      		}
			      	});
			      	
			  })
 })