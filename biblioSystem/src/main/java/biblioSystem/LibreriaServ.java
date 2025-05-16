package biblioSystem;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


public class LibreriaServ<libro> extends HttpServlet {
LibroController LibroController;
	private static final long serialVersionUID = 1L;
       
    public LibreriaServ() {
        super();
        LibroController = new LibroController();
    }
    //controlador 
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 Integer codigo= Integer.valueOf(request.getParameter("code"));
		 String autor =request.getParameter("author");
		 String titulo = request.getParameter("title");
		 int anos = Integer.valueOf(request.getParameter("year"));
		 String estado = request.getParameter("state");
		 String editorial =request.getParameter("editorial");
		 
		 if(codigo != null && autor.length()>0 && titulo.length()>0) {
			Libro l = new Libro(codigo, anos, autor, titulo, estado, editorial);
			 try {
				LibroController.save(l);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		doGet(request, response);
			
		 }
	}

}
