<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPring Tiles Network Form</title>
</head>
<body>
	<h2>Network Manager</h2>
	<form:form method="post" action="addNetwork">
		<table>
			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" /></td>
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
				<td><input type="submit" value="Add Network" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
