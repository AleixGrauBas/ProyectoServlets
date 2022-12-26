<%--
  Created by IntelliJ IDEA.
  User: Alex Ioanesi
  Date: 24/12/2022
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="org.json.simple.JSONObject" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>BlablaUji</title>
</head>
<link rel="stylesheet" href="estilo.css">
<body>
<% JSONObject res = (JSONObject) request.getAttribute("res");
  if (res.isEmpty()) { %>
<h1>Lo lamento, el viaje con código <%=request.getParameter("codViaje")%> no ha podido ser retirado</h1>
<% } else { %>
<h1> El viaje ha sido borrado con exito</h1>
<h2>El viaje <%=request.getParameter("codViaje")%>: </h2>
<ul class="optionList">
  <li>Código del viaje: <%= res.get("codViaje").toString()%>></li>
  <li>Código del propetario: <%=res.get("codProp").toString()%></li>
  <li>Origen: <%=res.get("origen").toString()%></li>
  <li>Destino: <%=res.get("destino").toString()%></li>
  <li>Fecha: <%=res.get("fecha").toString()%></li>
  <li>Pasajeros: <%=res.get("pasajeros").toString()%></li>
  <li>Precio: <%=res.get("precio").toString()%></li>
  <li>Plazas disponibles: <%=res.get("numPlazas").toString()%></li>
</ul>
<% } %>
<h3><a href="menu.jsp">Menú</a></h3>
</body>
</html>
