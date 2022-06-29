<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Book</title>

<style type="text/css">
tr,td{
border:2xp solid black;
}

</style>
</head>
<body>
<table border="1">

	<tr>
		<th>Book Number</th>
		<th>Book Name</th>
		<th>Auther Name</th>
		<th>Price</th>
	</tr>
	
<c:forEach items="${books}" var="eachBook">
<tr>
	<td><c:out value="${eachBook.bookNumber}"/></td>
	<td><c:out value="${eachBook.bookName}"/></td>
	<td><c:out value="${eachBook.authorName}"/></td>
	<td><c:out value="${eachBook.price}"/></td>
</tr>

</c:forEach>
</table>
<a href="findByName.jsp">viewByName</a>
<a href="findById.jsp">viewById</a>
</body>
</html>