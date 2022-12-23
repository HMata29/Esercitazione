<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Utente
  Date: 23/12/2022
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="style.jsp"></jsp:include>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

    <table>
        <tr>
            <td>id</td>
            <td>nome</td>
            <td>email</td>
            <td>country</td>
            <td>age</td>
            <td>action</td>
        </tr>
<c:forEach var="user" items = "${lista}">
    <tr>
        <td><c:out value="${user.getId()}"/></td>
        <td><c:out value="${user.getName()}"/></td>
        <td><c:out value="${user.getEmail()}"/></td>
        <td><c:out value="${user.getCountry()}"/></td>
        <td><c:out value="${user.getAge()}"/></td>
        <td>
            <a href="ServletDeleteUser?id=<c:out value='${user.getId()}'/>">D</a>
            <a href="ServletUpdateUser?id=<c:out value='${user.getId()}'/>">U</a>
        </td>
        </c:forEach>
    </table>
    </tr>
</body>
</html>
