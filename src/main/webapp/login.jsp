<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Iniciar sesión</title>
    <style>
        body {
            background-color: #F0F2F5;
            font-family: Arial, sans-serif;
            font-size: 16px;
            color: #3B3F4A;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #FFF;
            border-radius: 8px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
            text-align: center;
        }
        h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }
        form {
            display: inline-block;
            text-align: left;
        }
        label {
            display: block;
            font-size: 14px;
            font-weight: bold;
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="password"] {
            display: block;
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: none;
            border-radius: 4px;
            background-color: #F0F2F5;
            box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
            color: #3B3F4A;
            font-size: 14px;
            line-height: 1.5;
            transition: box-shadow 0.3s ease-in-out;
        }
        input[type="text"]:focus,
        input[type="password"]:focus {
            outline: none;
            box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1), 0 0 4px #5B7BD5;
        }
        input[type="submit"] {
            display: block;
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 4px;
            background-color: #5B7BD5;
            color: #FFF;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }
        input[type="submit"]:hover,
        input[type="submit"]:focus {
            background-color: #43579C;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Iniciar sesión</h1>
    <form method="GET" action="${pageContext.request.contextPath}/login">
        <label for="username">Nombre de usuario</label>
        <input type="text" id="username" name="username">
        <label for="password">Contraseña</label>
        <input type="password" id="password" name="password">
        <input type="submit" value="Iniciar sesión">
    </form>
</div>
</body>
</html>

