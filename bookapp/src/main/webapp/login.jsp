<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body bgcolor="#33FF00">
<br><br><br>
<center>
	<h1 style="color:#CC0099;font-size:40px">User Login</h1>
	<br><br><br>

<form action="/users/validate" method="POST">
		<table style="color:#00FF33;border-color:#FF0099;background-color:#CC0099;" border="1">
			<tbody>
				
				<tr>
					<th style="font-size:30px">Email</th>
					<td><input style="height:30px;width:330px" type="email" name="email" required="required" />
					</td>
				</tr>
				<tr>
					<th style="font-size:30px">Password</th>
					<td><input style="height:30px;width:330px" type="password" name="password" required="required" />
					</td>
				</tr>
				<tr>
					<td>
						<button style="height:30px;width:130px" type="submit">Submit</button>
					</td>
				</tr>
			</tbody>
		</table>
		</form>
		</center>

</body>
</html>