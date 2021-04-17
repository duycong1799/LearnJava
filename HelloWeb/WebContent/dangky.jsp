<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>register.html</title>
</head>

<body>
<div>
  <label>Name:</label>
    <input type="text" name="yourname" placeholder="Nhap ten cua ban">
  
	</div>
	
	<div>
		<label>Age:</label>
		<input type"text" name="age" placeholder="Nhap tuoi cua ban">
	
	</div>
	
	<div>
		<label>Address:</label>
		<input type="text" name="address" placeholder="Nhap dia chi cua ban">
			   
	</div>
	
	<div>
			<label>Gender:</label> 
			<input type="radio" name="gender" value="M" checked=""> Nam
			<input type="radio" name="gender" value="F"> Nu
			<input type="radio" name="gender" value="U"> N/A
   </div>
	
   <div>
	   <label>Hobies:</label>
	   <textarea name="note"></textarea>
   </div>
	
	<div>
	   <label>Introduce:</label>
	   <textarea name="note"></textarea>
   <div>
			<label>Thanh Pho:</label>
			<select name="city">
				<option value="HN">Ha noi</option>
				<option selected="" value="HCM">HCM</option>
				<option value="DN">Da Nang</option>
			</select>
		</div>
	<div>
		<label>Username:</label>
		<input type="text" name="username" placeholder="Nhap username">
		
	</div>
		
	<div>
		<label>Password:</label>
		<input type="password" name="password" placeholder="Nhap password">
		
	</div>
		
	<div>
			<button type="submit">Dang ky</button>
			<input type="submit" value="Dang ky">
			<button type="button">Button</button>
			<button type="reset">Reset</button>
		</div>
</body>
</html>
