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

<c:out value="${pageContext.session.id}"/>

<c:if test="${!empty sessionScope.name}">

 Welcome<c:out value="${name}"/>
 </c:if>
<c:if test="${empty sessionScope.name}">

 Welcome<c:out value="Guest"/>
 
 </c:if>
your current location is :<c:out value="${city}"/>
<c:out value="${rating}"/>
</body>
</html>