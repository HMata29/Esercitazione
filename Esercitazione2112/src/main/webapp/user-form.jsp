<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html>
<head>
  <title>User Management Application</title>
  <jsp:include page="style.jsp"></jsp:include>
</head>
<body>

<header>
  <jsp:include page="navbar.jsp"></jsp:include>
</header>
<br>

<div>
  <form method="post" action="ServletInserUser">
    <div class="mb-3">
    <label  class="form-label">nome</label>
    <input type="text" class="form-control" name="name" required="required">
    </div>
    <div class="mb-3">
    <label class="form-label">email</label>
    <input type="text" class="form-control" name="email" required="required">
    </div>
      <div class="mb-3">
    <label  class="form-label">Stato</label>
    <input type="text" class="form-control" name="country" required="required">
      </div>
    <div class="mb-3">
      <label class="form-label">Età (solo numero)</label>
      <input type="text" class="form-control" name="age" required="required">
    </div>
    <button type="submit" class="btn btn-success">Save</button>
  </form>

  <!--<form method="post" action="ServletInserUser">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="text" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="text" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Invia</button>
</form>-->

</div>
</body>
</html>
