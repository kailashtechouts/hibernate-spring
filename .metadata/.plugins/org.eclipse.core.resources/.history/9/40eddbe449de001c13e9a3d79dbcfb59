<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#productList {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#productList td, #productList th {
	border: 1px solid #ddd;
	padding: 8px;
}

#productList tr:nth-child(even) {
	background-color: #f2f2f2;
}

#productList tr:hover {
	background-color: #ddd;
}

#productList th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
</head>
<body style="background-color: floralwhite">
	<h2>List of Products Purchased</h2>
	<br></br>
	<table id="productList">
		<tr>
			<th>Product Image</th>
			<th>Product Name</th>
			<th>Price</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${cc}" var="ds">
			<tr>
				<td><img src="${ds.getProductUrl()}"></td>
				<td>${ds.getProductName()}</td>
				<td>${ds.getProductPrice()}</td>

				<td><a href="/SpringEcommerce/order/${ds.getId()}">Order</a></td>
				<td><a href="/SpringEcommerce/remove/${ds.getId()}">Remove</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

