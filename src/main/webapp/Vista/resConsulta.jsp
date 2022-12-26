<%--
  Created by IntelliJ IDEA.
  User: Alex Ioanesi
  Date: 24/12/2022
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="UTF-8">
    <title>BlablaUji</title>
    <div id="div1">
        <img src="coches2.jpg" alt="coches" width="100%" >  </div>
    </div>
</head>
<link rel="stylesheet" href="estilo.css">
<body>
<h1 id="tituloIndice">BlaBla UJI</h1>
<div id="subtituloIndice">

    <h2> Viajes disponibles desde <%=request.getParameter("codViaje")%></h2>
    <table>
        <tr>
            <th>Código viaje</th>
            <th>Código propietario</th>
            <th>Destino</th>
            <th>Fecha</th>
            <th>Precio</th>
            <th>Plazas</th>
            <th>Pasajeros</th>
        </tr>
        <%
            JSONArray res = (JSONArray) request.getAttribute("res");
            for (Object re : res) {
                JSONObject object = (JSONObject) re;
        %>
        <tr>
            <td><%=object.get("codViaje")%>
            </td>
            <td><%=object.get("codProp")%>
            </td>
            <td><%=object.get("destino")%>
            </td>
            <td><%=object.get("fecha")%>
            </td>
            <td><%=object.get("precio")%>
            </td>
            <td><%=object.get("numPlazas")%>
            </td>
            <td><%=object.get("pasajeros")%>
            </td>
        </tr>
        <% } %>
    </table>
    <a href="menu.jsp">Menú</a>
</div>
</body>
</html>
