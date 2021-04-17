<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/HelloWeb/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<table>
<tr>
<th>
  <div class="list-group">
  
  <a href="/HelloWeb/sp/search" class="list-group-item list-group-item-action-dark">List Product</a>
  <a href="/HelloWeb/client/category/search" class="list-group-item list-group-item-action-dark">List Category</a>
  
 
</div>
</th>
<th>
<div class="btn-group">
  <button type="button" class="btn btn-primary">Profile</button>
  <button type="button" class="btn btn-primary">Message</button>
  <div class="btn-group">
    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
       More
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="/HelloWeb/client/logout">Đăng xuất</a>
      <a class="dropdown-item" href="#">Cài đặt</a>
    </div>
  </div>
</div>
</th>
</tr>


</table>
</div>
</body>
</html>