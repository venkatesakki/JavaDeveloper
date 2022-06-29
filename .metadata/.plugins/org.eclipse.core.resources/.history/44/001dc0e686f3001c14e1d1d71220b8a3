<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="loginBean" scope="session" class="com.example.demp.model.User"/>
<jsp:setProperty property="*" name="loginBean"/>

<c:set value="${loginBean.validate()}" var="result"/>
Result<c:out value="${result}"/>

<c:if test="${result}">
<jsp:forward page="showBook.jsp"/> 
</c:if>

<c:if test="${!result}">
<jsp:forward page="index.jsp">
<jsp:param value="invalid user name or password" name="errorMessage"/>

</jsp:forward>
</c:if>
</body>
</html>