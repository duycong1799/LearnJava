<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Add Products</h1>
<div class="container">
<form action="/ProjectsMVC//admin/product/add" method="post">
<div class="form-group">
<label>Name:</label>
<input class="form-control" name ="name" type="text">
</div>

<div class="form-group">
<label>CategoryName:</label>
<select class="form-control" name="categoryId">
<c:forEach items="${categories}" var="c">
<option class="form-control" value="${c.id}">${c.name}</option>
</c:forEach>
</select>
</div>
<div class="form-group">
<label>Description:</label>
<input class="form-control" name ="description" type="text">
</div>

<div class="form-group">
<label>Price:</label>
<input class="form-control" name ="price" type="text"> 
</div>

<div class="form-group">
<label>Note:</label>
<input class="form-control" name ="note" type="text">
</div>
<button class="btn btn-primary" type="submit">Add</button>
</form>
</div>
</body>
</html>