<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar user</title>
</head>
<body>
	<form action='<spring:url value="/usuarios/editar"/>' method="post">
		<label>Nombre</label><br>
		<input type="hidden" name="id" value="${user.id}"/>
		<input type="text" name="nombre" value="${user.nombre}"/>
		<input type="submit" value="Guardar"/> 
	</form>
	
</body>
</html>