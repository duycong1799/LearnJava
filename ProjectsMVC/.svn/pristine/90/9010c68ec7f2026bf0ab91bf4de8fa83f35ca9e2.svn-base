<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Update Users</h1>
	<div class="container">
		<form action="/ProjectsMVC//admin/user/update" method="post">
			<div class="form-group">
				<label>Id:</label> <input class="form-control" name="id"
					value="${u.id }" type="text" readonly="readonly">
			</div>
			<div class="form-group">
				<label>Name:</label> <input class="form-control" name="name"
					value="${u.name }" type="text">
			</div>
			<div class="form-group">
				<label>Username:</label> <input class="form-control" name="username"
					value="${u.username }" type="text">
			</div>
			
			
			<div class="form-group">
				<label>Password:</label> <input class="form-control" name="password"
					value="${u.password }" type="password">
			</div>
			
			<c:if test="${u.gender=='Nam' }">
			<div class="form-check-inline">
				<label class="form-check-label">
						
						<input class="form-check-input" name="gender" type="radio"
							value="Nam" checked="checked">Nam

				</label>
			</div>
			
			<div class="form-check-inline">
				<label class="form-check-label"> <input
					class="form-check-input" name="gender" type="radio" value="Nu">Nữ
				</label>
			</div>
			</c:if>
			
			<c:if test="${u.gender=='Nu' }">
			<div class="form-check-inline">
				<label class="form-check-label">
						
						<input class="form-check-input" name="gender" type="radio"
							value="Nam" >Nam

				</label>
			</div>
			
			<div class="form-check-inline">
				<label class="form-check-label"> <input
					class="form-check-input" name="gender" type="radio" value="Nu" checked="checked">Nữ
				</label>
			</div>
			</c:if>
			
			
			<div class="form-group">
				<label>Age:</label> <input class="form-control" name="age"
					value="${u.age }" type="number">
			</div>
			<div class="form-group">
				<label>Image:</label> <input class="form-control" name="image"
					value="${u.image }" type="text">
			</div>
			<div class="form-group">
				<label>Role:</label> <select class="form-control" name="role">
					<option value="ROLE_ADMIN">ROLE ADMIN</option>
					<option value="ROLE_MEMBER">ROLE_MEMBER</option>
				</select>
			</div>

			<button type="submit">Update</button>
		</form>
	</div>
</body>
</html>