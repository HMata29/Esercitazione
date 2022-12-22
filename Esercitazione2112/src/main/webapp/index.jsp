<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br>
<a href="servlet1">Servlet1</a>
<br>
<a href="servletName">Servlet Name</a>
<p>il nome è ${nome}</p>
<br>
<a href="servletLogin">Servlet Form</a>
<br>
<a href="studente">Servlet studente</a>
<br>
<a href="ServletInserUser"> Servlet User Esempio</a>
<br>
<a href="ServletDeleteUser">Servlet Delete User</a>
<br>
</body>
</html>