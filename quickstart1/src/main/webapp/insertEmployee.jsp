<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
<h1 style="text-align: center">${title}</h1>
<form method="post">
<table>

<tr><td>EmpId:</td><td><input type="text" name="txtEmpId" placeholder="enter employee id "></td></tr>
<tr><td>Name:</td><td><input type="text" name="txtName" placeholder="enter employee Name"></td></tr>
<tr><td>Age:</td><td><input type="text" name="txtAge" placeholder="enter employee Age "></td></tr>
<tr><td>Designation:</td><td><input type="text" name="txtDesignation" placeholder="enter employee designation"></td></tr>
<tr><td>PhoneNo:</td><td><input type="text" name="txtPhoneNo" placeholder="enter employee phoneno "></td></tr>
<tr><td>Salary:</td><td><input type="text" name="txtSalary" placeholder="enter employee salary "></td></tr>
<tr><td><input type="submit" value ="submit" formaction="view"></td></tr>
<tr><td><input type="submit" value ="update" formaction="update"></td></tr>
<tr><td><input type="submit" value ="delete" formaction="delete"></td></tr>

<tr><td><a href="ViewServlet">ViewEmployeeDetails</a></td></tr>
<tr><td><a href="SalNameServlet">ViewsalDetails</a></td></tr>
</table>
</form>
</body>
</html>