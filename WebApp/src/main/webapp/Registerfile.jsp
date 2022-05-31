
<%@page import="com.webapp.java.CompanyDao"%>
<jsp:useBean id="obj" class="com.webapp.java.Company">
</jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	int x = CompanyDao.register(obj);
	if (x > 0){
		out.print("You are successfully registered");
	}
	%>
</body>
</html>
