<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>
	<form action="/order/save" method="post">
		<table>

			<tr>
				<th>Book Name</th>
				<th>TotalPrice</th>
				<th>Quantity</th>
			</tr>
			<tr>
				<td><input type="text" name="book_name" readonly
					value="${book.name}" /></td>
			</tr>
			<tr>
				<td><input type="text" name="totalprice"
					value="${TOTAL_AMOUNT}" /></td>
			</tr>
		
			<tr>
				<td><button type="submit">Order</button></td>
			</tr>

		</table>

</form>



</body>
</html>