<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
function modify(){
	document.form1.submit();	
}
</script>

<form name="form1" action="modify" method="post" enctype="multipart/form-data">
<div align="center">
<h1>학생 정보 수정</h1>
아이디 : <input type="text" name="id" value="${student.id }" readonly><br>
이름 : <input type="text" name="name" value="${student.name }"><br>
비밀번호 : <input type="password" name="password" value="${student.password }"><br>
이메일 : <input type="text" name="email" value="${student.email }"><br><br>

<c:if test="${student.savedName!=null }">
사진 : <img alt="학생 사진" src="display?fileName=${student.savedName }" width="200">
<br>${originalName }<br>
</c:if>
<input type="file" name="file">
<a href="javascript:modify()">등록</a>
<a href="list">학생 리스트</a>
<a href="imageList">학생 사진 리스트</a>
</div>
</form>