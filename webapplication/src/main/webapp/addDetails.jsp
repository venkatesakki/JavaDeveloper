<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center">${title}</h1>

<form action="show1" method="post">
FirstName:<input type="text" name="txtFirst">
LastName:<input type="text" name="txtLast">

<p>Qualification:</p>
<input type="checkbox" id="cb1" name="rd" value="engineering">
<lable for="cb1">Engineering</lable>
<input type="checkbox" id="cb2" name="rd" value="arts">
<lable for="cb2">Arts</lable>
<input type="checkbox" id="cb3" name="rd" value="science">
<lable for="cb3">Science</lable><br>


<p>Hobbies:</p>
<input type="radio" name="cb" value="cess">
  <label>CHESS</label>
  <input type="radio" name="cb" value="cricket">
  <label>CRICKET</label>
   <input type="radio" name="cb" value="football">
  <label>FOOTBALL</label><br>  

<input type="submit" value="SUBMIT">

</form>

</body>
</html>