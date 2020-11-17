<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	Please enter your name:<br><br/>
	
	<form action="MyRegistrationServlet">
	Name: <input type="text" name="name"><br><br/>
	Location: <input type="text" name="location"><br><br/>
	
	<input type="submit" value="Submit">
	</form>
</body>
</html>