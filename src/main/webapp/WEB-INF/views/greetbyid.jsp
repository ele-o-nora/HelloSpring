<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 5 MVC</title>
<%@ page isELIgnored="false"%>
</head>
<body>
	<h2>Enter the id to greet:</h2>
	<form action="processform2" method="get">
		<select name="id">
		<c:forEach var="p" items="${personsList}">
			<option value="${p.id}">${p.id}</option>
		</c:forEach>
		</select> <input type="submit" />
	</form>
</body>
</html>