
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>
	${contact.getName()} <br>
	${contact.getEmail()} <br>
	${contact.getPassword()} <br>
</h1>
</body>
</html>