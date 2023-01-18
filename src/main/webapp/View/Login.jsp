<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.AMIDAIT.com</title>

<style>
Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: pink;
}

button {
	background-color: #4CAF50;
	width: 50%;
	color: orange;
	padding: 15px;
	margin: 10px 0px;
	border: none;
	cursor: pointer;
}

form {
	
}

input[type=text], input[type=password] {
	margin: 8px 0;
	padding: 12px 20px;
	display: inline-block;
	border: 2px solid green;
	box-sizing: border-box;
}

button:hover {
	opacity: 0.7;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	margin: 10px 5px;
}

.container {

	width: 50%;
	padding: 10px;
	background-color: lightblue;
}
</style>
</head>
<body>
	<center>
		<h1>User Login Form</h1>
	</center>
	<form>
		<div class="container">
			<label>Username : </label> <input type="text"
				placeholder="Enter Username" name="emailid" required> <label>Password
				: </label> <input type="password" placeholder="Enter Password"
				name="password" required>
			<button type="submit">Login</button>
			<input type="checkbox" checked="checked"> Remember me
			<button type="button" class="cancelbtn">Cancel</button>
			Forgot <a href="#"> password? </a>
		</div>
	</form>
</body>
</html>

