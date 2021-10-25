<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<title>Search Customer</title>
</head>

<body>

	<div class="container">


		<h4>
			Search Customer
			</h4>

			<form action="search.do" method="post">
				<label>Enter Id to Search :</label><input type="text" name="id">
			
				<button type="submit" class="btn btn-success">Search</button>
			</form>
	</div>
</body>
</html>