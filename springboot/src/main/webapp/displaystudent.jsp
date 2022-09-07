<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="background.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><div>
<center><h3>STUDENT DATA</h3></center>

<form action="index.jsp" method="post">
		<table align="center">
		<tr>
			<th>id</th><td><input type="number"  value="${student.id}" name="id" readonly></td>
		</tr>
		<tr>
			<th>name</th><td><input type="text" value="${student.name}" name="name" readonly></td>
		</tr>
		<tr>
			<th>cid</th><td><input type="number" value="${student.course.cid}" name="course.cid" readonly></td>
		</tr>
		<tr>
			<th>cname</th><td><input type="text" value="${student.course.cname}" name="course.cname" readonly></td>
		</tr>
		<tr>
			<th>yoj</th><td><input type="number" value="${student.yoj}" name="yoj" readonly></td>
		</tr>
		<tr>
				<td><input type="submit" value="BACK"></td>
		</tr>

	</table>
	
</form></div>
</body>
</html>