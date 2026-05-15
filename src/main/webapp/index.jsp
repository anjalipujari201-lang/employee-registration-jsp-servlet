<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration Form</title>
</head>
<body>
  <div align="center">
  <h1 Employee Register Form></h1>
  <form action="register" method="post">
  <table style="with: 80%">
  <tr>
  <td>First Name</td>
  <td><input type="text" name="firstname" /></td>
  </tr>
   <tr>
  <td>Last Name</td>
  <td><input type="text" name="lastname" /></td>
  </tr>
   <tr>
  <td>UserName</td>
  <td><input type="text" name="username" /></td>
  </tr>
   <tr>
  <td>Password</td>
  <td><input type="password" name="password" /></td>
  </tr>
   <tr>
  <td>Address</td>
  <td><input type="text" name="address" /></td>
  </tr>
  <tr>
  <td>Contact No</td>
  <td><input type="text" name="contact" /></td>
  </tr>
  </table>
  <input type="Submit" value="Submit" />
  </form>
  </div>
</body>
</html>