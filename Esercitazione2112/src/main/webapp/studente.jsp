<%--
  Created by IntelliJ IDEA.
  User: Utente
  Date: 22/12/2022
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ecco i tuoi studenti</h1>
    <table>
        <tr>
            <td> ${s1Nome}</td>
            <td>${s1Cognome}</td>
            <td>${s1Matricola}</td>
        </tr>
        <tr>
            <td> ${s2Nome}</td>
            <td>${s2Cognome}</td>
            <td>${s2Matricola}</td>
        </tr>
        <tr>
            <td> ${s3Nome}</td>
            <td>${s3Cognome}</td>
            <td>${s3Matricola}</td>
        </tr>

    </table>
</body>
</html>
