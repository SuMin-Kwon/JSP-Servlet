<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
	<div align="center">
		<div>
			<h3>상세보기</h3>
		</div>
		<hr>
		<br />
		<div>
			<table border="1" rules="all">
				<tr height="40" bgcolor="#CECEF6">
					<th width="100">아 이 디</th>
					<th width="100">비밀번호</th>
					<th width="100">이 름</th>
					<th width="100">나 이</th>
					<th width="200">취 미</th>
					<th width="100">권 한</th>
					<th width="100">상 태</th>
				</tr>
				<tr height="25" align="center">
					<td>${list.id}</td>
					<td>${list.password}</td>
					<td>${list.name}</td>
					<td>${list.age}</td>
					<td>${list.hobby}</td>
					<td>${list.author}</td>
					<td>${list.state}</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>