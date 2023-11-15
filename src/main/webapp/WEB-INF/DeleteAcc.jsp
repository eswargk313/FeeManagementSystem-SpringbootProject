<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="AdminNavBar.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Accountant</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css">

</head>
<body>
	<h2>${msg}</h2>
	<h2>Delete Accountant here!!!!!</h2>
	<form action="DeleteAccountant" method="post">
		Enter Accountant Id:<input type="number" name="Id" required><br>
		<br> <input type="reset" value="Cancel"> <input
			type="submit" value="Delete Accountant">

	</form>

</body>
</html>