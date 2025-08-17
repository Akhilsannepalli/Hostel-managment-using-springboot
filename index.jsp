<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hostel Management</title>
</head>
<body>
    <h1>Welcome to Hostel Management</h1>
    <ul>
        <li><a href="showStudents">Show All Students</a></li>
        <li><a href="showHostels">Show All Hostels</a></li>
    </ul>

    <h2>Add Student</h2>
    <form action="addStudent" method="post">
        <label>Student ID:</label><input type="text" name="sid"><br>
        <label>Age:</label><input type="text" name="age"><br>
        <label>Name:</label><input type="text" name="sname"><br>
        <label>Hostel ID:</label><input type="text" name="hostelId"><br>
        <input type="submit" value="Add Student">
    </form>
</body>
</html>
