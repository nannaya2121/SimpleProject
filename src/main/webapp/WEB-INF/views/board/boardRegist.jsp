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
${sessionScope.m_id}
	

	<h1>게시글등록</h1>
	<form action="/boardRegist" method="post">
		글 제목 : <input type="text" name="b_title"> <br>
		글 내용 : <input type="text" name="b_content"> <br>
		작성자 : <input type="text" name="b_writer" value="${sessionScope.m_id}" readonly="readonly"> <br>
		<input type="submit" value="글 등록하기">
	</form>
	
	
	<a href="/">홈으로</a>

<script type="text/javascript" src="/resources/js/mine.js"></script>
</body>
</html>