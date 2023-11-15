<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="AdminNavBar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accountant Registration</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css">

</head>
<body>
<h1>Accountant Registration!!!!!</h1>
<hr>
<h3>${msg}</h3>
<h3>${id}</h3>
<form action="AccRegistration" method="post" >
Name:		<input type="text" name="name" placeholder="Enter Name"  required><br><br>
Email:		<input type="email" name="email" placeholder="Enter Email"  required><br><br>
Password:<input type="password" name="password" placeholder="Enter Passweord"  required><br><br>
Contact:	<input type="number" name="contact" placeholder="Enter Contact number"  required><br><br>
Address:	<input type="text" name="address" placeholder="Enter Address"  required><br><br>
<input type="reset" value="Cancel">
<input type="submit" value="Register">
</form>
</body>
</html>