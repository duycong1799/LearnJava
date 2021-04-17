<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>
	<form action="/HelloWeb/admin/product/add" method="post">
	    <label>Name :</label>
		<input name="name" type="text">
		<label>Description :</label>
		<input name="description" type="text">
		<label>Price :</label>
		<input name="price" type="text">
		<label>Note :</label>
		<input name="note" type="text">
		<div class="form-group">

		<div class="form-group">
		<label>CategoryName:</label>
		<select class="form-control" name="categoryId">
		<c:forEach items="${productcategories}" var="c">
		<option class="form-control" value="${c.id}">${c.name}</option>
		</c:forEach>
		</select>
		</div>
		<button type="submit">Them Product</button>
	</form>
</body>
</html>