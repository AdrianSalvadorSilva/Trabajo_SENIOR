<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form method ="post" action="libro">
  <input type = "number" name="code" placeholder="código de libro">
   <input type = "text" name="author" placeholder="Autor del libro">
    <input type = "text" name="title" placeholder="Titulo del libro">
     <input type = "number" name="year" placeholder="Año del lanzamiento">
      <input type = "text" name="state" placeholder="Estado del libro">
       <input type = "text" name="editoral" placeholder="Editoral">
       <button type ="submit">Guardar</button>
    </form>
</body>
</html>