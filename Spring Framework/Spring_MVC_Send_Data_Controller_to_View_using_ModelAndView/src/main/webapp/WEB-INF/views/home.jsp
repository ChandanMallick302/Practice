<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("name");
	int roll = (int) request.getAttribute("roll");
	List<String> studentList = (List<String>) request.getAttribute("subject");
	int i = 1;
	%>
	<h1>Welcome To home page</h1>
	<h1>
		Name:
		<%=name%></h1>
	<h1>
		Roll No:
		<%=roll%></h1>
	<h1>
		Name1:
		<%=studentList.get(0)%></h1>
	<%
	for (String s : studentList) {
	%>
	<h1>
		name<%=i%>:
		<%=s%></h1>
	<%
	i++;
	}
	%>
	<h2>
		<a href="login">Go to Login Page</a>
	</h2>
</body>
</html>