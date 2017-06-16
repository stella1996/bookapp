<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/users/validate" method="POST">
		<table border="1">
			<tbody>
				
				<tr>
					<th>Email</th>
					<td><input type="email" name="email" required="required" />
					</td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password" required="required" />
					</td>
				</tr>
				<tr>
					<td>
						<button type="submit">Submit</button>
					</td>
				</tr>
			</tbody>
		</table>

</body>
</html>