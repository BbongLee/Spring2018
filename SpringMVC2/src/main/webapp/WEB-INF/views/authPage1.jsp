<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인한 사용자 페이지1</title>
</head>
<body>
	로그인 한 아이디 : ${login.id }<br>
	로그인 한 비밀번호 : ${login.pw }<br>
	<c:if test="${login.id!=null }">
		<a href="logout2">로그아웃</a>
	</c:if>
</body>
</html>