<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
  <title>Login Page</title> 
  </head> 
  <body> 
  <form action="LoginServlet"> 
  Please enter your username <input type="text" name="un"/><br> 
  Please enter your password <input type="password" name="pw"/> 
  <br><input type="submit" value="login" name = "login">
  </form> 
  <a href = "register.jsp">Register here.</a>
  <a href = "view.jsp">View details.</a>
  </body>
</html>