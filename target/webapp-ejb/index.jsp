<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EJB</title>
</head>
<body>

<h2>Aprendamos EJB</h2>
<h3>${saludo}</h3>
<h3>${saludo2}</h3>

<ul>
    <h3>Listado de productos</h3>
    <c:forEach items="${listado}" var="prod">
        <li>${prod.name}</li>
    </c:forEach>
</ul>

</body>
</html>