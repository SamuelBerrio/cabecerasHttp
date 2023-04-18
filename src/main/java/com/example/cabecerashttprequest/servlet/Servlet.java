package com.example.cabecerashttprequest.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "Servlet", urlPatterns = "/http-request")
public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
        //Obtiene el método HTTP utilizado en la solicitud actual y lo guarda en la variable metodoHttp como un objeto String.
        String metodoHttp = req.getMethod();
        //Obtiene la parte de la URI de la solicitud actual y lo guarda en la variable requestUri como un objeto String.
        String requestUri = req.getRequestURI();
        //Obtiene la URL completa de la solicitud actual y lo guarda en la variable requestUrl como un objeto String.
        String requestUrl = req.getRequestURL().toString();
        //Obtiene la ruta de contexto de la aplicación web que maneja la solicitud actual y lo guarda en la variable contexPath como un objeto String.
        String contexPath = req.getContextPath();
        //Obtiene la ruta del servlet que maneja la solicitud actual y lo guarda en la variable servletPath como un objeto String.
        String servletPath = req.getServletPath();
        //Obtiene la dirección IP del cliente que envió la solicitud y lo guarda en la variable ipCliente como un objeto String.
        String ipCliente = req.getRemoteAddr();
        //Obtiene la dirección IP local del servidor en el que se está ejecutando la aplicación web y lo guarda en la variable ip como un objeto String.
        String ip = req.getLocalAddr();
        //Obtiene el número de puerto local en el que el servidor está escuchando para las solicitudes entrantes y lo guarda en la variable port como un número entero.
        int port = req.getLocalPort();
        //Obtiene el esquema de la URL utilizada en la solicitud HTTP y lo guarda en la variable scheme como un objeto String.
        String scheme = req.getScheme();
        //Obtiene el valor del encabezado HTTP "Host" de la solicitud y lo guarda en la variable host como un objeto String.
        String host = req.getHeader("host");
        String url = scheme + "://" + host + contexPath + servletPath;
        String url2 = scheme + "://" + ip + ":" + port + contexPath + servletPath;
        System.out.println("URL con esquema, host, conexPath y servletPath");
        System.out.println(url);
        System.out.println("URL con esquema, ip, port, contexPath, servletPath");
        System.out.println(url2);
        System.out.println(requestUrl);
    }
}
