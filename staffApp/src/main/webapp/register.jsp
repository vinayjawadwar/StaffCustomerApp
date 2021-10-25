<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<title>Register Customer</title>



</head>
<body>
	<div class="container">
		<h3>Register Page</h3>


		<form action="/register.do" method="post">
		
			
			<label for="id">ID: </label><input type="text" name="id">
		
		
		
				<label for="name">Name: </label><input type="text" name="name">
		
			
	
		
				<label for="address"> Address: </label><input type="text" name="address">
			

			

			<button type="submit" class="btn btn-success">Register</button>

		</form>
	</div>

</body>
</html>