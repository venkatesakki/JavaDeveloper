<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style ="text-align: center">${title}</h1>

<h4>Personal Details</h4>
<table>
<tr>
<td>First Name</td>
<td>Last Name</td>
<td>Hobbies</td>
<td>Qualification</td>
</tr>
<tr>
<td>${added.firstName}</td>
<td>${added.lastName}</td>
<td>${added.hobbies[0]} ${added.hobbies[1]} ${added.hobbies[2]}</td>
<td>${added.qualification}</td>
</tr>
</table>

</body>
</html>