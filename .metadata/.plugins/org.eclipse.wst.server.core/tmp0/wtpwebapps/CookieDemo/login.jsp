<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #667eea, #764ba2);
    }

    .container {
        width: 380px;
        margin: 120px auto;
        background: #ffffff;
        padding: 25px;
        border-radius: 10px;
        box-shadow: 0px 8px 20px rgba(0,0,0,0.3);
    }

    .logo {
        text-align: center;
        font-size: 28px;
        font-weight: bold;
        color: #667eea;
        margin-bottom: 10px;
    }

    h2 {
        text-align: center;
        color: #333;
    }

    label {
        font-weight: bold;
        color: #444;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-top: 6px;
        margin-bottom: 15px;
        border-radius: 5px;
        border: 1px solid #ccc;
        background-color: #fff9c4;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: linear-gradient(to right, #43cea2, #185a9d);
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        opacity: 0.9;
    }

    .footer {
        text-align: center;
        margin-top: 10px;
        font-size: 12px;
        color: gray;
    }
</style>

</head>
<body>

<div class="container">

    <!-- LOGO -->
    <div class="logo">🍪 Cookie Demo</div>

    <h2>Login Page</h2>

    <form action="LoginCookie" method="post">

        <label>Username</label>
        <input type="text" name="uname" required>

        <label>Password</label>
        <input type="password" name="pw1" required>

        <input type="submit" value="Login">
    </form>

    <div class="footer">
        Java Servlet & Cookie Example
    </div>

</div>

</body>
</html>
