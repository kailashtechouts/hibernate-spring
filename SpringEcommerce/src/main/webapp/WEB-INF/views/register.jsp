<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: powderblue;">
	<div
		style="text-align: center; margin-left: 550px; margin-right: 550px; margin-top: 100px; border-style: solid; border-width: medium; padding: 20px;">
		<h2>Register Your Details</h2>
		<form:form action="process-register" method="POST"
			modelAttribute="user">
			<table align="center">
				<tr>
					<td><form:label path="username">UserName</form:label></td>
					<td><form:input path="username" name="username" id="username" /></td>
				</tr>
				<tr>
					<td><form:label path="emailId">Email</form:label></td>
					<td><form:input path="emailId" name="emailId" id="emailId" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:password path="password" name="password"
							id="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form:form>
		<a href="login1">Already Registered</a>
	</div>
</body>
</html>