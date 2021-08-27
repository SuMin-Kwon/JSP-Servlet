<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	// 조회버튼
	$('#selectListBtn').on('click',function() {
	$.ajax({
		url: 'SelectServlet',
		type: 'POST',
		dataType: 'json',
		success: function(obj) {
			$('#selectTable').empty();
			thead();
			for (let data of obj) {
				listFnc(data);
			} 
		},
		error : function(reject) {
			console.log('[error!!!!!!!]'+reject);
			}
		})
	})
	
	// 입력버튼
	 $('#insertBtn').on('click',function() {
		$.ajax({
			url: 'InsertServlet',
			type: 'POST',
			data : $('#frm').serialize(),
			dataType: 'json',
			success: function(obj) {
				console.log(obj);
				addList(obj);
			},
			error : function(reject) {
				console.log('[error!!!!!!!]'+reject);
				}
			})
	})
	
	// 테이블 한건 클릭시 입력폼으로
	$('.trNo').on('click',function() {
		$.ajax({
			url: 'SelectOneServlet',
			type: 'POST',
			data : { no : $('trNo').attr('no') },
			dataType: 'json',
			success: function(obj) {
				$('#id').val(obj.id);
				$('#name').val(obj.name);
				$('#tel').val(obj.tel);
				$('#address').val(obj.address);
				$('#brith').val(obj.brith);
			},
			error : function(reject) {
				console.log('[error!!!!!!!]'+reject);
				}
			})
	})
	
		

	
	
	
});
	
// 입력한거 추가
function addList(obj){
	let tbody = $('<tbody />');
	let tr = $('<tr />');
	let td1 = $('<td />').text(obj.id);
	let td2 = $('<td />').text(obj.name);
	let td3 = $('<td />').text(obj.tel);
	let td4 = $('<td />').text(obj.address);
	let td5 = $('<td />').text(obj.birth);
	$(tr).append(td1, td2, td3, td4, td5);
	$(tbody).append(tr);
	$('#selectTable').append(tbody);
}
	


// 조회테이블 thead
function thead() {
	let thead = $('<thead />');
	let tr = $('<tr />');
	let td1 = $('<th />').text("아이디");
	let td2 = $('<th />').text("이름");
	let td3 = $('<th />').text("전화번호");
	let td4 = $('<th />').text("주소");
	let td5 = $('<th />').text("생일");
	$(tr).append(td1, td2, td3, td4, td5);
	$(thead).append(tr);
	$('#selectTable').append(thead);
}


// 조회
function listFnc(data) {	
	let tbody = $('<tbody />');
	let tr = $('<tr />').addClass('trNo').attr('no',data.no);
	let td1 = $('<td />').addClass('trId').text(data.id);
	let td2 = $('<td />').text(data.name);
	let td3 = $('<td />').text(data.tel);
	let td4 = $('<td />').text(data.address);
	let td5 = $('<td />').text(data.birth);
	$(tr).append(td1, td2, td3, td4, td5);
	$(tbody).append(tr);
	$('#selectTable').append(tbody);
}
</script>
<title>TEST</title>
</head>
<body>
	<div class="container">
		<br>
		<!-- 입력,조회,수정 -->
		<div class="row">
			<div class="col-12">
				<form id="frm" name="frm">
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
						<tr>
							<td>주소 :</td>
							<td><input type="text" id="address" name="address"></td>
							<td></td>
							<td><button class="btn btn-primary" type="button">삭제하기</button></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<br>
		<!-- 결과 -->
		<div class="row">
			<div class="col-12">
				<table id="selectTable" class="table table-bordered">
					<thead>
						<tr class="text-center">
							<th>아 이 디</th>
							<th>이 름</th>
							<th>연 락 처</th>
							<th>주 소</th>
							<th>생년월일</th>
						</tr>
					</thead>

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