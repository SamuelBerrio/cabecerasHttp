package com.example.cabecerashttprequest;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setHeader("refresh", "1");
        LocalTime hora = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println(" <head>");
            out.println(" <meta charset=\"UTF-8\">");
            out.println(" <title>La hora actualizada</title>");
            out.println("<style>\n" +
                    "\t\tbody {\n" +
                    "\t\t\tdisplay: flex;\n" +
                    "\t\t\tjustify-content: center;\n" +
                    "\t\t\talign-items: center;\n" +
                    "\t\t\theight: 100vh;\n" +
                    "\t\t\tbackground-color: #000;\n" +
                    "\t\t}\n" +
                    "\t\t\n" +
                    "\t\th1 {\n" +
                    "\t\t\tcolor: #fff;\n" +
                    "\t\t\tfont-size: 48px;\n" +
                    "\t\t\tmargin-bottom: 0;\n" +
                    "\t\t\ttext-align: center;\n" +
                    "\t\t\ttext-shadow: 0 0 10px #fff;\n" +
                    "\t\t}\n" +
                    "\t\t\n" +
                    "\t\th3 {\n" +
                    "\t\t\tcolor: #fff;\n" +
                    "\t\t\tfont-size: 72px;\n" +
                    "\t\t\ttext-align: center;\n" +
                    "\t\t\ttext-shadow: 0 0 10px #fff;\n" +
                    "\t</style>");
            out.println(" </head>");
            out.println(" <body>");
            out.println(" <h1>La hora actualizada!</h1>");
            out.println("<h3>"+ hora.format(df) + "</h3>");
            out.println(" </body>");
            out.println("</html>");
        }
    }

    public void destroy() {
    }
}