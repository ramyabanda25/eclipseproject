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
<form  action="/loadcourses" >
	<center><h3>LIST OF STUDENTS</h3></center>
	<table align="center" border=2>

	</th>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>YOJ</th>
			<th>CID</th>
			<th>CNAME</th>
			<th>ACTIONS</th>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td><c:out value="${student.id}"></c:out></td>
				<td><c:out value="${student.name}"></c:out></td>
				<td><c:out value="${student.yoj}"></c:out></td>
				<td><c:out value="${student.course.cid}"></c:out></td>
				<td><c:out value="${student.course.cname}"></c:out></td>
				<td><a href="delete?id=${student.id}"> Delete</a>
				<a href="edit?id=${student.id}"> Edit</a></td>
			</tr>
		</c:forEach>
   	<tr><td>
	<input type="submit" value="ADD STUDENT">
	</td></tr>
	</table>
    <center><h3><a href="index.jsp"> Back </a></h3></center>
	
	</form>
</body>
</html>