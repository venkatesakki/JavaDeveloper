
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Bank</title>
</head>
<body>
<%--<%@ include file="header.html" %> --%>
<div>
<p style="color:red"><c:out value="${param.errorMessage}"/></p>

<form action="handleLogin.jsp">
	<lable for="">User Name</lable>
	<input type="text" name="userName" />
	<lable for="">Password</lable>
	<input type="password" name="password"/>
	<input type="submit" value="Login">
</form>
</div>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>