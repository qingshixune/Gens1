 $(function(){
            $(".delete").click(function(){
                if (confirm("确定要解除此卡的绑定？")==false) {
                      event.preventDefault();
                }
            })
  })