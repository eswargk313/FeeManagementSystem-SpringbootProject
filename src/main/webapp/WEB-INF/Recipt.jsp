<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ include file="AccountantNavBar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receipt</title>
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
			<td>${actualFee}</td>
	</tr>
	<tr>
			<td> Amount Paid:</td>
			<td>${amount}</td>
	</tr>
	<tr>
			<td> Remaing Fee:</td>
			<td><h3>${rem}</h3></td>
	</tr>
	
	
	
	

                </table>
</div>
</body>
</html>