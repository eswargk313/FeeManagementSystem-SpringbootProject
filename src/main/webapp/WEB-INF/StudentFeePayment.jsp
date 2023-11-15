<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ include file="AccountantNavBar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Fee Payment</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css">

</head>
<body style="background-color: powderblue; text-align: center">
<h2>Student Fee Payment here!!!!!</h2>
    <form action="ViewStdFee" method="get">
    Enter Student Roll No:<input type="number" name="sRollNo" required><br><br>
    <input type="reset" value="Cancel">
    <input type="submit" value="View Student Details">
    
    </form>


</body>
</html>