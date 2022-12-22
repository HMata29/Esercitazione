<%--
  Created by IntelliJ IDEA.
  User: Utente
  Date: 22/12/2022
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prendi Il nome</title>
</head>
<body>
    <form action="servletName" method="post" >
        <input type="text" placeholder="Inserisci Qualcosa" name="nome">
        <button type="submit">Invia</button>
    </form>
<p>il nome è ${nome}</p>
</body>
</html>
