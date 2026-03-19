<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    color:#e0e0e0;
}

/* Glass container */
.container{
    background: rgba(255, 255, 255, 0.05);
    backdrop-filter: blur(12px);
    padding:30px;
    border-radius:15px;
    box-shadow:0px 10px 30px rgba(0,0,0,0.5);
    width:750px;
    border:1px solid rgba(255,255,255,0.1);
}

h2{
    text-align:center;
    margin-bottom:20px;
    color:#ffffff;
    letter-spacing:1px;
}

/* Table styling */
table{
    width:100%;
    border-collapse: collapse;
    overflow:hidden;
    border-radius:10px;
}

th, td{
    padding:12px;
    text-align:center;
    border-bottom:1px solid rgba(255,255,255,0.1);
}

th{
    background: rgba(255,255,255,0.1);
    color:#00d4ff;
    text-transform: uppercase;
    font-size:14px;
}

tr:hover{
    background: rgba(255,255,255,0.05);
}

/* Links */
a{
    text-decoration:none;
    color:#00d4ff;
    font-weight:bold;
    transition:0.3s;
}

a:hover{
    color:#1abc9c;
}

/* Add button */
.add-btn{
    display:block;
    text-align:center;
    margin-bottom:15px;
    padding:10px;
    background: linear-gradient(45deg,#00c6ff,#0072ff);
    color:white;
    border-radius:8px;
    transition:0.3s;
}

.add-btn:hover{
    transform:scale(1.05);
    box-shadow:0px 5px 15px rgba(0,0,0,0.5);
}

/* Search box */
.search-box{
    text-align:center;
    margin-bottom:15px;
}

.search-box input{
    padding:10px;
    margin:5px;
    border-radius:8px;
    border:none;
    outline:none;
    background: rgba(255,255,255,0.1);
    color:white;
    width:150px;
}

.search-box input::placeholder{
    color:#ccc;
}

.search-box input[type=submit]{
    background: linear-gradient(45deg,#00c6ff,#0072ff);
    color:white;
    cursor:pointer;
    width:auto;
    padding:10px 15px;
}

.search-box input[type=submit]:hover{
    transform:scale(1.05);
}

/* Message */
h3{
    color:#ff6b6b;
}

/* Action links spacing */
td a{
    margin:0 5px;
}
</style>
<meta charset="UTF-8">
<title>Forgot Password</title>
</head>
<body>

<div class="container">

<%
    String msg = (String) request.getAttribute("message");
    if(msg != null){
%>
    <p style="color:#ff6b6b; text-align:center; margin-bottom:10px;"><%=msg%></p>
<%
    }
%>

<h2>Forgot Password</h2>

<form action="resetpassword" method="post">

<table>

<tr>
<td>Email</td>
<td><input type="email" name="email"></td>
</tr>

<tr>
<td>New Password</td>
<td><input type="password" name="newpassword"></td>
</tr>

<tr>
<td>Confirm Password</td>
<td><input type="password" name="confirmpassword"></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Reset Password">
</td>
</tr>

</table>

</form>

</div>

</body>
</html>