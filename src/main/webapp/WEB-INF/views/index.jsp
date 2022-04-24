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
${sessionScope.m_id} 님 반갑습니다.
<a href="/logout">로그아웃</a> <br>
<a href="/memList">회원보기</a>
</c:if>

<c:if test="${empty sessionScope.m_id}">

<a href="/memRegist">회원가입</a> <br>

<form action="login" method="post">
	아이디 : <input type="text" name="m_id" id="m_id"> <br>
	비밀번호 : <input type="password" name="m_pw" id="m_pw"> <br>
	<input type="submit" value="로그인"> 
</form>
</c:if>


<script type="text/javascript" src="/resources/js/mine.js"></script>
<script type="text/javascript">

	<c:if test="${msg==false}">
	alert('로그인실패');
	</c:if>

</script>
</body>
</html>