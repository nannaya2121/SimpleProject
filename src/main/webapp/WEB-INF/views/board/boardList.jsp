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

	<c:if test="${not empty sessionScope.m_id}">
		<a href="/boardRegist">글쓰기</a>
	</c:if>

	<h1>게시글보기</h1>
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
		</tr>
		
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.b_no}</td>
				<td>${list.b_title}</td>
				<td>${list.b_writer}</td>
				<td>${list.b_regDate}</td>
			</tr>
		</c:forEach>
		
	</table>
	
	<a href="/">홈으로</a>

<script type="text/javascript" src="/resources/js/mine.js"></script>
</body>
</html>