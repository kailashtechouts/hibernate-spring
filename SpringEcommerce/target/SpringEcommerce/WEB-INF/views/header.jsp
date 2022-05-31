<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style type="text/css">
.header {
	background-color:brown;
	padding: 20px 10px;
}

.header a {
	color: white;
	text-align: center;
	padding: 10px;
	text-decoration: none;
}

.header a.logo {
	font-size: 30px;
	font-weight: bold;
}

.logo img {
	width: 50px;
	height: 40px;
}
.header-left {
	display: flex;
	list-style-type: none;
	margin-left: 0px;
	justify-content: space-around;
	padding: 0px;
}

.header-center {
	outline-color: white;
	color: white;
	padding-top: 15px;
}

.header-right {
	display: flex;
	justify-content: space-around;
	padding: 0px;
	font-size: 13px;
	list-style-type: none;
}

.buttons {
	border-radius: 7px;
	font-weight: 500px;
	background-color: black;
}
</style>
</head>
<body>
	<header>
		<div class="header">

			<ul class="header-left">
				<li><a href="deafult.asp" class="logo"><img
						src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyjErq4K9T0yZqmHvlYfTncPzvLM-iKsNIcA&usqp=CAU"
						alt="logo"></a></li>
				<li><button class="buttons">
						<a href="/SpringEcommerce/plp/Men"> MEN</a>
					</button></li>
				<li><button class="buttons">
						<a href="/SpringEcommerce/plp/Women">WOMEN</a>
					</button></li>
				<li><button class="buttons">
						<a href="/SpringEcommerce/plp/Kids">KIDS</a>
					</button></li>
				<li><button class="buttons">
						<a href="#show_message">EXPLORE</a>
					</button></li>
				<li><button class="buttons">
						<a href="#show_message">SALE</a>
					</button></li>
				<li><input type="search" value=""
					placeholder="Search for Products and Brands More"
					style="width: 250px; height: 30px; border-radius: 10px; border: 1px solid black;"></li>
				<li><button class="buttons">
						<a href="/SpringEcommerce/cart"><svg
								xmlns="http://www.w3.org/2000/svg" width="20" height="20"
								fill="currentColor" class="bi bi-cart4" viewBox="0 0 16 16">
                            <path
									d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z" />
                          </svg></a>
					</button></li>
				<li><button class="buttons">
						<a href="/SpringEcommerce/order">ORDER</a>
					</button></li>
				<li><button class="buttons">
						<a href="/SpringEcommerce/logout">LOGOUT</a>
					</button></li>
			</ul>
		</div>
	</header>
</body>
</html>