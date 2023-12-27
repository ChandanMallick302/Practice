<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
	
	<link rel="stylesheet"
	href="<c:url value="/resource/css/mystyle.css" />">
</head>
<body>
	<h1>File Uploading</h1>
	<br>
	<div class="card">
		<form action="fileupload" method="post" enctype="multipart/form-data">
		<input type="file" name="file" class="form-control-file" id="exampleFormControlFile1"><br>
		<input type="submit" class="mb-4 col-md-6 offset-md-3 btn btn-primary btn-md">
		</form>
	</div>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

</body>
</html>