package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletOfertaViaje", value = "/ServletOfertaViaje")
public class ServletOfertaViaje extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");

        String origen = request.getParameter("origen");
        String destino = request.getParameter("destino");
        String fecha = request.getParameter("fecha");
        String precio = request.getParameter("precio");
        String numplazas = request.getParameter("numPlazas");

        String codcli = request.getParameter("codcli");

        String ofertaViaje = request.getParameter("OfertaViaje");
        while(ofertaViaje == null)
            ofertaViaje = request.getParameter("OfertaViaje");

        request.setAttribute("res", gestor.ofertaViaje(codcli,origen,destino,fecha,Long.parseLong(precio),Integer.parseInt(numplazas)));
        RequestDispatcher vista = request.getRequestDispatcher("resOferta.jsp");
        vista.forward(request,response);
    }
}
