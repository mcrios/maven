<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista here</title>
</head>
<body>
	
	<form action='<spring:url value="/usuarios/guardar"/>' method="post">
		<label>Nombre</label><br>
		<input type="text" name="nombre" value="${user.nombre}"/>
		<input type="submit" value="Guardar"/> 
	</form>

	<h1>Usuarios</h1>
	<table>
	<tr>
		<th>Nombre</th>
		<th>Telefonos</th>
		<th>Eliminar</th>
		<th>Editar</th>
	</tr>
	<c:forEach items="${lista}" var="u">
	<tr>
	<td>${u.nombre}</td>
	<td> <a href="<spring:url value="/telefonos/verTelefonos/${u.id}"/>">Telefonos</a></td>
	<td> <a href="<spring:url value="/usuarios/eliminar/${u.id}"/>">Eliminar</a></td>
	<td> <a href="<spring:url value="/usuarios/editar/${u.id}"/>">Editar</a></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>