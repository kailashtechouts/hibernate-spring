<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<!--  write some code to invalid login scenario -->
	<c:if test="${param.error !=null}">
		<i style = "color : red;">Invalid login or password</i>
	</c:if>
	
	<c:if test="${param.logout !=null}">
		<i style = "color : red;">You are successfully logged out ! sign in again</i>
	</c:if>
	
	
		<h1>My Custom Login Page</h1>
		<form:form>
		
		Username : <input type="text" name="username">
			<br></br>
		Password : <input type="Password" name="password">
			<br></br>

			<input type="submit" value="Login">
		</form:form>
</body>
</html>