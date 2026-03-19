<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>

<style>
body{
    font-family: 'Segoe UI', sans-serif;
    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    color:white;
}

.container{
    background: rgba(255,255,255,0.05);
    backdrop-filter: blur(12px);
    padding:40px;
    border-radius:15px;
    box-shadow:0px 10px 30px rgba(0,0,0,0.5);
    text-align:center;
    width:400px;
    border:1px solid rgba(255,255,255,0.1);
}

h1{
    color:#ff4d4d;
    margin-bottom:15px;
}

p{
    font-size:18px;
    margin-bottom:20px;
}

a{
    text-decoration:none;
    padding:10px 20px;
    background: linear-gradient(45deg,#00c6ff,#0072ff);
    color:white;
    border-radius:8px;
    transition:0.3s;
}

a:hover{
    transform:scale(1.05);
}
</style>

</head>

<body>

<div class="container">

    <h1>⚠ Error</h1>

    <%
        String message = (String) request.getAttribute("message");
        if(message == null){
            message = "Something went wrong!";
        }
    %>

    <p><%= message %></p>

    <a href="allEmp">⬅ Back to Home</a>

</div>

</body>
</html>