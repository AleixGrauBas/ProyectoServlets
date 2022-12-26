<%@ page import="org.json.simple.JSONObject" %><%--
  Created by IntelliJ IDEA.
  User: Alex Ioanesi
  Date: 24/12/2022
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Reserva- Viajes</title>
</head>
<body>
<%
  JSONObject res = (JSONObject) request.getAttribute("res");
  if (res.isEmpty()){%>
<h1> Lo sentimos, no se ha podido efectuar correctamente la reserva.</h1>
<%} else{%>

<h1>Enhorabuena. Tu reserva de viaje ha sido aceptada.</h1>
<br>
<h1>El viaje <%=res.get("codViaje") %> tiene el siguiente estado:</h1>
<br>
<ul>
  <li>Código del viaje: <%= res.get("codViaje").toString()%>></li>
  <li>Código del propetario: <%=res.get("codProp").toString()%></li>
  <li>Origen: <%=res.get("origen").toString()%></li>
  <li>Destino: <%=res.get("destino").toString()%></li>
  <li>Fecha: <%=res.get("fecha").toString()%></li>
  <li>Pasajeros: <%=res.get("pasajeros").toString()%></li>
  <li>Precio: <%=res.get("precio").toString()%></li>
  <li>Plazas disponibles: <%=res.get("numPlazas").toString()%></li>
</ul>
<%}%>
<h3><a href="menu.jsp">Menú</a></h3>
</body>
</html>

