<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #74ebd5, #ACB6E5);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .login-box {
            background: #ffffff;
            padding: 30px 40px;
            width: 350px;
            border-radius: 10px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        }

        .login-box h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .login-box label {
            font-weight: bold;
        }

        .login-box input[type="text"],
        .login-box input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 15px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        .login-box input[type="submit"] {
            width: 100%;
            padding: 10px;
            background: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        .login-box input[type="submit"]:hover {
            background: #45a049;
        }

        .error {
            color: red;
            text-align: center;
            font-weight: bold;
        }

        .try-again {
            text-align: center;
            margin-bottom: 15px;
        }

        .try-again a {
            text-decoration: none;
            color: #0066cc;
        }

        .try-again a:hover {
            text-decoration: underline;
        }
    </style>
</head>

<body>

<div class="login-box">

    <h2>Login Page</h2>

    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
        <div class="error"><%= error %></div>
        <div class="try-again">
            <a href="index.jsp">Try Again</a>
        </div>
    <%
        }
    %>

    <form action="LoginServlet" method="post">
        <label>Username</label>
        <input type="text" name="username"
               value="<%= request.getParameter("username") != null ? request.getParameter("username") : "" %>">

        <label>Password</label>
        <input type="password" name="password">

        <input type="submit" value="Login">
    </form>

</div>

</body>
</html>
