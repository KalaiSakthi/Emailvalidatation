<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Additional Details</title>
</head>
<body>
<div align=centre>
  <h1>User Additional Details</h1>
  </div>
      <form action="Additional" method="post">
      <table>
      <tr><td>Enter Age</td> <td> <input type=text name=textage> </td></tr> 
      <tr><td>Enter Gender</td> <td> <input type=text name=textgender> </td></tr>
      <tr><td>Enter DOB</td> <td> <input type=date name=textdob> </td></tr> 
      <tr><td>Enter PhoneNUmber</td> <td> <input type=number name=textph> </td></tr>
      <tr><td> <input type=submit value=Additional> </td> <td> <input type=reset> </td></tr>
      </table>
      </form>
</body>
</html>