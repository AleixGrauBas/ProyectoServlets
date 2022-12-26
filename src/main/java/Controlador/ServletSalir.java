package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletSalir", value = "/ServletSalir")
public class ServletSalir extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServletContext contexto = getServletContext();

        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");

        String salir = request.getParameter("Salir");
        while(salir == null)
            salir = request.getParameter("Salir");
        gestor.guardaDatos();
        RequestDispatcher vista = request.getRequestDispatcher("resConsulta");
        vista.forward(request,response);
    }
}
