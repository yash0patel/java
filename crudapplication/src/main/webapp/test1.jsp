<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		int getCube(int no)
		{
			return no*no*no;
		}
	%>
	
	<%
        for (int i = 1; i <= 10; i++) {
            out.println(10 + " * " + i + " = " + (10 * i) + "<br>");
        }
    %>
    
    Cube : <%= getCube(3)%>
</body>
</html>