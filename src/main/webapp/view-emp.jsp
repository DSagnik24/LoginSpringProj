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

td{
    padding:8px 0;
}

.label{
    font-weight:bold;
    color:#333;
}

.value{
    color:#555;
}

a{
    display:block;
    text-align:center;
    margin-top:15px;
    text-decoration:none;
    color:#2980b9;
}
</style>

<meta charset="UTF-8">
<title>View Employee</title>
</head>

<body>

<div class="container">

<h2>Employee Details</h2>

<%
    Employee emp = (Employee) request.getAttribute("emp");
    if(emp != null){
%>

<table>

<tr>
<td class="label">ID</td>
<td class="value"><%=emp.getId()%></td>
</tr>

<tr>
<td class="label">Name</td>
<td class="value"><%=emp.getEmpName()%></td>
</tr>

<tr>
<td class="label">Email</td>
<td class="value"><%=emp.getEmpEmail()%></td>
</tr>

<tr>
<td class="label">Contact</td>
<td class="value"><%=emp.getEmpContactNumber()%></td>
</tr>

<tr>
<td class="label">City</td>
<td class="value"><%=emp.getEmpCity()%></td>
</tr>

</table>

<%
    } else {
%>
    <p style="text-align:center; color:red;">No Employee Found!</p>
<%
    }
%>

<a href="allEmp">Back to Employee List</a>

</div>

</body>
</html>