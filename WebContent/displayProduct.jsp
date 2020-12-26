<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Product</title>
</head>
<body>

<h1>Recently Added Product :</h1>

<%= session.getAttribute("Product").toString()  %>

</body>
</html>