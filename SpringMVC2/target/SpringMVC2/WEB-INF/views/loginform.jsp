<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: orange;">
	<div
		style="text-align: center; margin-left: 550px; margin-right: 550px; margin-top: 150px; border-style: solid; border-width: medium; padding: 20px;">
		<h1>Registration Page</h1>
		<form:form id="userForm"  action="login"
			method="post">

			<table align="center">
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name" name="name" id="name" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input path="email" name="email" id="email" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:password path="password" name="password"	id="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="login" /></td>
				</tr>
			</table>
		</form:form>
	</div>
>
	
</body>
</html>