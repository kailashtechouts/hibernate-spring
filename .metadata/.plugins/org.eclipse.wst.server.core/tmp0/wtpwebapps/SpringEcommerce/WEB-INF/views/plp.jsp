<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.main {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-between;
	text-align: center;
}

.child {
	border-style: ridge;
	display: inline;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body style="background-color: floralwhite">
	<div class="main">
		<c:forEach items="${plplist}" var="data">
			<div class="child">
				<a href="/SpringEcommerce/pdp/${data.getId()}"> <img
					style="width: 200px; height: 200px;"
					src="${data.getProductImageUrl()}" alt="product" /></a><br>

				<div>
					<h2>${data.getProductName()}</h2>
					<br>
					<h3>price:${data.getProductPrice()}</h3>
					<br>
				</div>
				<div>
					<button type="button">
						<a href="/SpringEcommerce/pdp/${data.getId()}">GO TO PDP</a>
					</button>

					<button type="button">
						<a href="/SpringEcommerce/pdp/${data.getId()}">ADD TO CART</a>
					</button>
				</div>
			</div>
		</c:forEach>
	</div>
	<br>
	<br>
	<br>

</body>
</html>