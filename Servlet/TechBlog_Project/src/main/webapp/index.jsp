<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tech Blog home page</title>

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
.banner-background{
clip-path: polygon(0 0, 100% 0, 100% 30%, 100% 94%, 68% 88%, 29% 94%, 0 88%, 0% 30%);
}
</style>
</head>
<body>

	<!-- navbar -->
	<%@include file="normal_navbar.jsp"%>

	<!--Banner -->
	<div class="container-fluid bg-warning m-0 py-5 banner-background">
		<div class="jumbotron text-white">
			<div class="container">
				<h3 class="display-3">Welcome to Tech Blog</h3>
				<p>Welcome to technical blog, world of technology A programming
					language is a system of notation for writing computer programs.[1]
					Most programming languages are text-based formal languages, but
					they may also be graphical. They are a kind of computer language.</p>
				<p>The description of a programming language is usually split
					into the two components of syntax (form) and semantics (meaning),
					which are usually defined by a formal language. Some languages are
					defined by a specification document (for example, the C programming
					language is specified by an ISO Standard) while other languages
					(such as Perl) have a dominant implementation that is treated as a
					reference. Some languages have both, with the basic language
					defined by a standard and extensions taken from the dominant
					implementation being common.</p>
				<a class="btn btn-outline-light btn-lg" href="RegisterPage.jsp">
					<span class="fa fa-user-plus"></span> Start ! its free
				</a>
				<a class="btn btn-outline-light btn-lg mx-3" href="LoginPage.jsp">
					<span class="fa fa-user-circle fa-spin"></span> Login
				</a>
			</div>
		</div>
	</div>
	<br>
	<div class="container">
		<div class="row mb-2">
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Read More</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Read More</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Read More</a>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Read More</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Read More</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Read More</a>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%
	Connection con = ConnectionProvider.getConnection();
	// 	PreparedStatement pstmt = con.prepareStatement("select * from teacher");
	// 	ResultSet set = pstmt.executeQuery();
	// 	while (set.next()) {
	// 		out.print(set.getInt(1)+" ");
	// 		out.println(set.getString(2));
	// 	}
	%>

	<!-- javascript -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

	<!--jQyery -->
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>
	<!--own js file -->
	<script src="js/myjs.js" type="text/javascript"></script>

	<!--write script -->
	<script>
		
	</script>
</body>
</html>