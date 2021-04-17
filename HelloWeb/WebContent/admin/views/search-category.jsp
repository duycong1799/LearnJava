
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
<title>Search Category</title>
<style>
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav .search-container {
  float: right;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.topnav .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}
</style>

</head>
<body>

<!-- <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
<form class="form-inline" action="/HelloWeb/admin/category/search" method="post">
		<input class="form-control mr-sm-2" name="keyword" type="text" value="${key}" placeholder="Tim kiem....">
		<button class="btn btn-success" type="submit">Search</button>

	</form>
</nav> -->



<form action="/HelloWeb/admin/category/search" method="post">
		<div class="topnav">
  <a class="active" href="/HelloWeb/admin/views/index.jsp">Home</a>
  <a href="/HelloWeb/admin/user/search">User</a>
  <a href="/HelloWeb/admin/product/search">Product</a>
  <input name="keyword" value="${key}" type="text" placeholder="Search...">
  <button type="submit">Search</button>
</div>
		
	</form>

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
			<a href="/HelloWeb/admin/category/delete?id=${category.id}">Delete</a>
			<a href="/HelloWeb/admin/category/detail?id=${category.id}">Show</a>
			<a href="/HelloWeb/admin/category/update?id=${category.id}">Edit</a>
			</td>
		</tr>
</c:forEach>
		
	</table>
	<a href="/HelloWeb/admin/category/add">Add</a>
	</div>
</body>
</html>