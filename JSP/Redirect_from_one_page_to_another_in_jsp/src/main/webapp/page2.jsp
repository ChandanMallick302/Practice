<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page-2</title>
</head>
<body>
	<h1>This is Page-2</h1>
	<a href="index.jsp">Go to home page</a>

	<!--set auto Redirection -->
	<%
		out.print("wait redirecting......");
		response.sendRedirect("index.jsp");
	%>
</body>
</html>