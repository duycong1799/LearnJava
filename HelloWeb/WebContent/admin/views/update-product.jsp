<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Update Product</title>
</head>
<body>
<!-- <input name="id" value="${p.id }" type="text" readonly="readonly">
		<input name="name" value="${p.name }" type="text">
		<input name="description" value="${p.description }" type="text">
		<input name="price" value="${p.price }" type="text">
		<input name="note" value="${p.note }" type="note">
		<input name="categoryId" value="${p.categoryId }" type="text"> -->
	
		
		
		<h1 align="center">Update Products</h1>
<div class="container">
<form action="/HelloWeb/admin/product/update" method="post">

<div class="form-group">
<label>ID:</label>
<input class="form-control" name ="id" value="${p.id }" type="text" readonly="readonly" >
</div>

<div class="form-group">
<label>Name:</label>
<input class="form-control" name ="name" value="${p.name }" type="text">
</div>

<div class="form-group">
<label>Description:</label>
<input class="form-control" name ="description" value="${p.description }" type="text">
</div>

<div class="form-group">
<label>Price:</label>
<input class="form-control" name ="price" value="${p.price }" type="text"> 
</div>

<div class="form-group">
<label>Note:</label>
<input class="form-control" name ="note" value="${p.note }" type="text">
</div>

<div class="form-group">
<label>CategoryName:</label>
<input  class="form-control" name="categoryId" value="${p.categoryId }" type="text">
</div>

 

<button class="btn btn-primary" type="submit">Update</button>
</form>
</div>
	
<!--  	<div class="form-group">
<label>CategoryName:</label>
<select class="form-control" name="categoryId">
<c:forEach items="${productcategories}" var="p">
<option class="form-control" value="${p.id}">${p.name}</option>
</c:forEach>
</select>
</div>

<div class="form-group">
<label>CategoryName:</label>
<select class="form-control" name="categoryId" value="${p.categoryId }" type="text">

</select>
</div>-->

		
	</form>
</body>
</html>