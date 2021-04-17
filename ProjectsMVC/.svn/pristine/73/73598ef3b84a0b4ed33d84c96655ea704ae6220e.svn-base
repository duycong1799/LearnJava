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

<h1 align="center">Update Products</h1>
<div class="container">
<form action="/ProjectsMVC//admin/product/update" method="post">

<div class="form-group">
<label>ID:</label>
<input class="form-control" name ="id" type="text" value="${p.id}" readonly="readonly">
</div>

<div class="form-group">
<label>Name:</label>
<input class="form-control" name ="name" type="text" value="${p.name}" >
</div>

<div class="form-group">
<label>CategoryId:</label>
<input class="form-control" name ="categoryId" type="text" value="${p.categoryId}" >
</div>

<div class="form-group">
<label>Description:</label>
<input class="form-control" name ="description" type="text" value="${p.description}">
</div>

<div class="form-group">
<label>Price:</label>
<input class="form-control" name ="price" type="text" value= "${p.price}"> 
</div>

<div class="form-group">
<label>Note:</label>
<input class="form-control" name ="note" type="text" value="${p.note}">
</div>
<button class="btn btn-primary" type="submit">Update</button>
</form>
</div>
</body>
</html>