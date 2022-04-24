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

	<h1>회원보기</h1>
	<table border="1">
		<tr>
			<td>회원번호</td>
			<td>아이디</td>
			<td>수정하기</td>
			<td>삭제하기</td>
		</tr>
		
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.m_no}</td>
				<td>${list.m_id}</td>
				<td><a href="memUpdate?m_no=${list.m_no}">수정하기</a></td>
				<td><a href="memDelete?m_no=${list.m_no}">삭제하기</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="/">홈으로</a>

<script type="text/javascript" src="/resources/js/mine.js"></script>
</body>
</html>