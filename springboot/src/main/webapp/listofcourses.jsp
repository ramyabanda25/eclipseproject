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
<form  action="/addcourse" >
	<center><h3>LIST OF COURSES</h3></center>
	<table align="center" border=2>
		<tr>
			<th>Course Id</th>
			<th>Course Name</th>
		</tr>
		<c:forEach items="${courses}" var="course">
			<tr>
				<td><c:out value="${course.cid}"></c:out></td>
				<td><c:out value="${course.cname}"></c:out></td>
			</tr>
		</c:forEach>

	</table>
	<center><h3><a href="index.jsp"> Back </a> </h3></center>

	
	</form>
</body>
</html>