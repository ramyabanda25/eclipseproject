<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="background.css" />
<meta charset="ISO-8859-1">
<title>student-registration</title>
</head>
<body>

	<center>
		<h2>REGISTER A STUDENT</h2>
	</center>

	<form action="add" method="post">
		<table align="center" border=2>
			<tr>
				<td>StudentName</td>
				<td><input type="text" name="name" required></td>
			</tr>

			<tr>
				<td>CourseName</td>
				<td> <select name="course.cid" >
						<option value="sel">----select----</option>
						<c:forEach items="${courses}" var="cour">
							<option value="${cour.cid}">${cour.cname}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>YOJ</td>
				<td><input type="text" name="yoj" required></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>

		</table>
		<center><h2><a href="index.jsp"> Back </a> </h2></center>
	</form>
	<center><h3>${message}</h3></center>
</body>
</html>