<%--
  Created by IntelliJ IDEA.
  User: Маша
  Date: 03.03.2019
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Bootstrap core CSS -->
    <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet">
    <style>
        .footer {
            position: absolute;
            bottom: 0;
            width: 100%;
            height: 60px;
            background-color: #f5f5f5;
        }
        .footer .container {
            width: auto;
            max-width: 680px;
            padding: 0 15px;
        }
    </style>
</head>
<body>
<nav role="navigation" class="navbar navbar-default">
    <div class="">
        <img src =
                     "https://www.kv.by/sites/default/files/user7743/logo_iba_group.jpg" width="50"
             height="50">
    </div>
    <div class="navbar-collapse">
        <ul class="nav navbar-nav">
            <li class="active"><a href="http://java-online.ru/jsp-jstl.xhtml">Home</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="loginServlet">Login</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="LogoutServlet">Logout</a></li>
        </ul>

    </div>
</nav>
<div class="container">
    <H2> Welcome,   <c:set var="user" scope="session" value="Masha" />
<c:out value="${user}" /> </H2>

<p>
    <div>
    <table border="1">
        <caption>Список вашей группы</caption>
        <tr>
            <th> Имя</th>
            <th> Телефон</th>
            <th> Email</th>
        </tr>
<c:forEach items="${group}" var= "p">
    <tr>
    <th>  ${p.name}  </th>
        <th>  ${p.phone}  </th>
        <th>  ${p.email}  </th>
    </tr>
</c:forEach>
</table>
<p><font color="red">${errorMessage}</font></p>
<form method="POST" action="GroupListServlet">
    Новый :
    <p> Введите имя <input name="nname" type="text" /> </p>
    <p> Введите телефон <input name="nphone" type="text" /> </p>
    <p> Введите email <input name="nemail" type="text" /> </p>
    <input name="add" type="submit" />
</form>
</div>
</p>
<footer class="footer">
    <div class="container">
        <p>2019 Все права защищены</p>
    </div>
</footer>
<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>


<c:out value="16+64*2=" />
<c:out value="${16+64*2}" />



</body>
</html>
