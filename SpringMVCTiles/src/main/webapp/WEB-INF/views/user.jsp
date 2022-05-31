<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> User Form</title>
</head>
<body>
	<h2>User Details </h2>
	<form:form method="post" modelAttribute="user" action="addUser">
		<table>
			<tr>
				<td><form:label path="name"> Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
					<td><form:password path="password" name="password"	id="password" /></td>
			</tr>
			<tr>
				<td><button> <a href = "viewing">View Users</a></button> </td>
				<!--  <td><a href = "viewing">Click here to show user details</a></td>-->
			</tr>
		</table>
	</form:form>
</body>
</html>
