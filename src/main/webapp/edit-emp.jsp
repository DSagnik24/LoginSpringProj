<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.capgemini.training.Entity.Employee" %>

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
input[type=email]{
    width:100%;
    padding:8px;
    margin:8px 0;
    border-radius:5px;
    border:1px solid #ccc;
}

input[type=submit]{
    background:#27ae60;
    color:white;
    border:none;
    padding:10px;
    width:100%;
    border-radius:5px;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#1e8449;
}

a{
    display:block;
    text-align:center;
    margin-top:10px;
    text-decoration:none;
    color:#2980b9;
}
</style>

<meta charset="UTF-8">
<title>Edit Employee</title>
</head>

<body>

<div class="container">

<h2>Edit Employee</h2>

<%
    Employee emp = (Employee) request.getAttribute("emp");
%>

<form action="/updateEmp" method="post">

<!-- 🔥 Hidden ID (VERY IMPORTANT) -->
<input type="hidden" name="id" value="<%=emp.getId()%>">

<table>

<tr>
<td>Name</td>
<td><input type="text" name="empName" value="<%=emp.getEmpName()%>" required></td>
</tr>

<tr>
<td>Email</td>
<td><input type="email" name="empEmail" value="<%=emp.getEmpEmail()%>" required></td>
</tr>

<tr>
<td>Contact</td>
<td><input type="text" name="empContactNumber" value="<%=emp.getEmpContactNumber()%>" required></td>
</tr>

<tr>
<td>City</td>
<td><input type="text" name="empCity" value="<%=emp.getEmpCity()%>"></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Update Employee">
</td>
</tr>

</table>

</form>

<a href="allEmp">Back to Employee List</a>

</div>

</body>
</html>