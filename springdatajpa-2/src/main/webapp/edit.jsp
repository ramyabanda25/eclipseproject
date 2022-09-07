<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="background.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
	<center>
		<h2>EDIT STUDENT DETAILS</h2>
	</center>
		<table align="center" border=2>
		<tr>
			<th>id</th><td><input type="number"  value="${student.id}" name="id" readonly></td>
		</tr>
		<tr>
			<th>name</th><td><input type="text" value="${student.name}" name="name"></td>
		</tr>

		<tr>
		<th>CourseName</th><td>
		 <select name="course.cid">
		 <option>${student.course.cname}</option>
            <c:forEach items="${courses}" var="course">
                <option value="${course.cid}">${course.cid}: ${course.cname}</option>
            </c:forEach>
        </select>
        </td></tr>
		<tr>
			<th>yoj</th><td><input type="number" value="${student.yoj}" name="yoj"></td>
		</tr>
		<tr>
				<td><input type="submit"></td>
		</tr>

	</table>
</form>
<center><h2><a href="index.jsp"> Back </a> </h2></center>

</body>
