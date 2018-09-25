<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Loginpage</h1>
<div class="container">

   <form method="POST" action="/login" method="POST" modelAttribute="userForm" class="form-signin">
       <h2 class="form-heading">Log in</h2>

       <div class="form-group ${error != null ? 'has-error' : ''}">
           <span>${message}</span>
           <input name="username" type="text" class="form-control" placeholder="Username"
                  autofocus="true"/>
           <input name="password" type="password" class="form-control" placeholder="Password"/>
           <span>${error}</span>
           <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

           <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
           <h4 class="text-center"><a href="register">Create an account</a></h4>
           <h4 class="text-center"><a href="userlist">Users List</a></h4>

       </div>

   </form>

</div>

</body>
</html>