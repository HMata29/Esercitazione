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

    <table class="table">
        <tr>
            <th scope="col">id</th>
            <th scope="col">nome</th>
            <th scope="col">email</th>
            <th scope="col">country</th>
            <th scope="col">age</th>
            <th scope="col">action</th>
        </tr>
<c:forEach var="user" items = "${lista}">
    <tr>
        <th scope="col"><c:out value="${user.getId()}"/></th>
        <td><c:out value="${user.getName()}"/></td>
        <td><c:out value="${user.getEmail()}"/></td>
        <td><c:out value="${user.getCountry()}"/></td>
        <td><c:out value="${user.getAge()}"/></td>
        <td>
            <a href="ServletDeleteFromList?id=<c:out value='${user.getId()}'/>"><i class="fa-solid fa-trash-can"></i></a>
            <a href="ServletUpdateFromList?id=<c:out value='${user.getId()}'/>"><i class="fa-solid fa-pen"></i></a>
        </td>
        </c:forEach>
    </table>
    </tr>
</body>
</html>
