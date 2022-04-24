<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/mine.css">
<title>Insert title here</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

${dto}

	<h1>게시글내용</h1>
	제목 : <span>${dto.b_title}</span> <br>
	내용 : <span>${dto.b_content}</span> <br>
	작성자 : <span>${dto.b_writer}</span> <br>
	작성일 : <span>${dto.b_regDate}</span> <br>
	
	
	댓글작성<br>
	아이디 : <input type="text" name="r_writer" value="${sessionScope.m_id}" id="r_writer" readonly="readonly">
	내용 : <input type="text" name="r_content" id="r_content">
	<input type="button" id="replyBtn" value="등록하기"><br>
	
	<table border="1" id="replyTBL">
		<tr>
			<td>아이디</td>
			<td>내용</td>
		</tr>
	</table>
	
	
	<a href="/">홈으로</a>

<script type="text/javascript" src="/resources/js/mine.js"></script>
</body>
</html>