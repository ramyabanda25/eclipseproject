<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1 {
	background-color: lightblue;
}

h2 {
	background-color: lightblue;
}

table {
	background-color: rgb(142, 191, 66);
}

table.center {
	margin-left: auto;
	margin-right: auto;
}

table, th, td { //
	border: 1px solid black; //
	border-collapse: collapse;
}

th, td {
	padding: 10px;
	font-size: 24px;
	text-align: center;
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
	color: lightblue;
}
</style>
</head>
<body style="background-color: #1c87c9;">
	<h1>
		<marquee class="blink">EPAM | Enterprise Software
			Development, Design & Consulting</marquee>
	</h1>
	<h2 align="center">Welcome to Student Management System Project</h2>
	<table class="center" style="background-color: #1c87c9;width: 720px;">
		<caption>Admin Operations</caption>
		<tr>
			<td><a href="createStudent"
				style="color: orange; font-size: 24px; text-align: center;">Create
					a student</a></td>
		</tr>
		<tr>
			<td><a href="displayStudents"
				style="color: orange; font-size: 24px; text-align: center;">Find
					all students</a></td>
		</tr>
	</table>
</body>
</html>