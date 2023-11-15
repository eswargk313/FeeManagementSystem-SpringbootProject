<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style= "font-family: Arial;sans-serif">
	<ul>
		<li><a class="active" href="/AccountantWelcome">Fee
				Management System</a></li>
		<li><a href="/AccountantWelcome">Home</a></li>
		<li><a href="/AddNewStudent">Add New StudentDetails</a></li>
		<li><a href="/ViewStudentAcc">View Student Details</a></li>
		<li><a href="/StudentFeePayment">Student fee payment</a></li>
		<li><a href="/FeeDueStudents">Fee Due Students</a></li>
		<li><a href="/Logout1">Logout</a></li>

	</ul>

</body>
</html>