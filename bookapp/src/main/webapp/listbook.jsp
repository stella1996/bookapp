<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Management System</title>
</head>
<body bgcolor="#33FF00">
<center>
	
	<br><br><br>
<h1 style="color:#CC0099;font-size:30px" > BOOK MANAGEMENT SYSTEM</h1>
<h1 style="color:#CC0099;font-size:40px">Book List</h1>




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
				<td >${book.released_date}</td>
				<td><a href="../orders/books?id=${book.id}">View</a>
				
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</CENTER>
</body>
</html>