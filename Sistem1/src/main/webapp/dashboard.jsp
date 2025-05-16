<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inser</title>
</head>
<body>
<h1>DASHBOARD</h1>
<%
 String usuario = (String) session.getAttribute("usuario");
if(usuario !=null){
out.println("Bienvenido "+ usuario);
out.println("<br><a href='validar '>Salir</a>");

}else{
	response.sendRedirect("Longin.html");                                                                     
	}
 %>
</body>
</html>