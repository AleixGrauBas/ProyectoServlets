package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletAccede", value = "/ServletAccede")
public class ServletAccede extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        if(gestor == null){
            gestor = new GestorViajes();
            contexto.setAttribute("gestor", gestor);
        }
        String acceder = request.getParameter("Acceder");
        while(acceder == null)
            acceder = request.getParameter("Acceder");
        String codcli = request.getParameter("codcli");
        request.setAttribute("codcli", codcli);
        RequestDispatcher vista = request.getRequestDispatcher("menu.jsp");
        vista.forward(request,response);
    }

}
