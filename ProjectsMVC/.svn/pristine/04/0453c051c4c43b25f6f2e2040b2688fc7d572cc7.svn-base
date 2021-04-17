
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
<form class="form-inline" action="/ProjectsMVC/admin/category/search" method="post">
		<input class="form-control mr-sm-2" name="keyword" type="text" value="${key}" placeholder="Tim kiem....">
		<button class="btn btn-success" type="submit">Search</button>

	</form>
</nav>

<div class="container">
	<table class="table table-dark table-striped">
		<tr>
			<td>ID</td>
			<td>Name</td>			
			<td>Action</td>			
		</tr>

		<c:forEach items="${categoryList}" var="category" >

		<tr>
			<td>${category.id }</td>
			<td>${category.name }</td>			
			<td>
			<a href="/ProjectsMVC/admin/category/delete?id=${category.id}">Delete</a>
			<a href="/ProjectsMVC/admin/category/detail?id=${category.id}">Show</a>
			<a href="/ProjectsMVC/admin/category/update?id=${category.id}">Edit</a>
			</td>
		</tr>
</c:forEach>
		
	</table>
	<a href="/ProjectsMVC/admin/category/add">Add</a>
	</div>
</body>
</html>