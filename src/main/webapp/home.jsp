<!DOCTYPE html>
<%@page import="java.util.List" %>
<%@page import="com.capgemini.training.Entity.Employee" %>
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
    width:700px;
}

h2{
    text-align:center;
    margin-bottom:20px;
}

table{
    width:100%;
    border-collapse: collapse;
}

th, td{
    padding:10px;
    text-align:center;
    border:1px solid #ccc;
}

th{
    background-color:#2980b9;
    color:white;
}

a{
    text-decoration:none;
    color:#2980b9;
    font-weight:bold;
}

a:hover{
    text-decoration:underline;
}

.add-btn{
    display:block;
    text-align:center;
    margin-bottom:15px;
    padding:8px;
    background:#27ae60;
    color:white;
    border-radius:5px;
}
</style>

<meta charset="UTF-8">
<title>Home</title>
</head>

<body>

<div class="container">

<h2>Employee List</h2>

<!-- ✅ Add Employee Button -->
<a href="addEmp" class="add-btn">+ Add Employee</a>

<%
    List<Employee> listOfEmp = (List<Employee>)request.getAttribute("emplist");
    String message = (String)request.getAttribute("message");
%>

<% if(message != null){ %>
    <h3 style="color:red; text-align:center;"><%=message%></h3>
<% } %>

<table>

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Contact Number</th>
    <th>City</th>
    <th>Actions</th>
</tr>

<%
    if(listOfEmp != null){
        for (Employee emp : listOfEmp){
%>
<tr>
    <td><%=emp.getId()%></td>
    <td><%=emp.getEmpName()%></td>
    <td><%=emp.getEmpEmail()%></td>
    <td><%=emp.getEmpContactNumber()%></td>
    <td><%=emp.getEmpCity()%></td>

    <td>
       <a href="editEmp/<%=emp.getId()%>">Edit</a> |
       <a href="deleteEmp/<%=emp.getId()%>" onclick="return confirm('Are you sure?')">Delete</a> |
       <a href="view-emp/<%=emp.getId()%>" style="color:green;">View</a>
    </td>
</tr>
<%
        }
    } else {
%>
<tr>
    <td colspan="6">No Employees Found</td>
</tr>
<% } %>

</table>

</div>

</body>
</html>