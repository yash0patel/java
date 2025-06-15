<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Expression Element --%>
    <%= 20 + 10 %> <br>

    <%-- Scriptlet Element --%>
    <%
        for (int i = 1; i <= 10; i++) {
            out.println(10 + " * " + i + " = " + (10 * i) + "<br>");
        }
    %>

    <%-- Declaration Element --%>
    <%! 
        int test1() 
    	{
            int no1 = 200, no2 = 100;
            return (no1 + no2);
        } 
    %>

    <%-- Call Function --%>
    <%= "Addition : " + test1() %> <br>

    <%
        out.print("Addition : " + test1());
    %>
</body>
</html>