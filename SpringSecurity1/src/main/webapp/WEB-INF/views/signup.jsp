<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Sign Up Here</h1>
	<form:form action = "process-signup" method = "POST" modelAttribute="signupdto">
	
	Username:<form:input path = "username"/><br></br>
	Password:<form:password path = "password"/><br></br>
	<input type = "submit" value = "signup">
	
	</form:form>
</body>
</html>