
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
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<form class="form-inline" action="/ProjectsMVC/admin/user/search" method="post">
		<input class="form-control mr-sm-2" name="keyword" value="${key}" type="text" placeholder="Tim kiem....">
		<button class="btn btn-success" type="submit">Search</button>

	</form>
</nav>


<div class="container">
  
  
	<table class="table table-dark table-striped">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>UserName</td>
			<td>PassWord</td>
			<td>Age</td>
			<td>Gender</td>
			<td>Role</td>
			<td>Image</td>
			<td>Action</td>

		</tr>
		
		<c:forEach items="${userList}" var="user">

		<tr>
			<td>${user.getId()}</td>
			<td>${user.name}</td>
			<td>${user.username}</td>
			<td>${user.getPassword()}</td>
			<td>${user.getAge()}</td>
			<td>${user.getGender()}</td>
			<td>${user.getRole()}</td>
			<td>${user.getImage()}</td>
			<td>
			<a href="/ProjectsMVC/admin/user/delete?id=${user.id}">Delete</a>	
			<a href="/ProjectsMVC/admin/user/detail?id=${user.id}">Show</a>
			<a href="/ProjectsMVC/admin/user/update?id=${user.id}">Edit</a>		
			</td>
		</tr>
		</c:forEach>
	</table>
	<a href="/ProjectsMVC/admin/user/add">Add</a>
	</div>
</body>
</html>