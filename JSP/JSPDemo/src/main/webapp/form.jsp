<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="">
<input type="text" name="name">
<button type="submit" name="click"> Click Me</button>
</form>
</div>
	
<!-- give condition -->
<%if(request.getParameter("click")!=null){
		out.print("<h1>Hello "+request.getParameter("name")+"</h1>");
}
	%>
</body>
</html>