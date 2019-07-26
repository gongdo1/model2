<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>개인회원 정보</h1>

	<div id="memberInfo">
		<div class="userImg">
			<!-- 회원 기본 정보 -->
			<img src="${requestScope.member.userImg }" />
		</div>
		<div>아이디 : ${requestScope.member.userid }님안녕하세요!</div>
		<div>Point : ${requestScope.member.point }</div>
		<div>가입일 : ${requestScope.member.registerdate }</div>
	</div>

	<div id="pointlog">
		<!-- 회원의 포인트 로그 내역 -->
		<table border="1">
			<tr>
				<th>포인트 가감일</th>
				<th>가감 포인트</th>
				<th>포인트 가감 사유</th>
			</tr>
			<c:forEach items="${requestScope.pointLog }" var="log">
				<tr>
					<td>${log.givendate }</td>
					<td>${log.pointval }</td>
					<td>${log.why }</td>
				</tr>
			</c:forEach>
		</table>

	</div>

</body>
</html>