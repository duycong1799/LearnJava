<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search product</title>
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
  padding: 6px;
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

    <!--<form action="/HelloWeb/admin/product/search" method="post">
		<input name="keyword" value="${key}" type="text" placeholder="Tim kiem...">
		<button type="submit">Search</button>
	</form>  -->
	
	
	<form action="/HelloWeb/admin/product/search" method="post">
		<div class="topnav">
  <a class="active" href="/HelloWeb/admin/views/index.jsp">Home</a>
  <a href="/HelloWeb/admin/user/search">User</a>
  <a href="/HelloWeb/admin/category/search">Category</a>
  <input name="keyword" value="${key}" type="text" placeholder="Search...">
  <button type="submit">Search</button>
</div>
		
	</form>
	
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Note</th>
			<th>Category</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td>${product.getId()}</td>
				<td>${product.name}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
				<td>${product.note}</td>
				<td>${product.category.name }</td>
				
			
				

				<td>
					<a href="/HelloWeb/admin/product/delete?id=${product.id}">Xoa</a>
					<a href="/HelloWeb/admin/product/detail?id=${product.id}">Xem</a>
					<a href="/HelloWeb/admin/product/update?id=${product.id}">Sua</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/HelloWeb/admin/product/add">Add Product</a>
</body>
</html>