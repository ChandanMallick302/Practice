<%@page import="com.tech.blog.entities.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile page</title>
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

	<%
	User u = (User) session.getAttribute("currentUser");
	String name = u.getName();
	%>

	<!-- admin navbar -->
	<div class="container-fluid m-0 p-0">
		<nav class="navbar navbar-expand-lg navbar-dark primary-baground py-4">
			<div class="container-fluid">
				<a class="navbar-brand fs-2" href="index.jsp"><i
					class="fa fa-asterisk"></i>Tech Blog</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item fs-4"><a class="nav-link active"
							aria-current="index.jsp" href="#">
								Learning portal</a></li>
						<li class="nav-item"><a class="nav-link fs-4" href="#"><span
								class="fa fa-address-card-o"></span> Contact</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle fs-4" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Categories </a>
							<ul class="dropdown-menu">
								<li><a class="dropdown-item fs-3" href="#">Programing
										Language</a></li>
								<li><a class="dropdown-item fs-3" href="#">Data
										Structure</a></li>
								<li><hr class="dropdown-divider fs-3"></li>
								<li><a class="dropdown-item fs-3" href="#">Project
										Implementation here</a></li>
							</ul>
					</ul>
					<ul class="navbar-nav me-right">
						<li class="nav-item"><a class="nav-link fs-4"
							href="profile.jsp"><span class="fa fa-bell-o"></span> <%=name %></a></li>
						<li class="nav-item"><a class="nav-link fs-4"
							href="LogOutServlet">logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<!-- end of navbar -->




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