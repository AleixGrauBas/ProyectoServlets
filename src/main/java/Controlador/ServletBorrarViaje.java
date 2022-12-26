package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletBorrarViaje", value = "/ServletBorrarViaje")
public class ServletBorrarViaje extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");

        String codviaje = request.getParameter("codViaje");
        String codcli = request.getParameter("codcli");
        String retira = request.getParameter("Retira");
        while(retira == null)
            retira = request.getParameter("Retira");

        request.setAttribute("res", gestor.borraViaje(codviaje, codcli));
        RequestDispatcher vista = request.getRequestDispatcher("resReserva.jsp");
        vista.forward(request,response);
    }

}
