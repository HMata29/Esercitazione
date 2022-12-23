<%--
  Created by IntelliJ IDEA.
  User: Utente
  Date: 22/12/2022
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>

</head>
<body>
<jsp:include page="style.jsp"></jsp:include>
<form action="servletLogin" method="post">
    <input type="text" placeholder="nome Utente" name="utente">
    <input type="password" placeholder="password" name="password">
    <button type="submit">Invia</button>
</form>
</body>
</html>
