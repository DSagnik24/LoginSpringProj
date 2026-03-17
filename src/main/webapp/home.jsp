<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<h2>Welcome to Home Page</h2>

<p style="text-align:center;">Login Successful 🎉</p>

</div>

</body>
</html>