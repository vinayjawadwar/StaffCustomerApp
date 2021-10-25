<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
<title>Error</title>
</head>
<body>

<h4>Error Page</h4>

<% String str=(String)request.getAttribute("message");%>
<%if(str!=null) %>>


<h5> <%=str %> </h5>


<h6><a href="index.jsp">back to home page</a></h6>


</body>
</html>
