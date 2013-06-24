<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ViewServlet"> 
  <input type="checkbox" name="showlist" id = "un" value="Username">User Name<br>
  <input type="checkbox" name="showlist" id = "fn" value="Firstname">First Name<br>
  <input type="checkbox" name="showlist" id = "ln" value="LastName">Last Name<br>
  <br><input type="submit" value="view" name = "view">
  </form> 
</body>
</html>