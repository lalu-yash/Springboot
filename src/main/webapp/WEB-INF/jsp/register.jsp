<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration page</h1>
<form action="./registration" modelAttribute="userForm" method="post">
   <div>
       <div id="login-panel">
           <h2>Register Page</h2>
           Please Enter your Details Here<br>
           <div>FirstName</div>
           <div>
               <input type="text" name="firstName" class="form-login" title="firstName" value="" size="30"
                      maxlength="50"/>
           </div>
           <div>LastName</div>
           <div>
               <input type="text" name="lastName" class="form-login" title="lastName" value="" size="30"
                      maxlength="50"/>
           </div>
           <div>PhoneNumber</div>
           <div>
               <input type="text" name="phoneNumber" class="form-login" title="phoneNumber" value="" size="30"
                      maxlength="50"/>
           </div>
           <div>Address</div>
           <div>
               <input type="text" name="address" class="form-login" title="address" value="" size="30"
                      maxlength="50"/>
           </div>

           <div>UserName</div>
           <div id="login-field">
               <input type="text" name="username" class="form-login" title="username" value="" size="30"
                      maxlength="50"/>
           </div>
           <div>Password</div>
           <div >
               <input type="password" name="password" class="form-login" title="password" value="" size="30"
                      maxlength="50"/>
           </div>
           <div>Email</div>
           <div>
               <input type="email" name="email"  title="email" value="" size="30"
                      maxlength="50"/>
           </div>
           <br/>

           <br><br>
           <input type="submit" value="register" style="margin-left:100px;"/>
       </div>
   </div>
</form>

</body>
</html>