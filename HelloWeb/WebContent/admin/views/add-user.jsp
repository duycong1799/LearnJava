<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
<!-- Custom stlylesheet -->
		<link type="text/css" rel="stylesheet" href="/HelloWeb/admin/css/sty.css"/>
</head>
<body>
	<form action="/HelloWeb/admin/user/add" method="post">
	<!-- <label>Name :</label>
		<input name="name" type="text">
		<label>UserName :</label>
		<input name="username" type="text">
		<label>Password :</label>
		<input name="password" type="password">
		<label>Gender :</label>
		<input name="gender" type="radio" value="Nam">Nam
		<input name="gender" type="radio" value="Nu">Nu
		<label>Age :</label>
		<input name="age" type="number">
		<label>Image :</label>
		<input name="image" type="text">
		<label>Role :</label>
		<select name="role">
			<option value="ROLE_ADMIN">ROLE_ADMIN</option>
			<option value="ROLE_MEMBER">ROLE_MEMBER</option>
		</select>	
		<button type="submit" align="center">Them</button> -->
	    <div class="container">
    <h1>Register Account</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
    
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter UserName" name="username" required>
    
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    
    <label for="gender"><b>Gender</b></label>
    <input type="text" placeholder="Enter Gender" name="gender" required>

    <label for="age"><b>Age</b></label>
    <input type="number" placeholder="Enter Age" name="age" required>

    <label for="image"><b>Image</b></label>
    <input type="text" placeholder="Enter Image" name="image" required>
    
    <select name="role">
            
			<option value="ROLE_ADMIN">ROLE_ADMIN</option>
			<option value="ROLE_MEMBER">ROLE_MEMBER</option>
	</select>

    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Submit</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="/HelloWeb/admin-login">Sign in</a>.</p>
  </div>
	</form>
	
</body>
</html>