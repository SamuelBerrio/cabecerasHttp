<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Practica Cabeceras Http-Request</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #3B5998;
            color: white;
            text-align: center;
            padding: 20px;
        }

        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }

        .formulario {
            flex: 0 0 calc(25% - 20px);
            max-width: calc(25% - 20px);
            margin-right: 20px;
            margin-bottom: 20px;
            padding: 20px;
            background-color: #D8DCE6;
            border-radius: 5px;
        }

        .link {
            flex: 0 0 calc(50% - 20px);
            max-width: calc(50% - 20px);
            margin: 20px;
            text-align: center;
        }

        .link a {
            color: #3B5998;
            text-decoration: none;
            border-bottom: 2px solid #3B5998;
            padding-bottom: 2px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 8px 16px;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0069d9;
        }
    </style>
</head>
<body>
<header>
    <h1>Servicio de Servlets</h1>
</header>
<div class="container">
    <div class="formulario">
        <h1>Mostrar URLs en Consola</h1>
        <form action="${pageContext.request.contextPath}/http-request-urls" method="get">
            <input type="submit" value="URLs">
        </form>
    </div>
    <div class="formulario">
        <h1>Mostrar la Hora en tiempo Real</h1>
        <form action="${pageContext.request.contextPath}/hello-servlet" method="get">
            <input type="submit" value="Hora">
        </form>
    </div>
    <div class="formulario">
        <h1>Mostrar Productos en HTML,XLs,Json</h1>
        <form action="${pageContext.request.contextPath}/productos.json" method="get">
            <input type="submit" value="Productos XLs ">
        </form>
    </div>
    <div class="formulario">
        <h1>Mostrar Productos en un Json</h1>
        <form action="${pageContext.request.contextPath}/http-request-json" method="get">
            <input type="submit" value="Json Directo">
        </form>
    </div>
    <div class="formulario">
        <h1>Buscar un Producto por ID</h1>
        <form>
            <input type="submit" formaction="http://localhost:8080/cabecerasHttpRequest_war_exploded/product_ID.jsp" value="Ir a buscar un Producto por ID">
        </form>
    </div>
    <div class="formulario">
        <h1>Iniciar Sesion</h1>
        <form>
            <input type="submit" formaction="http://localhost:8080/cabecerasHttpRequest_war_exploded/login.jsp" value="Ir a iniciar Sesion">
        </form>
    </div>
</div>
</body>
</html>