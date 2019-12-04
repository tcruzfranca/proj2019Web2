package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailpadrao0 = "lucas@vinicius.com";
		String emailpadrao1 = "nicolas@terra.com";
		
		String senhapadrao0 = "123456";
		String senhapadrao1 = "654321";
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//response.setContentType("text/html");
		System.out.println("email: "+ email);
		System.out.println("senha: "+ password);
		
		System.out.println("Vamos logar?");
		
		if((email.equals(emailpadrao0) || email.equals(emailpadrao1)) && (password.equals(senhapadrao0) || password.equals(senhapadrao1)) ) {
			
			System.out.println("logado!");
			
			String url = "/ProjWeb2/TelaPrincipal.html";
			response.sendRedirect(url);
			return;
			
		}else {
			System.out.println("Do not funfed");
			if(email.equals(emailpadrao0)) {
				System.out.println("email OK!");
			}else {
				System.out.println("email NOK");
			}
			
			if(password.equals(senhapadrao0)) {
				System.out.println("senha OK");
			}else {
				System.out.println("senha NOK!");
			}
		}
	}

}
