<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script>
function modify(){
	document.form1.submit();	
}
</script>

<form name="form1" action="modify" method="post">
<div align="center">
<h1>학생 정보 수정</h1>
아이디 : <input type="text" name="id" value="${student.id }" readonly><br>
이름 : <input type="text" name="name" value="${student.name }"><br>
비밀번호 : <input type="password" name="password" value="${student.password }"><br>
이메일 : <input type="text" name="email" value="${student.email }"><br><br>
<a href="javascript:modify()">등록</a>
<a href="list">학생 리스트</a>
</div>
</form>