<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Servlet Servlet</h1>
<form action="${pageContext.request.contextPath}/http-request" method="get">
    <input type="submit" value="list" />
</form>
<h1>Servlet HelloServlet</h1>
<form action="${pageContext.request.contextPath}/hello-servlet" method="get">
    <input type="submit" value="list">
</form>
<h1>Servlet ProductoXLsServlet</h1>
<form action="${pageContext.request.contextPath}/productos.json" method="get">
    <input type="submit" value="list">
</form>
<form action="${pageContext.request.contextPath}/http-request-json" method="get">
    <input type="submit" value="list">
</form>
</body>
</html>