<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<img style="width: 352px; height: 360px;"
			src="${pd.getProductImageUrl() }">
	</div>
	<b>${pd.getProductName()}</b>
	<p>Price :${pd.getProductPrice()}</p>
	<p>${pd.getProductDesc()}</p>

	<form action="/SpringEcommerce/cart/${pd.getId()}" method="post">
		<input type="submit" value="Add To Cart">
		<div>
			<a href="/SpringEcommerce/main-page">Cancel</a>
		</div>
	</form>

</body>
</html>