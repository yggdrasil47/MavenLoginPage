<%--
  Created by IntelliJ IDEA.
  User: Mihai
  Date: 1/7/2015
  Time: 1:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<form action="LoginServlet" method="post">
  Username: <input type="text" name="username">
  Password: <input type="password" name="password">
  <br>
  <input type="submit" value="Login">
</form>
</body>
</html>
