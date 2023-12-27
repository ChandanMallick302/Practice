<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tech Blog home page</title>
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="container-fluid m-0 p-0">
		<nav class="navbar navbar-expand-lg navbar-dark primary-baground py-4">
			<div class="container-fluid">
				<a class="navbar-brand fs-2" href="index.jsp"><i class="fa fa-asterisk"></i>Tech
					Blog</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item fs-4"><a class="nav-link active"
							aria-current="index.jsp" href="#"><span class="fa fa-bell-o"></span>
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
							</ul></li>
						<li class="nav-item"><a class="nav-link fs-4" href="LoginPage.jsp">login</a></li>
						<li class="nav-item"><a class="nav-link fs-4" href="RegisterPage.jsp">Signup</a></li>
					</ul>
					<form class="d-flex" role="search">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-light" type="submit">Search</button>
					</form>
				</div>
			</div>
		</nav>
	</div>
</body>
</html>