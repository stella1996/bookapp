<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>User Registration</h1>
	<form action="/users/save" method="POST">
		<table border="1">
			<tbody>
				<tr>
					<th>Name</th>
					<td><input type="text" name="name" required="required"
						autofocus="autofocus" /></td>
				</tr>
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
	</form>
	</center>
</body>
</html>