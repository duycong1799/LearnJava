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
  <a href="/HelloWeb/admin/user/search" class="list-group-item list-group-item-action-dark">User</a>
  <a href="/HelloWeb/admin/product/search" class="list-group-item list-group-item-action-dark">Product</a>
  <a href="/HelloWeb/admin/category/search" class="list-group-item list-group-item-action-dark">Category</a>
  <a href="/HelloWeb/checkout" class="list-group-item list-group-item-action-dark">Checkout</a>
  <a href="/HelloWeb/store" class="list-group-item list-group-item-action-dark">Store</a>
  
</div>
</th>



<th>
<div class="btn-group">
  <button type="button" class="btn btn-primary">Profile</button>
  <button type="button" class="btn btn-primary" >Message</button>
  <div class="btn-group">
    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
       More
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="/HelloWeb/admin/logout">Đăng xuất</a>
      <a class="dropdown-item" href="#">Cài đặt</a>
    </div>
  </div>
</div>
</th>
</tr>


</table>
</div>
<img alt="" src="12.jpg" text-align: center>
</body>
</html>