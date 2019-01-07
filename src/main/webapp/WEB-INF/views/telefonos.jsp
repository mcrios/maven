<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Telefonos del Usuario</h1>
	<table>
		<tr>
			<th>numero</th>
			<th>usuario</th>
		</tr>
		<c:forEach items="${lista}" var="t">
		<tr>
			<td>${t.numero}</td>
			<td>${t.idUsuario.nombre}</td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>