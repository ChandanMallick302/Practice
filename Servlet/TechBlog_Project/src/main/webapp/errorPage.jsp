<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sorry !! Some thing went wrong</title>

<!-- Bootstrap css -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<!-- font-awosome link -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--own css -->
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.banner-background {
	clip-path: polygon(0 0, 100% 0, 100% 30%, 100% 94%, 68% 88%, 29% 94%, 0 88%, 0% 30%
		);
}
</style>
</head>
<body>
<div class="container text-center">
<img alt="" src="images/erroricon1.png" class="img-fluid">
<h3 class="display-3">Sorry !! Some thing went wrong</h3>
<%=exception %>
<a class="btn btn-primary btn-lg text-white mt-3" href="index.jsp">Home</a>
</div>
</body>
</html>