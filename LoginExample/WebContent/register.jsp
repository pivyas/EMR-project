<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<form action="RegisterServlet"> 
  Please enter your First Name <input type="text" name="fn"/><br> 
  Please enter your Last Name <input type="text" name="ln"/> <br> 
  Please enter your username <input type="text" name="un"/><br> 
  Please enter your password <input type="password" name="pw"/> <br> 
  Please re-enter your password <input type="password" name="repw"/> <br> 
   <br><input type="submit" value="register" name = "register"> 
  </form> 
  </body>
</body>
</html>