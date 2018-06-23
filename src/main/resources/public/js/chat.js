$("#send-button").click(function(){
    var v = $(".input-msg").val();
    $(".input-msg").before("<h1 class=\"user_msg\">"+v+"</h1>")
    $.ajax({
    	  	         type: "GET",
    	  	         url:"http://localhost/chat",
    	  	         data:$("#input-msg").serialize(),
    	  	         success: function(response) {

    	  	        	 if(response.content != ""){
    	  	        		//TO-DO
                            $(".input-msg").before("<h1 class=\"user_msg\">"+response.content+"</h1>")
    	  	        	 }else{
    	  	        		alert("hehe");
    	  	        	 }
    	  	         },
    	  	         error: function (jqXHR, textStatus, errorThrown) {
    	  	        	 console.log(jqXHR.responseText);
    	  	        	 console.log(jqXHR.status);
    	  	        	 console.log(jqXHR.readyState);
    	  	        	 console.log(jqXHR.statusText);
    	  	             console.log(textStatus);
    	  	             console.log(errorThrown);
    	  	        	 alert("hehe");
    	  	         }
    	  	  });

});