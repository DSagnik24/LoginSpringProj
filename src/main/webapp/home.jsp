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
    width:600px;
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
    padding:8px;
    text-align:center;
    border:1px solid #ccc;
}
</style>

<meta charset="UTF-8">
<title>Home</title>
</head>

<body>

<div class="container">

<h2>Employee List</h2>

<<%
     List<Employee> listOfEmp = (List<Employee>)request.getAttribute("emplist");
     String message = (String)request.getAttribute("message");
 %>

 <% if(message != null){ %>
     <h3 style="color:red;"><%=message%></h3>
 <% } %>

<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Contact Number</th>
    <th>City</th>
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
</tr>
<%
        }
    } else {
%>
<tr>
    <td colspan="5">No Employees Found</td>
</tr>
<% } %>

</table>

</div>

</body>
</html>