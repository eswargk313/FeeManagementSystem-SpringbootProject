<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ include file="AdminNavBar.jsp" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
<link rel="stylesheet" type="text/css" href="css/style1.css">
    <style>
        .center-table {
            display: inline-block;
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>All Students</h1>
    <div class="center-table">
    <table style="font-size: 25px" border="5">
        <thead>
            <tr>
                <th>Roll No</th>
                <th>Name</th>
                <th>Branch</th>
                <th>Year</th>
                <th>Contact</th>
                <th>Fees</th>
                <th>Address</th>
                
                <!-- Add more columns for other student attributes -->
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.sRollNo}</td>
                    <td>${student.sName}</td>
                    <td>${student.sBranch}</td>
                    <td>${student.sYear}</td>
                    <td>${student.sContact}</td>
                    <td>${student.sFee}</td>
                    <td>${student.sAddress}</td>

                    <!-- Add more columns for other student attributes -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
		</div>
	</body>
</html>