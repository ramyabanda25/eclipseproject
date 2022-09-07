<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 {
	background-color: lightblue;
}

h2 {
	background-color: lightblue;
}

.error {
	color: red;
	font-style: italic;
}

table, th, td { //
	border: 1px solid black; //
	border-collapse: collapse;
}

table.center {
	margin-left: auto;
	margin-right: auto;
}

th, td {
	padding: 10px;
}

caption {
	text-align: center;
	margin-bottom: 5px;
	font-size: 160%;
	padding: 5px;
	letter-spacing: 10px;
	font-weight: bold;
}

th {
	text-align: left;
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
</style>
</head>
<body style="background-color: #1c87c9;">
	<h1>
		<marquee class="blink">EPAM | Enterprise Software
			Development, Design & Consulting</marquee>
	</h1>
	<h2 align="center">Welcome to Student Management System Project</h2>
	<form:form action="createsuccess" method="post">
		<table class="center" style="background-color: #1c87c9;">
			<caption>Registration Form</caption>
			<tr>
				<th>Student Name:</th>
				<td><input type="text" name="studentName"></td>
				<td><form:errors path="studentName" cssClass="error"></form:errors>
			</tr>
			<tr>
				<th>Student Year of Joining:</th>
				<td><input type="text" name="studentYearOfJoining"></td>
			</tr>
			<tr>
				<th>Student Course Number:</th>
				<td><input type="text" name="course.courseID"></td>
			</tr>
			<tr>
				<th>Student Course Name:</th>
				<td><input type="text" name="course.courseName"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>

	</form:form>
	<br>
	<h2 align="center">${createstatus}</h2>
	<a href="/"
		style="color: red; display: block; font-size: 24px; text-align: center; background-color: lightblue">Home
		page</a>
</body>
</html>