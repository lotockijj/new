<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World!</h1>
	<br>
	<%=new Date()%>
	<br>
	<form method="get" action="first">
		First name: <br> <input type="text" name="firstname"
			value="Mickey"> <br> Last name: <br> <input
			type="text" name="lastname" value="Mouse"> <br> <br>
		<input type="submit" value="Submit">
	</form>
	<form method="post" action="record">
		Mail: <br> <input type="text" name="name" value="Mickey">
		<br> Password: <br> <input type="password" name="password">
		<br> <br> <input type="submit" value="Submit">
	</form>

</body>
</html>