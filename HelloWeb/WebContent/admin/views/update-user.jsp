<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
<!-- Custom stlylesheet -->
		<link type="text/css" rel="stylesheet" href="/HelloWeb/admin/css/sty.css"/>
</head>
<body>
	<form action="/HelloWeb/admin/user/update" method="post">
	<!-- <input name="id" value="${u.id }" type="text" readonly="readonly">
		<input name="name" value="${u.name }" type="text">
		<input name="username" value="${u.username }" type="text">
		<input name="password" value="${u.password }" type="password">
		
		<c:if test="${u.gender == 'Nam' }">
			<input checked="checked" name="gender" type="radio" value="Nam">Nam
			<input name="gender" type="radio" value="Nu">Nu
		</c:if>
		<c:if test="${u.gender == 'Nu' }">
			<input  name="gender" type="radio" value="Nam">Nam
			<input checked="checked" name="gender" type="radio" value="Nu">Nu
		</c:if>
		
		<input name="age" value="${u.age }" type="number">
		<input name="image" value="${u.image }" type="text">
		
		<select name="role">
			<option value="ROLE_ADMIN">ROLE_ADMIN</option>
			<option value="ROLE_MEMBER">ROLE_MEMBER</option>
		</select>	
		
		<button type="submit">Update</button> -->
		
		
		 <h1>Update Account</h1>
    <p>Please fill in this form update account.</p>
    <hr>
    
    <label for="id"><b>ID</b></label>
    <input name="id" value="${u.id }" type="text" readonly="readonly">
    
    <label for="name"><b>Name</b></label>
    <input type="text" value="${u.name }" name="name" required>
    
    <label for="username"><b>Username</b></label>
    <input type="text" value="${u.username }" name="username" required>
    
    <label for="password"><b>Password</b></label>
    <input type="password" value="${u.password }" name="password" required>
    
    <label for="gender"><b>Gender</b></label>
    <c:if test="${u.gender == 'Nam' }">
			<input checked="checked" name="gender" type="radio" value="Nam">Nam
			<input name="gender" type="radio" value="Nu">Nu
		</c:if>
	<c:if test="${u.gender == 'Nu' }">
			<input  name="gender" type="radio" value="Nam">Nam
			<input checked="checked" name="gender" type="radio" value="Nu">Nu
		</c:if>	
		<label>      </label>
    <div class="form-group">
<label><b>Age</b></label>
<input class="form-control" name ="age" value="${u.age }" type="number" required>
</div>
    

    <label for="image"><b>Image</b></label>
    <input type="text" value="${u.image }" name="image" required>
    
    <select name="role">
            
			<option value="ROLE_ADMIN">ROLE_ADMIN</option>
			<option value="ROLE_MEMBER">ROLE_MEMBER</option>
	</select>

    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Update Account</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="/HelloWeb/admin-login">Sign in</a>.</p>
  </div>
		
	</form>
</body>
</html>