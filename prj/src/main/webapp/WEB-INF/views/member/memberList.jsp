<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<script type="text/javascript">
	function getRecord(n) {
		frm.id.value = n;
		frm.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<div>
			<h1>회원목록 리스트</h1>
		</div>
		<hr>
		<br />
		<div>
			<table border="1" rules="all">
				<tr height="40" bgcolor="#CECEF6">
					<th width="200">아 이 디</th>
					<th width="200">비밀번호</th>
					<th width="200">이    름</th>
					<th width="200">권    한</th>
				</tr>
				<c:forEach var="list" items="${list}">
					<tr height="25" align="center" onmouseover="this.style.background='#CECEF6'" 
					onmouseout="this.style.background='white'" onclick="getRecord('${list.id}')">
						<td>${list.id}</td>
						<td>${list.password}</td>
						<td>${list.name}</td>
						<td>${list.author}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br/>
		<div>
			<button type="button" onclick="location.href='home.do'">홈 가기</button>&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="location.href='insertForm.do'">새글작성</button>
		</div>
		<div>
			<form id="frm" name="frm" action="memberOneList.do" method="post"> 
				<input type="hidden" id="id" name ="id" >
			</form>
		</div>
	</div>
</body>
</html>