<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p style="color:green"><c:out value="${message}"/></p>
<form action="student" method="post">
	<div><label for="">Student Id</label><input type="text" name="studentId"/></div>
	<div><label for="">Student Name</label><input type="text" name="studentName"/></div>
	<div><label for="">Student Mailid</label><input type="text" name="studentMailid"/></div>
	<div><label for="">Student MobileNumber</label><input type="text" name="studentMobileNumber"/></div>
	<div><label for="">Student Address</label><input type="text" name="studentAddress" /></div>
	
	<input type="submit" value="submit">
</form>

</body>
</html>