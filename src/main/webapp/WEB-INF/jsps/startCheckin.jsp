<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start CheckIn</title>
</head>
<body>
	<h2>Start CheckIn</h2>
	<form action="proceedChekIn" method = "post">
		<table>
			<tr>
				<td>Enter Your Reservation Id</td>
				<td><input type="text" name="id" /></td>
			</tr>
			
			<tr>
				<td><input type="Submit" value="start" /></td>
			</tr>

		</table>
	</form>
</body>
</html>