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
<%--<%= session.getId() %> --%>

<c:out value="${pageContext.session.id}"/>
 <c:if test="${!empty sessionScope.name}">

 Welcome<c:out value="${name}"/>
 </c:if>
 <ol>
<c:if test="${empty sessionScope.name}">

 Welcome<c:out value="Guest"/>
 </c:if>
 </ol>

<%--<c:out value="chennai" scope="session" var="name"/>  --%>
<a href="second.jsp">Second</a>
</body>
</html>