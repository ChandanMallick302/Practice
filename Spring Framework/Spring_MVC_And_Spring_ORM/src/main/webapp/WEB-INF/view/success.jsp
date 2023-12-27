<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<h1>Registered Successfull</h1>
<hr>
<h2>Name:- ${user.name } </h2>
<h2>Password:-${user.password } </h2>
<h2>Address:- ${user.address } </h2>
<h2>Age:- ${user.age }</h2>
</body>
</html>