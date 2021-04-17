<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Chi tiet nguoi dung</title>
</head>
<body>

	<p>ID: ${u.id }</p>
	<p>Name: ${u.name }</p>
	<p>Username: ${u.username }</p>
	<p>Password: ${u.password }</p>
	<p>Role: ${u.role }</p>
	<p>Age: ${u.age }</p>
	<p>Gender: ${u.gender }</p>
	<p>
		<img src=" ${u.image }" />
	</p>
</body>
</html>