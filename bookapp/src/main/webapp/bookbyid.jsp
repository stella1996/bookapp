<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Management System</title>
</head>
<body bgcolor="#33FF00">
<CENTER>
<br><br>
<h1 style="color:#CC0099;font-size:30px" >HAI,USER WELCOME TO BOOK MANAGEMENT SYSTEM</h1>
</CENTER>

<table style="color:#00FF33;border-color:#FF0099;background-color:#CC0099;" border="1">
		<thead>
			<tr>
				<th  style="font-size:30px" >Id</th>
				<th  style="font-size:30px" >Name</th>
				<th  style="font-size:30px" >Price</th>
				<th  style="font-size:30px">ReleasedDate</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${BOOK_SALES}" var="book">
			<tr>
				<td >${book.id}</td>
				<td >${book.name}</td>
				<td >${book.price}</td>
				
				
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>