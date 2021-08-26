<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
	
		$('#selectListBtn').click(function() {
			$.ajax({
				dataType : 'json', 
				url : '/TestListServlet.do',
				success : function(result) {
					console.log(result);
				}
			});
		});
	
	});
</script>
<title>TEST</title>
</head>
<body>
	<div class="container">
		<br>
		<div class="row">
			<div class="col-12">
				<table class="table">
					<tr>
						<td>아이디 :</td>
						<td><input type="text" id="id" name="id"></td>
						<td>생년월일 : <input type="date" id="birth" name="birth"></td>
						<td>
							<button id="insertBtn" class="btn btn-primary" type="button">등록하기</button>
						</td>
					</tr>
					<tr>
						<td>이름 :</td>
						<td><input type="text" id="name" name="name"></td>
						<td></td>
						<td>
							<button id="selectListBtn" class="btn btn-primary" type="button">조회하기</button>
						</td>
					</tr>
					<tr>
						<td>연락처 :</td>
						<td><input type="text" id="tel" name="tel"></td>
						<td></td>
						<td>
							<button class="btn btn-primary" type="button">수정하기</button>
						</td>
					</tr>
				</table>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-12">
				<table id="selectTable" class="table table-bordered">
					<tr class="text-center">
						<th>아 이 디</th>
						<th>이 름</th>
						<th>연 락 처</th>
						<th>주 소</th>
						<th>생년월일</th>
					</tr>
					<!--<c:forEach var="list" items="${list}">
						<tr>
							<td>${list.id }</td>
							<td>${list.name }</td>
							<td>${list.tel }</td>
							<td>${list.address }</td>
							<td>${list.birth }</td>
						</tr>
					</c:forEach> -->
				</table>
			</div>
		</div>

	</div>
</body>
</html>