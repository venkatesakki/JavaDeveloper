<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 style ="text-align: center">${heading}</h1>

<h4>Add Student</h4>
<table>
<tr>
<td>Employee id</td>
<td>Employee Age</td>
<td>Employee Name</td>
<td>Employee Designation</td>
<td>Employee PhoneNumber</td>
<td>Employee Salary</td>

</tr>
<tr>
<td>${added.empId}</td>
<td>${added.name}</td>
<td>${added.age}</td>
<td>${added.designation}</td>
<td>${added.phoneNo}</td>
<td>${added.salary}</td>
</tr>
</table>

</body>
</html>