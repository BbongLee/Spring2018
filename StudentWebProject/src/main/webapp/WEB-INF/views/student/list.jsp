<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 태그 라이브러리. 더 많은 html보다 많은 태그 갖고있다 !!! 우왕! -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div align="center">

<div>
<c:choose>
<c:when test="${login!=null }">
${login.name }(아이디:${login.id })님 반갑습니다.^^
<a href="../user/logout">* 로그아웃 *</a>
</c:when>
<c:otherwise>
<a href="../user/login">* 로그인 *</a>
</c:otherwise>
</c:choose>
</div>

<h1>학생 리스트</h1>
<table border="1">
<tr><th>아이디</th><th>이름</th></tr>
<c:forEach items="${students }" var="student">
<tr>
	<td>${student.id }</td>
	<td><a href="read?id=${student.id }">${student.name }</a></td>
</tr>
</c:forEach>
</table>
<a href="register">학생 등록</a>
</div>