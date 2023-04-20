package com.example.cabecerashttprequest.servlet;

import com.example.cabecerashttprequest.model.Producto;
import com.example.cabecerashttprequest.service.ProductoService;
import com.example.cabecerashttprequest.service.impl.ProductoServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet({"/productos.xls", "/productos.html", "/productos.json"})
public class ProductoXlsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ProductoService service = new ProductoServiceImpl();
        List<Producto> productos = service.listar();

        resp.setContentType("text/html;charset=UTF-8");
        String servletPath = req.getServletPath();
        boolean esXls = servletPath.endsWith(".xls");
        if (esXls) {
            resp.setContentType("application/vnd.ms-excel");
            resp.setHeader("Content-Disposition",
                    "attachment;filename=productos.xls");
        }
        try (PrintWriter out = resp.getWriter()) {
            if(!esXls) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head>");
                out.println(" <meta charset=\"UTF-8\">");
                out.println(" <title>Listado de Productos</title>");
                out.println("<style>");
                out.println("table {\n" +
                        "  border-collapse: collapse;\n" +
                        "  width: 100%;\n" +
                        "  max-width: 800px;\n" +
                        "  margin: 0 auto;\n" +
                        "  font-size: 14px;\n" +
                        "  line-height: 20px;\n" +
                        "}\n" +
                        "\n" +
                        "th, td {\n" +
                        "  padding: 12px;\n" +
                        "  text-align: left;\n" +
                        "  vertical-align: middle;\n" +
                        "  border: 1px solid #ddd;\n" +
                        "}\n" +
                        "\n" +
                        "th {\n" +
                        "  background-color: #f2f2f2;\n" +
                        "  font-weight: bold;\n" +
                        "}\n" +
                        "\n" +
                        "tr:nth-child(even) {\n" +
                        "  background-color: #f9f9f9;\n" +
                        "}\n" +
                        "\n" +
                        ".action-btn {\n" +
                        "  display: inline-block;\n" +
                        "  padding: 8px 16px;\n" +
                        "  background-color: #3b5998;\n" +
                        "  color: #fff;\n" +
                        "  text-align: center;\n" +
                        "  font-size: 14px;\n" +
                        "  font-weight: bold;\n" +
                        "  text-decoration: none;\n" +
                        "  border-radius: 4px;\n" +
                        "}\n" +
                        "\n" +
                        ".action-btn:hover {\n" +
                        "  background-color: #2d4373;\n" +
                        "}");
                out.println("</style>");
                out.println(" </head>");
                out.println(" <body>");
                out.println(" <h1>Listado de Productos!</h1>");
                out.println("<p><a href=\"" + req.getContextPath() +
                        "/productos.xls" + "\">exportar a xls</a></p>");
                out.println("<p><a href=\"" + req.getContextPath() +
                        "/http-request-json" + "\">mostrar json</a></p>");
            }
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>id</th>");
            out.println("<th>Nombre</th>");
            out.println("<th>Tipo</th>");
            out.println("<th>Precio</th>");
            out.println("</tr>");
            productos.forEach(p ->{
                out.println("<tr>");
                out.println("<td>" + p.getId() + "</td>");
                out.println("<td>" + p.getNombre() + "</td>");
                out.println("<td>" + p.getTipo() + "</td>");
                out.println("<td>" + p.getPrecio() + "</td>");
                out.println("</tr>");
            });
            out.println("</table>");
            if(!esXls) {
                out.println(" </body>");
                out.println("</html>");
            }
        }
    }


}
