<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #04AA6D;
}
</style>

</head>
<body>
<ul>
  <li><a class="active" href="/AdminHome">Fee Managament System</a></li>
  <li><a href="/AdminHome">Home</a></li>
  <li><a href="/AddAccountant">Add Accountant</a></li>
  <li><a href="/ViewAccountant">View Accountant</a></li>
  <li><a href="/DeleteAcc">Delete Accountant</a></li>
    <li><a href="/ViewStud">View Student Details</a></li>
            <li><a href="/Login">Logout</a></li>
    
</ul>
</body>
</html>