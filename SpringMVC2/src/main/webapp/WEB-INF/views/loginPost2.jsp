<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과 화면</title>
</head> ...............
<body>
	로그인 한 아이디 : ${login.id }<br>
	비밀번호 : ${login.pw }<br>
	<a href="otherPage2">다른 페이지로</a>
</body>
</html>