<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body style="background-color: powderblue;">
	<div
		style="text-align: center; margin-left: 550px; margin-right: 550px; margin-top: 150px; border-style: solid; border-width: medium; padding: 20px;">
		<h1>Registration Page</h1>
		<form:form id="register" modelAttribute="contact" action="signup"
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
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>