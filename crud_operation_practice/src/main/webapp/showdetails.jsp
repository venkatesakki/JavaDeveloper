<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<%@ include file ="header.html"%>

<table border="1">
	<tr>
		<th>Student Id</th>
		<th>Student Name</th>
		<th>Student MailId</th>
		<th>Student MobileNumber</th>
		<th>Student Address</th>
	</tr>
<c:forEach items="${student}" var="eachBook">

	<tr>
		<td><c:out value="${eachBook.studentId}"/></td>
		<td><c:out value="${eachBook.studentName}"/></td>
		<td><c:out value="${eachBook.studentMailid}"/></td>
		<td><c:out value="${eachBook.studentMobileNumber}"/></td>
		<td><c:out value="${eachBook.studentAddress}"/></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>