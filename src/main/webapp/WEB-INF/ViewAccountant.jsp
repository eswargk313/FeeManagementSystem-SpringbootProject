<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <%@ include file="AdminNavBar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accountant Details</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css">
    <style>
        .center-table {
            display: inline-block;
            text-align: left;
        }
    </style>

</head>
<body>
<h1>Accountant Detaills!!!!!</h1>
    <div class="center-table">
     <table style="font-size: 25px" border="5px">
        <thead>
            <tr>
                <th>Accountant Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
                <th>Address</th>                
                <!-- Add more columns for other student attributes -->
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${accountants}" var="accountant">
                <tr>
                    <td>${accountant.aId}</td>
                    <td>${accountant.name}</td>
                    <td>${accountant.email}</td>
                    <td>${accountant.contact}</td>
                    <td>${accountant.address}</td>

                    <!-- Add more columns for other student attributes -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
	</div>
</body>
</html>