<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
<h1 style ="text-align: center">${heading}</h1>

<h4>Add Student</h4>

<form action="show" method ="post">
<label>Roll NUmber</label>
<input type="text" name="rollNumber">

<label>Student Name</label>
<input type="text" name="studentName">

<label>Mark Scored</label>
<input type="text" name="mark">

<input type="submit" value="add">
</form>
</body>
</html>