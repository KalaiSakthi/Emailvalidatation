<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align=centre>
  <h1>User SignUp</h1>
  </div>
      <form action="SignUp" method="post">
      <table>
      <tr><td>Enter Name</td> <td> <input type=text name=textName> </td></tr> 
      <tr><td>Enter Email</td> <td> <input type=text name=textEmail> </td></tr> 
      <tr><td>Enter Password</td> <td> <input type=password name=textpwd> </td></tr>
      <tr><td>Enter Conform Password</td> <td> <input type=cpassword name=textcpwd> </td></tr>
      <tr><td> <input type=submit value=signUp > </td> <td> <input type=reset> </td></tr>
      </table>
      </form>
</body>

</html>