package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletAnulaReserva", value = "/ServletAnulaReserva")
public class ServletAnulaReserva extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");

        String codviaje = request.getParameter("codViaje");
        String codcli = request.getParameter("codcli");
        String enviar = request.getParameter("Enviar");
        while(enviar == null)
            enviar = request.getParameter("Enviar");

        request.setAttribute("res", gestor.anulaReserva(codviaje,codcli));
        RequestDispatcher vista = request.getRequestDispatcher("anulaReserva.jsp");
        vista.forward(request,response);
    }
}
