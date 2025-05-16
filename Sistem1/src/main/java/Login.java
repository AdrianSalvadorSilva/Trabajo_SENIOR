
//@webServlet("/validar")
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession(false);//no crea si no exite
				if(session !=null) {
					session.invalidate();
					response.sendRedirect("Login.html");
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		validadr(request, response);
	}
	
private void validadr(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
	 String usuario = rq.getParameter("user");
	 String clave = rq.getParameter("pass");
	 if(usuario.equals("admin")&& clave.equals("1234")){
		 //Crear la secession
		 HttpSession session = rq.getSession();
		 session.setAttribute("usuario", usuario);
		 rs.sendRedirect("dashboard.jsp");
	 }else {
		 rs.sendRedirect("Login.html");
	 }
 }
}
