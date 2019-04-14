<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: Маша
  Date: 03.03.2019
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page info="JSP Sample 1 (03.04.2019)" %>
<% if (Calendar.getInstance ().get (Calendar.AM_PM) == Calendar.AM) {%>
Good morning, dear user
<% } else { %>
Good afternoon, dear user
<% } %>
<html>
<head>
    <title>JSP application</title>
</head>
<body>
<font color="red"> ${error} </font>
<form action="loginServlet" method="post">
    <br/>
    <br/>
    Name: <input type="text" name="name"/>
    <br/>
    <br/>
    Password: <input type="password" name="password"/>
    <br/>
    <br/>
    <input type="submit">
</form>

</body>
</html>
