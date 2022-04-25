$(function(){
	
	replyListView();
	
})

function replyListView(){
	
	var r_boardNum = $('#r_boardNum').val();
	
	$.ajax({
			type: "POST",               
			url: "/replyList",
			data: {r_boardNum:r_boardNum},    
			success: function(data) {
				console.log(data);
				var replyTBL = "<table border='1'><tr><td>작성자</td><td>작성내용</td></tr>";
				$(data).each(function(){
					
					 replyTBL += "<tr><td>"+this.r_writer+"</td><td>"+ this.r_content + "</td></tr>";
				
				});
			replyTBL += "</table>";
			
			$('#replyShowZone').html(replyTBL);
				
			},
			error:function(request, status, error){
				alert("code:"+request.status
				+"\n"+"message:"+request.responseText
				+"\n"+"error:"+error);
				console.log("code:"+request.status);
				console.log("message:"+request.responseText);
				console.log("error:"+error);
			}
		});
		
	}
	
$('#replyBtn').click(function(){
		var r_boardNum = $('#r_boardNum').val();
		var r_writer = $('#r_writer').val();
		var r_content = $('#r_content').val();
		
		$.ajax({
			type: "POST",               
			url: "/replyRegist",     
			data: {
				r_boardNum:r_boardNum, 
				r_writer:r_writer, 
				r_content:r_content
				},         
			success: function(data) {
				if(data=="Success"){
					alert('댓글등록 성공');
					replyListView();
					$('#r_content').val("");
				}else{
					alert('댓글등록 실패');
					$('#r_content').val("");
				}
			},
			error:function(request, status, error){

				alert("code:"+request.status
				+"\n"+"message:"+request.responseText
				+"\n"+"error:"+error);

			}
		});
		
	})