package vue;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConnexion
 */
/**
 * Servlet qui permet de récupérer le login et le password du conseiller. Elle permet de rediriger vers le menu principal de l'application ou une page d'erreur en fonction des données reçues.
 *
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnexion() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		traitement(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		traitement(request, response);
	}

	protected void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			
		
				String login = request.getParameter("loginuser");
				String pwd = request.getParameter("mdpuser");


				RequestDispatcher dispatcher;

				if (("Toto".equalsIgnoreCase(login)) && ("toto".equalsIgnoreCase(pwd))) {
					dispatcher = request.getRequestDispatcher("choix.html");
				} else {
					dispatcher = request.getRequestDispatcher("connexion.jsp");
				}
				dispatcher.forward(request, response);
			}
		
	
}
