<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#orderList {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#orderList td, #orderList th {
	border: 1px solid #ddd;
	padding: 8px;
}

#orderList tr:nth-child(even) {
	background-color: #f2f2f2;
}

#orderList tr:hover {
	background-color: #ddd;
}

#orderList th {
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
	<h2>Order List</h2>
	<table id="orderList">
		<tr>
			<th>Product Image</th>
			<th>Product Name</th>
			<th>Price</th>
			<th></th>
		</tr>
		<c:forEach items="${od}" var="inf">
			<tr>

				<td><img src="${inf.getProductUrl()}"></td>
				<td>${inf.getProductName()}</td>
				<td>${inf.getProductPrice()}</td>

				<td><a href="/SpringEcommerce/remove/${inf.getId()}">Remove</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</body>
</html>
