package vue;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Client;
import service.ServiceClient;
import service.ServiceCompte;

/**
 * Servlet implementation class ServletVoirCompte
 */
@WebServlet("/ServletVoirCompte")
public class ServletVoirCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletVoirCompte() {
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

	protected int traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServiceCompte service = new ServiceCompte();
		HttpSession maSession = request.getSession();

		// Récupération des paramètres requête

		String idc = request.getParameter("idClient");
		int idClient = Integer.parseInt(idc);

		// Soumettre les paramètres à la couche service et récupération

		return idClient;
	}
}
