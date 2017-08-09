package vue;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Client;
import service.IServiceClient;
import service.ServiceClient;

/**
 * Servlet implementation class ServletVoirClient
 */
@WebServlet("/ServletVoirClient")
public class ServletVoirClients extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletVoirClients() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	protected void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		RequestDispatcher dispatcher = null;

		// Récupération des paramètres
		IServiceClient serviceClient = new ServiceClient();
		List<Client> lclient = serviceClient.voirClients();

		// Soumettre les paramètres à la couche service et récupération

		HttpSession maSession = request.getSession();
		maSession.setAttribute("listecli", lclient);

		// Réponse à l'utilisateur

		RequestDispatcher dispatcher = request.getRequestDispatcher("voirClients.jsp");
		dispatcher.forward(request, response);
	}

}
