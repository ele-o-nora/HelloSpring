<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 5 MVC</title>
<%@ page isELIgnored="false"%>
</head>
<body>
	<h2>Hello, <span style="color:red">${name}</span>. Welcome to Spring MVC!</h2>
	<br/>
	<a href="addname">Add a name to DB</a>
	<br/>
	<a href="greetbyid">Greet by id</a>
</body>
</html>