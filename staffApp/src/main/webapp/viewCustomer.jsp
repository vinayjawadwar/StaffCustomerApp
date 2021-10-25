<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "java.util.*" %>
     <%@ page import = "customerdetails.models.CustomerDetails;" %>
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Searched Customer</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
<div class="container">
<h3> Customer </h3>
<table  class="table table-striped">
<tr> 
	<th id="custID">ID</th>
	<th id="custName">Name</th>
	<th id="address">Address</th>
	

</tr>

<%CustomerDetails customer=(CustomerDetails)request.getAttribute("customer"); %>
	<tr>
	<td><%=customer.getCustomerId() %></td>
	<td><%=customer.getCustName() %></td>
	<td><%=customer.getAddress() %></td>
	
	</tr>
</table>
</div>
</body>
</html>