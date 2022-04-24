<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/mine.css">
<title>Insert title here</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

	<h1>회원가입</h1>
	
	<form action="memRegist" method="post">
	
		아이디 : <input type="text" name="m_id" id="m_id"> <br>
		비밀번호 : <input type="password" name="m_pw" id="m_pw"> <br>
		<input type="submit" id="memRegBtn" value="가입하기">
	
	</form>
	

<script type="text/javascript" src="/resources/js/mine.js"></script>
</body>
</html>