package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletReservaViaje", value = "/ServletReservaViaje")
public class ServletReservaViaje extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");

        String codviaje = request.getParameter("codViaje");
        String codcli = request.getParameter("codcli");

        String reserva = request.getParameter("Reserva");
        while(reserva == null)
            reserva = request.getParameter("Reserva");

        request.setAttribute("res", gestor.reservaViaje(codviaje, codcli));
        RequestDispatcher vista = request.getRequestDispatcher("resReserva.jsp");
        vista.forward(request,response);
    }

}
