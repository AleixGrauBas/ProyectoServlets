<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BlablaUji</title>
    <div id="div1">
        <img src="coches2.jpg" alt="coches" width="100%" >
    </div>
</head>
<link rel="stylesheet" href="estilo.css">
<body>
<h1 id="tituloIndice">Por un planeta más ...</h1>
<div id="divIndice">
    <form action = "ServletAccede" method="GET">
        <table>
            <tr>
                <td>
                    <b for="codigo">Código de cliente: </b>
                </td>
                <td>
                    <input type="text" id="codCli" name="codigo" required><br>
                </td>
            </tr>
        </table>
        <input type="submit" value="Acceder">
    </form>
</div>
</body>
</html>