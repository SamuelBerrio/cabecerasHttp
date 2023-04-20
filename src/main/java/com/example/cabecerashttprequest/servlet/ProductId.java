package com.example.cabecerashttprequest.servlet;

import com.example.cabecerashttprequest.model.Producto;
import com.example.cabecerashttprequest.service.ProductoService;
import com.example.cabecerashttprequest.service.impl.ProductoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/http-id-request")
public class ProductId extends HttpServlet {
    ProductoService productoService = new ProductoServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("id"));
        Producto producto = productoService.buscarId(id);
        if (producto == null){
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            System.out.println("No encontro el ID");
        }else {
            System.out.println("ID encontrado");
            resp.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head>");
                out.println(" <meta charset=\"UTF-8\">");
                out.println(" <title> Encontrado con Exito</title>");
                out.println("<style>\n" +
                        "\t\tbody {\n" +
                        "\t\t\tfont-family: Arial, sans-serif;\n" +
                        "\t\t\tbackground-color: #f0f2f5;\n" +
                        "\t\t\tpadding: 0;\n" +
                        "\t\t\tmargin: 0;\n" +
                        "\t\t}\n" +
                        "\n" +
                        "\t\th1 {\n" +
                        "\t\t\ttext-align: center;\n" +
                        "\t\t\tfont-size: 36px;\n" +
                        "\t\t\tmargin-top: 50px;\n" +
                        "\t\t}\n" +
                        "\n" +
                        "\t\t.container {\n" +
                        "\t\t\tbackground-color: #fff;\n" +
                        "\t\t\tmargin: 50px auto;\n" +
                        "\t\t\tpadding: 20px;\n" +
                        "\t\t\tmax-width: 500px;\n" +
                        "\t\t\tbox-shadow: 0px 0px 10px #ccc;\n" +
                        "\t\t}\n" +
                        "\n" +
                        "\t\tp {\n" +
                        "\t\t\tfont-size: 18px;\n" +
                        "\t\t\tmargin-bottom: 20px;\n" +
                        "\t\t}\n" +
                        "\n" +
                        "\t\tol {\n" +
                        "\t\t\tmargin-left: 30px;\n" +
                        "\t\t}\n" +
                        "\n" +
                        "\t\tli {\n" +
                        "\t\t\tfont-size: 16px;\n" +
                        "\t\t\tmargin-bottom: 10px;\n" +
                        "\t\t}\n" +
                        "\n" +
                        "\t\t.producto-encontrado {\n" +
                        "\t\t\tcolor: #4caf50;\n" +
                        "\t\t\tfont-weight: bold;\n" +
                        "\t\t}\n" +
                        "\n" +
                        "\t\t.no-encontrado {\n" +
                        "\t\t\tcolor: #f44336;\n" +
                        "\t\t\tfont-weight: bold;\n" +
                        "\t\t}\n" +
                        "\t</style>");
                out.println(" </head>");
                out.println(" <body>");
                out.println(" <h1>Detalle de producto</h1>");
                out.println("<div class=\"container\">");
                out.println("<ol>");
                out.println("<li><span class=\"producto-encontrado\">Id: "+ producto.getId() + "</li>");
                out.println("<li>Nombre: " + producto.getNombre() + "</li>");
                out.println("<li>Tipo: " + producto.getTipo() + "</li>");
                out.println("<li>Precio: " + producto.getPrecio() + "</li>");
                out.println("</ol>");
                out.println("</div>");
                out.println(" </body>");
                out.println("</html>");
            }

        }
    }
}
