<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	//border-collapse: collapse;
}
h1 {
	background-color: lightblue;
}

h2 {
	background-color: lightblue;
}
table.center {
  margin-left: auto;
  margin-right: auto;
}
th, td {
  padding: 10px;
}
.blink {
	animation: blinker 1.5s linear infinite;
	color: Navy;
	font-family: sans-serif;
}

@
keyframes blinker { 50% {
	opacity: 0;
}
}
caption {
	text-align: center;
	margin-bottom: 5px;
	font-size: 160%;
	padding: 5px;
	letter-spacing: 10px;
	font-weight: bold;
}
</style>
</head>
<body style="background-color: #1c87c9;">
	<h1>EPAM | Enterprise Software Development, Design & Consulting</h1>
	<h2 align="center">Welcome to Student Management System Project</h2>
	<table border=1 class="center" style="background-color: #1c87c9;">
	<caption>List of students registered</caption>
		<tr>
			<th>Roll Number</th>
			<th>Name</th>
			<th>Year of Joining</th>
			<th>Course Number</th>
			<th>Course Name</th>
			<th colspan=2>Action</th>
		</tr>
		<c:forEach items="${studentlist}" var="student">
			<tr>
				<td align="center"><c:out value="${student.studentID}" /></td>
				<td align="center"><c:out value="${student.studentName}" /></td>
				<td align="center"><c:out value="${student.studentYearOfJoining}" /></td>
				<td align="center"><c:out value="${student.course.courseID}" /></td>
				<td align="center"><c:out value="${student.course.courseName}" /></td>
				<td align="center"><a href="editstudent?studentID=${student.studentID}">Edit</a></td>
				<td align="center"><a href="deletestudent?studentID=${student.studentID}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="/" style="color: red; display:block; font-size:24px; text-align:center; background-color:lightblue">Home page</a>
</body>
</html>