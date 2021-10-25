<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
<title>Message</title>
</head>
<body>

<h2>Confirmation Page</h2>


<% String str=(String)request.getAttribute("message");%>
<%if(str!=null) %>>


<h4> <%=str %></h4>


<h3><a href="index.jsp">back to home page</a></h3>


</body>
</html>