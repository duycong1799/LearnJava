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

<h1 align="center">Update Category</h1>
<div class="container">
<form action="/HelloWeb/admin/category/update" method="post">

<div class="form-group">
<label>ID:</label>
<input class="form-control" name ="id" type="text" value="${u.id}" readonly="readonly">
</div>

<div class="form-group">
<label>Name:</label>
<input class="form-control" name ="name" type="text" value="${u.name}" >
</div>

<button class="btn btn-primary" type="submit">Update</button>
</form>
</div>
</body>
</html>