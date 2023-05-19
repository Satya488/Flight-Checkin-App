<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
	<h2>Reservation Details</h2>
	<table border="1">
		<tr>
			<td>Passenger Name</td>
			<td>${reservation.getPassenger().firstName}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${reservation.getPassenger().email}</td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td>${reservation.getPassenger().mobile}</td>
		</tr>
		<tr>
			<td>Operating AirLines</td>
			<td>${reservation.getFlight().operatingAirlines}</td>
		</tr>
		<tr>
			<td>Flight Number</td>
			<td>${reservation.getFlight().flightNumber}</td>
		</tr>
		<tr>
			<td>Departure City</td>
			<td>${reservation.getFlight().departureCity}</td>
		</tr>
		<tr>
			<td>Arrival City</td>
			<td>${reservation.getFlight().arrivalCity}</td>
		</tr>
		<tr>
			<td>Date Of Departure</td>
			<td>${reservation.getFlight().dateOfDeparture}</td>
		</tr>
	</table>
	<h2>Update Number Of Bags & Boarding Status</h2>
	<form action="proceedToChekIn" method = "post">
	<table>
		<tr>
			<td>Reservation Id</td>
			<td><input type="text" name="id" value = "${reservation.id}"></td>
		</tr>
		<tr>
			<td>Number Of Bags</td>
			<td><input type="text" name="numberOfBags"></td>
		</tr>
		<tr>
			<td><input type="Submit" value="proceed"></td>
		</tr>
	</table>
	</form>
</body>
</html>