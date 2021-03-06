<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지글 상세보기</title>
</head>
<script type="text/javascript">
	function getRecord(n){  // 인자를 하나 받음
		frm.bId.value = n; // 선택한 행을 넘겨주는 동작부분
		frm.submit();
	}
</script>
<body>
	<div align="center">
		<div><h1>게시글 상세보기</h1></div>
		<div>
			<table border="1" rules="all">
				<tr>
					<th width="100" bgcolor="f2f2f2">글번호</th>
					<td width="70" align="center">${ board.bId } </td>
					<th width="100" bgcolor="f2f2f2">작성자</th>
					<td width="150" align="center">${ board.bWriter }</td>
					<th width="100" bgcolor="f2f2f2">작성일자</th>
					<td width="150" align="center">${ board.bDate }</td>
					<th width="100" bgcolor="f2f2f2">조회수</th>
					<td width="70" align="center">${ board.bHit }</td>
				</tr>
				<tr>
					<th width="100" bgcolor="f2f2f2">글제목</th>
					<td colspan="7">${ board.bTitle }</td>
				</tr>
				<tr>
					<th width="100" bgcolor="f2f2f2">내  용</th>
					<td colspan="7">
					<textarea rows="5" cols="110">${ board.bContent }</textarea></td>
				</tr>
			</table>
		</div>
		<br />
		<div>
			<button type="button" onclick="location.href='boardList.do'">목록</button>&nbsp;&nbsp;
			<button type="button" onclick="getRecord( ${ board.bId } )">수정</button>&nbsp;&nbsp;
			<button type="button" onclick="location.href='deleteBoard.do'">삭제</button>
		</div>
		<div>
			<form id="frm" name="frm" action="updateForm.do" method="post">
				<input type="hidden" id="bId" name="bId" >
			</form>
		</div>
	</div>
</body>
</html>