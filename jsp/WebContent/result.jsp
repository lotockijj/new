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
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>
		<%
			String str = (String) request.getAttribute("attribute");
			for (int i = 0; i < 5; i++) {
				if (i % 2 == 0) {
					out.print("<br>try 0: " + str.toUpperCase());
				} else {
					out.print("<br>try 1: " + str.toLowerCase());
				}
			}
		%>
	</p>
</body>
</html>