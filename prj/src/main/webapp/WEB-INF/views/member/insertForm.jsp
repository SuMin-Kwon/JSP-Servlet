<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원추가</title>
</head>
<body>
	<div align="center">
		<div>
			<h2>회원등록</h2>
		</div>
		<hr>
		<br />
		<div>
			<form id="frm" name="frm" action="insertMember.do" method="post">
				<table border="1" rules="all">
					<tr height="20" >
						<th width="200" bgcolor="#CECEF6">아 이 디</th>
						<td width="400">
							<input type="text" id="id" name="id" required="required" size="50"
							placeholder="아이디를 입력하세요"	>
						</td>
					</tr>
					<tr height="20" >
						<th width="200" bgcolor="#CECEF6">패스워드</th>
						<td width="400">
							<input type="password" id="password" name="password" required="required" size="50"
							placeholder="패스워드를 입력하세요"	>
						</td>
					</tr>
					<tr height="20" >
						<th width="200" bgcolor="#CECEF6">이    름</th>
						<td width="400">
							<input type="text" id="name" name="name" required="required" size="50"
							placeholder="성함을 입력하세요"	>
						</td>
					</tr>
					<tr height="20" >
						<th width="200" bgcolor="#CECEF6">나    이</th>
						<td width="400">
							<input type="number" id="age" name="age" required="required" size="50"
							placeholder="나이를 숫자로 입력하세요"	>
						</td>
					</tr>
					<tr height="20" >
						<th width="200" bgcolor="#CECEF6">취    미</th>
						<td width="400">
							<input type="text" id="hobby" name="hobby" required="required" size="50"
							placeholder="여러가지 입력 가능합니다."	>
						</td>
					</tr>
				</table>
				<br />
				<div>
					<button type="submit" onclick="location.href='insertMember.do'">등록</button>
					&nbsp;&nbsp;
					<button type="reset">취소</button>
					&nbsp;&nbsp;
					<button type="button" onclick="location.href='memberList.do'">목록</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>