<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gio Hang</title>
</head>
<body>

	<h2>Thong tin don hang</h2>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Nguoi Mua</td>
			<td>Ngay Mua</td>
			<td>Tong tien</td>
			<td>Action</td>
		</tr>

		<c:forEach items="${bills}" var="b">
			<tr>
				<td>${b.id }</td>
				<td>${b.buyer.name }</td>
				<td></td>
				<td>${b.priceTotal}</td>
				<td><a href="/ProjectsMVC/member/bill-product?billid=${b.id }">Xem
						chi tiet</a> <a href="/ProjectsMVC/member/bill/delete?billid=${b.id }">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>