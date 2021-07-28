<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 목록</title>
<script type="text/javascript">
	function getRecord(n){  // 인자를 하나 받음
		frm.bId.value = n; // 선택한 행을 넘겨주는 동작부분
		frm.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<div><h1>공지사항 목록</h1></div>
		<div>
			<table border="1" rules="all">
				<tr height="50">
					<th width="70" bgcolor="f2f2f2">번호</th>
					<th width="300" bgcolor="f2f2f2">글 제 목</th>
					<th width="150" bgcolor="f2f2f2">작 성 자</th>
					<th width="150" bgcolor="f2f2f2">작성일자</th>
					<th width="70" bgcolor="f2f2f2">조회수</th>
				</tr>
				<c:forEach var="board" items="${ boards }">
					<tr onmouseover="this.style.background='lightgray'" onmouseout="this.style.background='white'"
					onclick="getRecord( ${ board.bId } )">
						<td align="center">${ board.bId }</td>
						<td>${ board.bTitle }</td>
						<td align="center">${ board.bWriter }</td>
						<td align="center">${ board.bDate }</td>
						<td align="center">${ board.bHit }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br />
		<div>
			<button type="button" onclick="location.href='home.do'">홈 가기</button>&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="location.href='insertForm.do'">새글작성</button>
		</div>
		<div>
			<form id="frm" name="frm" action="boardSelect.do" method="post">
				<input type="hidden" id="bId" name="bId" >
			</form>
		</div>
	</div>
</body>
</html>