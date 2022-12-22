<%--
  Created by IntelliJ IDEA.
  User: Utente
  Date: 22/12/2022
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cancella</title>
</head>
<body>
<form method="post" action="ServletDeleteUser">
<label class="form-label">Inserisci id User da canellare</label>
<input type="number" class=""form-control name="id" required="required">
<button type="submit" class="btn btn-success">Save</button>
</form>
</body>
</html>
