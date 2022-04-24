$(function(){
	
	$('#replyBtn').click(function(){
		var r_writer = $('#r_writer').val();
		var r_content = $('#r_content').val();
		
		$.ajax({
			type: "POST",               
			url: "/replyRegist",     
			data: {r_writer:r_writer, r_content:r_content},         
			success: function(data) {
				if(data=="Success"){
					alert('댓글등록 성공');
					$('#r_content').val("");
				}else{
					alert('댓글등록 실패');
					$('#r_content').val("");
				}
			},
			error:function(request, status, error){

				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);

	}
		});
		
	})
	
})