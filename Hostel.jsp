<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>All Hostels</title>
</head>
<body>
    <h1>Hostels List</h1>
    <table border="1">
        <tr>
            <th>Room No (ID)</th>
            <th>Name</th>
            <th>Capacity</th>
        </tr>
        <c:forEach var="showHostels" items="${hostels}">
            <tr>
                <td>${hostel.rno}</td>
                <td>${hostel.hname}</td>
                <td>${hostel.capacity}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/">Go Home</a>
</body>
</html>
