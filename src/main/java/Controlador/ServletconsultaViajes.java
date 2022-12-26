package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletconsultaViajes", value = "/ServletconsultaViajes")
public class ServletconsultaViajes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServletContext contexto = getServletContext();

        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        String origen = request.getParameter("origen");

        String enviar = request.getParameter("Enviar");
        while(enviar == null)
            enviar = request.getParameter("Enviar");

        request.setAttribute("res", gestor.consultaViajes(origen));
        RequestDispatcher vista = request.getRequestDispatcher("resConsulta.jsp");
        vista.forward(request,response);
    }

}
