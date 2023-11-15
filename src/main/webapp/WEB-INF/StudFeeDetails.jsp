<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ include file="AccountantNavBar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Fee Details</title>
<link rel="stylesheet" type="text/css" href="css/style1.css">
    <style>
        .center-table {
            display: inline-block;
            text-align: left;
        }
    </style>

</head>
<body>
<h1>Student Details</h1>
<hr>
    <div class="center-table">
<table style="font-size: 25px">
	<tr>
			<td>Student Roll No:</td>
			<td> ${stud.sRollNo}</td>
	</tr>
	<tr>
			<td>Student Name:</td>
			<td>${stud.sName}</td>
	</tr>
	<tr>
			<td> Student Branch:</td>
			<td>${stud.sBranch}</td>
	</tr>
	<tr>
			<td> Student Year:</td>
			<td>${stud.sYear}</td>
	</tr>
	<tr>
			<td>Student Contact:</td>
			<td>${stud.sContact}</td>
	</tr>
	<tr>
			<td> Student Fee:</td>
			<td>${stud.sFee}</td>
	</tr>
	<tr>
			<td>Student Address:</td>
			<td>${stud.sAddress}</td>
	</tr>
	

                </table>
             <form action="Feepayment" method="get">
     Enter Amount:        <input type="number" name="amount" placeholder="Enter amount"><br><br>
     Enter Student Roll no:         <input type="number" name="sRollNo" placeholder="Enter Student Roll No"><br><br>
             <input type="reset" value="Cancle">
             <input type="submit" value="Submit">
             
             </form>   
        <h2>${msg }</h2>
	</div>
</body>
</html>