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

/**
 * Servlet implementation class EditerClient
 */
@WebServlet("/ServletEditerClient")
public class ServletEditerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEditerClient() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {// TODO Auto-generated method stub
		traitement(request, response);
	}

	
	public Client traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceClient service = new ServiceClient();
    	HttpSession maSession = request.getSession();
    	
    	
//    	Récupération des paramètres requête
    	String nom = request.getParameter("nomuser");
    	String prenom = request.getParameter("prenomuser");
    	String adresseCompl = request.getParameter("adresseuser");
    	String email = request.getParameter("emailuser");
    	String idc = request.getParameter("idClient");
    	int idClient = Integer.parseInt(idc);
    	
//    	Soumettre les paramètres à la couche service et récupération
    	Client cli = new Client(idClient, nom, prenom, adresseCompl, email);
    	
    	cli = service.editerClient(cli);
    	
    	RequestDispatcher dispatcher;
		maSession.setAttribute("cliEdite", cli);
		dispatcher = request.getRequestDispatcher("clientEdite.jsp");
    	dispatcher.forward(request, response);
		
    	return cli;
	}
	
}
