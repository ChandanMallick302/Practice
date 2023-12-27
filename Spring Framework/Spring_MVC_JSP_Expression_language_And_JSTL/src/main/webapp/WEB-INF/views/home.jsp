<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Home Page</h1>

	<table border="1px solid black">
		<tr align="center">
			<td><h1>Name</h1></td>
			<td><h1>Roll No</h1></td>
			<td><h1>Date and Time</h1></td>
			<td colspan="3"><h1>Subject List</h1></td>
		</tr>
		<tr align="center">
			<td><h2>${name}</h2></td>
			<td><h2>${roll}</h2></td>
			<td><h2>${time}</h2></td>
			<c:forEach items="${subject}" var="x">
				<td><h2><c:out value="${x}"/> </h2></td>
			</c:forEach>
		</tr>
	</table>

</body>
</html>