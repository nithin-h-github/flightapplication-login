<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<c:set var="req" value="${pageContext.request}" />

<!DOCTYPE html>
<html>
<head>
<title>Find Flights</title>
</head>
<body>
<h2>Find Flights</h2>
<form action="findFlights">
From:<input type="text" name="from"/>
To:<input type="text" name="to"/>
Departure Date:<input type="text" name="departureDate"/>
<input type="submit" value="search"/>
</form>
</body>
</html>