<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi tiet nguoi dung</title>
</head>
<body>
	<p>Id: ${u.id }</p>
	<p>Name: ${u.name}</p>
	<p>Username: ${u.username}</p>
	<p>Pass: ${u.password}</p>
	<p>Age:  ${u.age}</p>
	<p>Gender: ${u.gender}</p>
	<p>Role: ${u.role}</p>
	<p> <img src="${u.image}"/> </p>
</body>
</html>