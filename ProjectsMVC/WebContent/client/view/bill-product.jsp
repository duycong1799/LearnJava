<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Thong tin don hang</h2>
<div>
<p>Bill Id:${carts.id}</p>
<p>Nguoi Mua: ${carts.buyer.name }</p>
<p>Ngay mua:</p>
<p>Tong Tien:${carts.priceTotal }</p>
</div>

<h2>Danh sach san pham</h2>
<table border="1">
		<tr>
			<td>Id</td>
			<td>San pham</td>
			<td>Desciption</td>
			<td>So luong</td>
			<td>Don gia</td>
			<td>Tong tien</td>
		</tr>
		<c:forEach items="${cartItems}" var="c">
			<tr>
				<td>${c.id }</td>
				<td>${c.product.name}</td>
				<td>${c.product.description}</td>
				<td>${c.quantity }</td>
				<td>${c.unitPrice }</td>
				<td>${c.unitPrice * c.quantity}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>