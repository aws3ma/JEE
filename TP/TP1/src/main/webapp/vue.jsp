<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String nom = request.getParameter("nom");
%>
</head>
<body>
<li>Nom:<%=nom %></li>
</body>
</html>