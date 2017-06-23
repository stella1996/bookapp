<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Items</title>
</head>
<body>



	<b>Item Details</b>


	<form action="../orderItems/addToCart" method="post" >

		<input type="hidden" name="book_id" value="${BOOK_ORDER.id}" />
		<table>
			<tr>
				<th>Book Name</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			<tr>

				<td>${BOOK_ORDER.name}</td>

				<td>Rs. ${BOOK_ORDER.price}</td>
				<td><input type="number" name="qty" min="1" value="1" required /></td>


				<td><button>AddTo Cart</button></td>
				
@


			</tr>
		</table>
	</form>

</body>
</html>