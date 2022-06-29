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

<tr>
	<td><c:out value="${search.bookNumber}"/></td>
	<td><c:out value="${search.bookName}"/></td>
	<td><c:out value="${search.authorName}"/></td>
	<td><c:out value="${search.price}"/></td>
</tr>


</table>

</body>
</html>