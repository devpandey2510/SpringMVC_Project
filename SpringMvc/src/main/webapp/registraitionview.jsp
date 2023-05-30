<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Response</title>
</head>
<body>

 <% String name = request.getAttribute("first_name").toString();
 String email = request.getAttribute("e_email").toString();%>
 
 <%= name %>
 <br><%= email %>

</body>
</html>