<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Declarative Tag -->

<%!
    int a=20;
    int b=50;
    public int doSum(){
    	return a+b;
    }
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index page</title>
</head>
<body>

<!-- Scriplet Tag -->

<%
out.print("<h1>Value of A = "+a+"</h1>");
out.print("<br>");
out.print("<h1>Value of B = "+b+"</h1>");
%>

<!-- Expressive Tag -->

	<h1>Sum = <%=doSum()%></h1>
		
</body>
</html>