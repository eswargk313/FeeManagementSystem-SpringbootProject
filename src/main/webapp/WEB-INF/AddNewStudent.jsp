<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="AccountantNavBar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration!!!!!!</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css">
    
</head>
<body>
    <h1>${msg} ${id}</h1>
    <h1>New Student Registration</h1>
    <hr>
    <form action="StudentRegistration" method="post">

        Student Name:
        <input type="text" name="sName" placeholder="Enter Student Name" required><br>

        Student Branch:
        <input type="text" name="sBranch" placeholder="Enter Student Branch" required><br>

        Student Year:
        <input type="number" name="sYear" placeholder="Enter Student Year" required><br>

        Student Phone Number:
        <input type="number" name="sContact" placeholder="Enter Contact Number" required><br>

        Student Fees:
        <input type="number" name="sFee" placeholder="Enter Student Tuition Fees" required><br>

        Student Address:
        <input type="text" name="sAddress" placeholder="Enter Student Address" required><br>

        <input type="reset" value="Cancel">
        <input type="submit" value="Register">
    </form>
</body>
</html>
