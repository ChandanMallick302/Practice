<%@page import="com.tech.blog.entities.Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

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
	<!-- navbar -->
	<%@include file="normal_navbar.jsp"%>

	<!-- login -->
	<main class="d-flex align-items-center" style="height: 80vh">
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<div class="card shadow p-0 mb-2 bg-body-tertiary rounded">
						<div class="card-header bg-success text-white text-center fs-3">
							<span class="fa fa-user-circle-o"></span> Login Here
							
													<%
						Message m = (Message) session.getAttribute("message");
						if (m != null) {
						%>
						<div class="alert <%=m.getCssClass() %> m-0 p-0" role="alert"><%=m.getContent() %></div>
						<%
						}
						session.removeAttribute("message");
						%>
							
						</div>

						<div class="card-body bg-warning text-white">

							<form action="LoginServlet" method="post">
								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label"><i
										class="fa fa-user"></i> Email address</label> <input type="email"
										class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp" placeholder="Enter Here"
										name="email" required="required"\>
									<div id="emailHelp" class="form-text">We'll never share
										your email with anyone else.</div>
								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label"><i
										class="fa fa-key"></i> Password</label> <input type="password"
										required="required" class="form-control"
										id="exampleInputPassword1" placeholder="Enter Here"
										name="password">
								</div>
								<div class="mb-3 form-check">
									<input type="checkbox" class="form-check-input"
										id="exampleCheck1" name="check" required="required">
									<label class="form-check-label" for="exampleCheck1">Check
										me out</label>
								</div>
								<div class="d-grid gap-2 col-6 mx-auto" align="center">
									<button type="submit" class="btn btn-primary btn-md fs-5">
										Login <i class="fa fa-unlock-alt"></i>
									</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>

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