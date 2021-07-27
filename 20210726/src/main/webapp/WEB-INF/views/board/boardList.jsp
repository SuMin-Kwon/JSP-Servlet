<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 목록</title>
</head>
<body>
	<div align="center">
		<div><h1>공지사항 목록</h1></div>
		<div>
			<table border="1">
				<tr>
					<th width="50">번호</th>
					<th width="200">글 제 목</th>
					<th width="100">작 성 자</th>
					<th width="100">작성일자</th>
					<th width="50">조회수</th>
				</tr>
				<c:forEach var="board" items="${boards }">
					<tr>
						<td>${board.bId }</td>
						<td>${board.bTitle }</td>
						<td>${board.bWriter }</td>
						<td>${board.bDate }</td>
						<td>${board.bHit }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br/>
		<div>
			<button type ="button" onclick="location.href='home.do'">홈 가기</button>&nbsp;&nbsp;&nbsp;
			<button type ="button" onclick="location.href='writerForm.do'">새글작성</button>
		</div>
	</div>
</body>
</html>