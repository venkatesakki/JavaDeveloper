<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Book</title>
</style>
</head>
<body>
<%@ include file ="header.html"%>
<%--<jsp:useBean id="service" class="com.example.demp.model.BookService" scope="request"/>--%>

<table border="1">

	<tr>
		<th>Book Number</th>
		<th>Book Name</th>
		<th>Auther Name</th>
		<th>Price</th>
	</tr>
	
	<%--<c:set var="books" value="${service.findAll()}"/> --%>
<c:forEach items="${books}" var="eachBook">
<tr>
	<td><c:out value="${eachBook.bookNumber}"/></td>
	<td><c:out value="${eachBook.bookName}"/></td>
	<td><c:out value="${eachBook.authorName}"/></td>
	<td><c:out value="${eachBook.price}"/></td>
	<td><a href="edit?id=<c:out value='${eachBook.bookNumber}'/>">Edit</a></td>
	<td><a href="delete?id=<c:out value='${eachBook.bookNumber}'/>">Delete</a></td>
</tr>

</c:forEach>
</table>
<a href="index.jsp">Home</a>
<jsp:include page="footer.jsp"/>
<%--<a href="findByName.jsp">viewByName</a>
<a href="findById.jsp">viewById</a> --%>
</body>
</html>