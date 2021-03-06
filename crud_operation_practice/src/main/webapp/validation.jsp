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

<jsp:useBean id="javaBean" scope="session" class="com.training.practice.StudentValidation"></jsp:useBean>
<jsp:setProperty property="*" name="javaBean"/>

<c:set value="${javaBean.validation()}" var="result"></c:set>
<c:out value="${result}"></c:out>

<c:if test="${result}">
<jsp:forward page="showdetails.jsp"></jsp:forward>
</c:if>

<c:if test="${!result}">
<jsp:forward page="loginpage.jsp">
<jsp:param value="Invalid uaerName or Password" name="errormaessage"/>

</jsp:forward>
</c:if>

</body>
</html>