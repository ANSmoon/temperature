<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%-- User를 사용하기 위해 dto 패키지를 import 한다. --%>
<%@ page import="com.ssafy.ws.model.dto.*"%>
<%-- jstl의 core 라이브러리를 사용하기 위해 taglib를 이용한다. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
#user-info {
	text-align: right;
}
</style>
<%--절대경로를 쉽게 사용하기 위해 session에 root를 key로 컨텍스트 루트 경로를 저장해둔다. --%>
<c:set value="${pageContext.request.contextPath }" scope="session"
	var="root"></c:set>

<%-- bootstrap 관련 코드를 등록한다. --%>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
<%-- 프로젝트에서 정의한 CSS를 참조할 때 resources 경로를 참조한다. --%>
<link rel="stylesheet" href="${root }/resources/css/common.css">
<style>
</style>
<div class="container">
	<img src="${root }/resources/img/ssafy_logo.png" id="ssafy_logo">
	<h1 class="display-4 text-center">영화 관리</h1>
	<br>
	<%-- session에서 loginUser를 가져와서 존재 여부에 따라 로그인 폼 또는 사용자 정보를 출력한다. --%>
	<%--로그인 정보가 있는 경우는 사용자 이름과 로그아웃을 위한 링크를 생성한다.--%>
	<div id = "user-info">
	<c:if test="${not empty sessionScope.loginUser }">
		<div>
			${sessionScope.loginUser.name}님 hi.       <a href="logout">Logout</a>
		</div>
	</c:if>
	<%--로그인 정보가 없을 경우는 로그인을 위한 폼을 제공한다. --%>
	<c:if test="${sessionScope.loginUser eq null}">
		<form action="login" method="POST">
			<input type="text" name="id" placeholder="id를 입력하세용"> <input
				type="password" name="pass" placeholder="pw를 입력하세용"> <input
				type="submit" value="LOGIN">
		</form>
	</c:if>
	</div>
	
</div>
<hr>
