<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>
</head>
<body>
<h1>Thông tin giỏ hàng</h1>
<table border="1">
<tr>
<td>Id</td>
<td>Name</td>
<td>Desciption</td>
<td>Quantity</td>
<td>Price</td>
<td>Total Price</td>
<td>Action</td>
</tr>

<c:forEach items="${sessionScope.cart}" var="entry">
<tr>
<td>${entry.key }</td>
<td>${entry.value.product.name }</td>
<td>${entry.value.product.description }</td>
<td>${entry.value.quantity }</td>
<td>${entry.value.unitPrice }</td>
<td>${entry.value.quantity * entry.value.unitPrice}</td>
<td><a href="/ProjectsMVC/delete-from-cart?key=${entry.key }">Delete</a></td>

</tr>

</c:forEach>

</table>
<a href="/ProjectsMVC/member/add-order">Thanh Toan</a>
</body>
</html>