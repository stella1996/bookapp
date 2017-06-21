<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order</title>
</head>
<body>

<form action="/users/order" method="POST">
		<table style="color:#00FF33;border-color:#FF0099;background-color:#CC0099;" border="1">
			<tbody>
				
				<tr>
					<th style="font-size:30px">Name</th>
					<td><input style="height:30px;width:330px" type="email" name="email" required="required" />
					</td>
				</tr>
				<tr>
					<th style="font-size:30px">Price</th>
					<td><input style="height:30px;width:330px" type="password" name="password" required="required" />
					</td>
					
					
				</tr>
				<tr>
					<td>
						<button style="height:30px;width:130px" type="submit">Order</button> 
						
					</td>
				</tr>
			</tbody>
		</table>
		</form>



</body>
</html>