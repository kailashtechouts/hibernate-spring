<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: white;">
	<div
		style="text-align: center; border-style: solid; border-width: medium; margin-left: 500px; margin-right: 500px; margin-top: 250px; padding: 50px; background-color: floralwhite;">
		<form:form action="product-form" modelAttribute="productDetails"
			method="POST">
			<table align="center">
				<tr>
					<td><form:label path="productName">Product Name</form:label></td>
					<td><form:input path="productName" name="productName"
							id="productName" /></td>
				</tr>
				<tr>
					<td><form:label path="productDesc">Product Description</form:label></td>
					<td><form:input path="productDesc" name="productDesc"
							id="productDesc" /></td>
				</tr>
				<tr>
					<td><form:label path="productPrice">Product Price</form:label></td>
					<td><form:input path="productPrice" name="productPrice"
							id="productPrice" /></td>
				</tr>
				<tr>
					<td><form:label path="productImageUrl">Image URL</form:label></td>
					<td><form:input path="productImageUrl" name="productImageUrl"
							id="productImageUrl" /></td>
				</tr>
				<tr>
					<td><form:label path="productCtg">Category</form:label></td>
					<td><form:input path="productCtg" name="productCtg"
							id="productCtg" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Add Product"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>