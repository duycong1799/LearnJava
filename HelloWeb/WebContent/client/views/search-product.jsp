<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show product</title>
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
<!--<form action="/HelloWeb/sp/search" method="post">
		<input name="keyword" value="${key}" type="text" placeholder="Tim kiem...">
		<button type="submit">Search</button>
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
		<c:forEach items="${listPC}" var="pc">
			<tr>
				<td>${pc.getId()}</td>
				<td>${pc.name}</td>
				<td>${pc.description}</td>
				<td>${pc.price}</td>
				<td>${pc.note}</td>
				<td>${pc.category.name }</td>
				
			
				

				<td>
					
					<a href="/HelloWeb/client/product/detail?id=${pc.id}">Xem</a>
				</td>
			</tr>
		</c:forEach>
	</table>  -->
	
	
<form action="/HelloWeb/sp/search" method="post">
		<div class="topnav">
  <a class="active" href="/HelloWeb/client/views/index.jsp">Home</a>
  <a href="/HelloWeb/client/category/search">Category</a>
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
		<c:forEach items="${listPC}" var="pc">
			<tr>
				<td>${pc.getId()}</td>
				<td>${pc.name}</td>
				<td>${pc.description}</td>
				<td>${pc.price}</td>
				<td>${pc.note}</td>
				<td>${pc.category.name }</td>
				
			
				

				<td>
					<a href="/HelloWeb/client/product/detail?id=${pc.id}">Xem</a>
					<a href="/HelloWeb/add-to-cart?id=${pc.id}">Add to Bill</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>