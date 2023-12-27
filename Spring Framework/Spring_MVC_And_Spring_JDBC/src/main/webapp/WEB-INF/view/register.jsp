<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<style type="text/css">
button {
	width: 10em;
	background: blue;
	color: white;
	font: bold;
}
</style>
</head>
<body>
	<form action="userregister" method="post">
		<div align="center">
			<table border="1px solid balck">
				<thead>
					<h2>Ragister Here</h2>
					<span>${success}</span>
				</thead>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"></td>
				</tr>

				<tr>
					<td>Age</td>
					<td><input type="number" name="age"></td>
				</tr>
				<tr>
					<td colspan="2"><div align="center">
							<button type="submit">Submit</button>
						</div></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>