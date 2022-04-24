<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${dto}
	
	<h1>회원수정</h1>
	<form action="memUpdate" method="post">
	<input type="hidden" name="m_no" id="m_no" value="${dto.m_no}">
		아이디 : <input type="text" name="m_id" id="m_id"> <br>
		 <input type="submit" value="수정하기">
	</form>
</body>
</html>