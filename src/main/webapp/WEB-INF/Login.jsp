<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fee Management System</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css">
    <style>

        .header {
            text-align: center;
            background-color: #3399ff;
            padding: 20px;
        }

        .container {
            display: flex;
            justify-content: space-around;
            align-items: center;
            padding: 20px;
        }

        .form-container {
            background-color: #f0f0f0;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 10px;
            width: 40%;
        }


    </style>
</head>
<body>
    <div class="header">
        <h1>Fee Management System</h1>
    </div>
    <div class="container">
        <div class="form-container admin">
            <h3>${error}</h3>
            <form action="adminLogin" method="post">
                <h3>Admin Login here!!!!</h3>
                <hr>
           Email:     <input type="email" name="email" placeholder="Enter email" required><br>
           Password:     <input type="password" name="pass" placeholder="Enter password" required><br>
                <input type="reset" value="Cancel">
                <input type="submit"  value="Login">
            </form>
        </div>
        <div class="form-container accountant">
            <h3>${msg}</h3>
            <form action="AccLogin" method="post">
                <h3>Accountant Login here!!!!</h3>
                <hr>
             Email:   <input type="email" name="email" placeholder="Enter email" required><br>
             Password:   <input type="password" name="pass" placeholder="Enter password" required><br>
                <input type="reset" value="Cancel">
                <input type="submit" value="Login">
            </form>
        </div>
    </div>
</body>
</html>
