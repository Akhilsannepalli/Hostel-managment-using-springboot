<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Added</title>
</head>
<body>
    <h1>Student Added Successfully!</h1>
    <p><b>ID:</b> ${student.sid}</p>
    <p><b>Name:</b> ${student.sname}</p>
    <p><b>Age:</b> ${student.age}</p>
    <p><b>Hostel ID:</b> ${student.hostel.rno}</p>

    <a href="showStudents">View All Students</a> |
    <a href="/">Go Home</a>
</body>
</html>
