<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

input td button{
width: 150px;
height: 25px;	
}
</style>
</head>
<body>
	<form action="createUser" method="post">
	<div align="center">
		<table border="1px solid black">
			<thead align="center">
				Register Here
			</thead>
			<tbody>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="number" name="age"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="checkbox" name="check"> Check Me out</td>
					
				</tr>
			</tbody>
			<tfoot>
			<tr>
			<td align="center"  colspan="2"><button type="submit">Submit</button> </td>
			</tr>
			</tfoot>
		</table>
		</div>
	</form>
</body>
</html>