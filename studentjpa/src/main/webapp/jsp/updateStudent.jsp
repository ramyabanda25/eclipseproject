<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
th{
	text-aligh: left;
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

	<form action="editsuccess">
		<table class="center" style="background-color: #1c87c9;">
		<caption>Updation Form</caption>
			<tr>
				<th>Student Roll Number:</th>
				<td><input type="text" name="studentID" value="${student_data.studentID}" readonly="readonly"></td>
			</tr>
			<tr>
				<th>Student Name:</th>
				<td><input type="text" name="studentName" value="${student_data.studentName}"></td>
			</tr>
			<tr>
				<th>Student Year of Joining:</th>
				<td><input type="text" name="studentYearOfJoining" value="${student_data.studentYearOfJoining}"></td>
			</tr>
			<tr>
				<th>Student Course Number:</th>
				<td><input type="text" name="course.courseID" value="${student_data.course.courseID}"></td>
			</tr>
			<tr>
				<th>Student Course Name:</th>
				<td><input type="text" name="course.courseName" value="${student_data.course.courseName}"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
		
	</form>
	<br>
	<h2 align="center">${updatestatus}</h2>
	<a href="/" style="color: red; display:block; font-size:24px; text-align:center; background-color:lightblue">Home page</a>
</body>
</html>