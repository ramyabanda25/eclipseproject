<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="background.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1> ADMIN PORTAL</h1></center>
<div>
	
	<form action="loadcourses">
	<table class= "tables" border=2 ><tr>
		<td colspan="15">Create student: </td><td colspan="5"><input type="submit" value="create"></td>
	</tr></table>
	</form>
	<br>
	<form action="display.jsp">
	<table class= "tables" border=2><tr>
		<td colspan="50">Display student: </td><td colspan="5"><input type="submit" value="display"></td>
	</tr></table>
	</form>
    <br>
	<form action="list">
	<table class= "tables" border=2><tr>
		<td colspan="5">List Of Students: </td><td colspan="5"><input type="submit" value="List ALL"></td>
	</tr></table>
	<br>
	</form>
		<form action="course">
	<table class= "tables" border=2><tr>
		<td colspan="5">Add Course: </td><td colspan="5"><input type="submit" value="ADD COURSE"></td>
	</tr></table>
	</form>
	<br>
	<form action="listcourse">
	<table class= "tables" border=2><tr>
		<td colspan="5">List Of Courses: </td><td colspan="5"><input type="submit" value="List Courses"></td>
	</tr></table>
	</form>
</div>
</body>
</html>
