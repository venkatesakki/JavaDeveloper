<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>view Employee Details</h1>
<form method="post"><table>
<tr><td>Empid:</td><td><input type="text" name="txtEmpId" placeholder="enter employee id"></td></tr>
<tr><td>Designation:</td><td><input type="text" name="txtDesignation" placeholder="enter employee designation"></td></tr>
<tr><td>Salary:</td><td><input type='text' name=\"txtSalary\" placeholder="enter employee salary"></td></tr>
<tr><td><input type="submit" value ="submit" formaction="insertEmployee.jsp"></td></tr>
</table></form>
		

</body>
</html>