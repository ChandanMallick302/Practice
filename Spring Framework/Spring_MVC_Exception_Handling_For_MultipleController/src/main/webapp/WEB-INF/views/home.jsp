<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container offset-md-4 mt-4">
		<form action="submitform" method="post">
			<div class="card w-25">
				<div class="card-header text-center">
					<h2>Register Page</h2>
				</div>
				<div class="card-body">
					
						<%
						if (session.getAttribute("user1") != null) {
						%>
						<div class="alert alert-danger" role="alert">
						<form:errors path="user.*" />
						</div>
						<%
						session.invalidate();
						}
						%>
					

					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Email
							address</label> <input name="email" type="email" class="form-control"
							id="exampleFormControlInput1" placeholder="name@example.com">
					</div>

					<label for="inputPassword5" class="form-label">Password</label> <input
						name="password" type="password" id="inputPassword5"
						class="form-control" aria-describedby="passwordHelpBlock">
					<div id="passwordHelpBlock" class="form-text">Your password
						must be 8-20 characters long, contain letters and numbers, and
						must not contain spaces, special characters, or emoji.</div>

					<select name="city" class="form-select"
						aria-label="Default select example">
						<option selected>Select Your City</option>
						<option value="Balasore">Balasore</option>
						<option value="Cuttack">Cuttack</option>
						<option value="Bhubaneswar">Bhubaneswar</option>
					</select>

					<div class="mb-3">
						<label class="form-check-label">Gender</label>
					</div>

					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender"
							id="flexRadioDefault1" value="male"> <label
							class="form-check-label" for="flexRadioDefault1">Male </label>
					</div>

					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender"
							id="flexRadioDefault1" value="female"> <label
							class="form-check-label" for="flexRadioDefault1"> Female
						</label>
					</div>

					<div class="mb-3">
						<label for="age" class="form-label">Age</label> <input name="age"
							type="text" id="age" class="form-control"
							placeholder="Enter Yor Age">
					</div>

					<div class="mb-3 offset-	md-4">
						<input class="btn btn-primary" type="submit" value="Submit">
					</div>
				</div>
			</div>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>