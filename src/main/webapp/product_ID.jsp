<%--
  Created by IntelliJ IDEA.
  User: Samuel
  Date: 20/04/2023
  Time: 8:41 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario de búsqueda</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            padding: 0;
            margin: 0;
        }

        .container {
            background-color: #fff;
            margin: 50px auto;
            padding: 20px;
            max-width: 500px;
            box-shadow: 0px 0px 10px #ccc;
        }

        h1 {
            text-align: center;
            font-size: 36px;
            margin-bottom: 30px;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            font-size: 18px;
            margin-bottom: 10px;
        }

        input[type=text] {
            padding: 10px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            margin-bottom: 20px;
        }

        input[type=submit] {
            background-color: #1877f2;
            color: #fff;
            padding: 10px;
            font-size: 18px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: #0d6aad;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Buscar ID</h1>
    <form action="${pageContext.request.contextPath}/http-id-request" method="GET">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id" required>
        <input type="submit" value="Buscar">
    </form>
</div>
</body>
</html>
