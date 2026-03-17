<!DOCTYPE html>
<html>
<head>
<style>
body{
    font-family: Arial, Helvetica, sans-serif;
    background: linear-gradient(120deg,#2980b9,#6dd5fa);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0px 5px 20px rgba(0,0,0,0.2);
    width:350px;
}

h2{
    text-align:center;
    margin-bottom:20px;
}

table{
    width:100%;
}

input[type=text],
input[type=password],
input[type=email]{
    width:100%;
    padding:8px;
    margin:8px 0;
    border-radius:5px;
    border:1px solid #ccc;
}

input[type=submit]{
    background:#2980b9;
    color:white;
    border:none;
    padding:10px;
    width:100%;
    border-radius:5px;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#1c5f8a;
}

input[type=reset]{
    margin-top:10px;
    padding:8px;
    width:100%;
    border-radius:5px;
}

a{
    display:block;
    text-align:center;
    margin-top:10px;
    text-decoration:none;
    color:#2980b9;
}

a:hover{
    text-decoration:underline;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">

<h2>Login</h2>

<form action="login" method="post">

<table>

<tr>
<td>Name</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Login">
</td>
</tr>

</table>

</form>

<a href="register.jsp">Sign Up</a>
<a href="forgotPassword.jsp">Forgot Password</a>

</div>

</body>
</html>