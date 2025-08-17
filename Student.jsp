<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>All Students</title>
</head>
<body>
    <h1>Students List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Hostel ID</th>
        </tr>
        <c:forEach var="showStudents" items="${students}">
            <tr>
                <td>${student.sid}</td>
                <td>${student.sname}</td>
                <td>${student.age}</td>
                <td>${student.hostel.rno}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/">Go Home</a>
</body>
</html>
