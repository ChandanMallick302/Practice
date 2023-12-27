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
		<form action="" method="post">
			<table>
				<thead>
					<h2>Register Page</h2>
				</thead>
				<tbody>
					<tr>
						<td>Enter Name:</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Enter Age:</td>
						<td><input type="number" name="age"></td>
					</tr>
					<tr>
						<td>Enter Email:</td>
						<td><input type="email" name="email"></td>
					</tr>
					<tr>
						<td>Enter Password:</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td>Gender:</td>
						<td><input type="radio" name="gender" value="male">Male&nbsp;&nbsp;&nbsp;
							<input type="radio" name="gender" value="female">Female</td>
					</tr>
					<tr>
						<td>Hoobies:</td>
						<td><input type="checkbox" name="hobbies" value="reading">Reading
							<input type="checkbox" name="hobbies" value="browsing">Browsing<br>
							<input type="checkbox" name="hobbies" value="gaming">Gaming
							<input type="checkbox" name="hobbies" value="cooking">Cooking</td>
					</tr>
					<tr>
						<td>Country:</td>
						<td><select name="country">
								<option value="select">Select Country</option>
								<option value="India">India</option>
								<option value="USA">USA</option>
								<option value="UK">UK</option>
								<option value="Others">Others</option>
						</select></td>
					</tr>
					<tr>
						<td colspan="2">
							<div align="center">
								<input type="submit" name="register" value="Register Details">
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
	<%
	System.out.println("Hello from jsp1");
	if (request.getParameter("register") != null) {
		System.out.println("Hello from jsp2");
	%>

	<jsp:useBean id="user" class="com.model.User" scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="user" />
	<jsp:forward page="RegisterServlet"></jsp:forward>

	<%
	}
	%>


</body>
</html>