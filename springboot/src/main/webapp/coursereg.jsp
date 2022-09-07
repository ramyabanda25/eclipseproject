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
<center><h3>REGISTER A STUDENT</h3></center>

	<form action="addcourse" method="post">
		<table align="center" border=2>
			<tr>
				<td>CourseName</td>
				<td><input type="text" name="cname" required></td>
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
