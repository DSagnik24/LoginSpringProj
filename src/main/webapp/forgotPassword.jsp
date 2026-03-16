<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>
</head>
<body>

<h2>Forgot Password</h2>

<form action="resetpassword" method="post">
<table>

<tr>
<td>Email :</td>
<td><input type="email" name="email"></td>
</tr>

<tr>
<td>New Password :</td>
<td><input type="password" name="newpassword"></td>
</tr>

<tr>
<td>Confirm Password :</td>
<td><input type="password" name="confirmpassword"></td>
</tr>

<tr>
<td><input type="submit" value="Reset Password"></td>
<td><input type="reset" value="Clear"></td>
</tr>

</table>
</form>

</body>
</html>