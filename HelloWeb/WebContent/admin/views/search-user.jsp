<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search user</title>
<!-- Top CSS Table -->
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
<!-- End CSS Table -->

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
	<form action="/HelloWeb/admin/user/search" method="post">
		<div class="topnav">
  <a class="active" href="/HelloWeb/admin/views/index.jsp">Home</a>
  <a href="/HelloWeb/admin/product/search">Product</a>
  <a href="/HelloWeb/admin/category/search">Category</a>
  <input name="keyword" value="${key}" type="text" placeholder="Search...">
  <button type="submit">Search</button>
</div>
		
	</form>
	
	
	
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Username</th>
			<th>Password</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Role</th>
			<th>Image</th>
			<th>Action</th>
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
					<a href="/HelloWeb/admin/user/delete?id=${user.id}">Xoa</a>
					<a href="/HelloWeb/admin/user/detail?id=${user.id}">Xem</a>
					<a href="/HelloWeb/admin/user/update?id=${user.id}">Sua</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="/HelloWeb/admin/user/add">Add User</a>
</body>
</html>