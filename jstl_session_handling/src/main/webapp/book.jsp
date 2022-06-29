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
<form action="first.jsp">
	<label for="">Book</label>
	<select name="bookName" id="" multiple="multiple">
	<option value ="Java">Java</option>
	<option value ="Spring">Spring</option>
	<option value ="Python">Python</option>
	<option value ="HTML">Html</option>

</select>
    <input type="submit" value ="Add">
</form>
</body>
</html>