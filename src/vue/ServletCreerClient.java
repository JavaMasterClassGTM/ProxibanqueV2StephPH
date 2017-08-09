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
 * Servlet implementation class ServletCreerClient
 */
@WebServlet("/ServletCreerClient")
public class ServletCreerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreerClient() {
        super();
    
    }

  
    public Client traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	ServiceClient service = new ServiceClient();
    	HttpSession maSession = request.getSession();
    	
    	
//    	Récupération des paramètres requête
    	String nom = request.getParameter("nomuser");
    	String prenom = request.getParameter("prenomuser");
    	String adresseCompl = request.getParameter("adresseuser");
    	String telephone = request.getParameter("teluser");
    	String email = request.getParameter("emailuser");
    	String idc = request.getParameter("idconsuser");
    	int idCons = Integer.parseInt(idc);
    	
//    	Soumettre les paramètres à la couche service et récupération
    	Client cli = new Client(nom, prenom, adresseCompl, telephone, email, idCons);
    	RequestDispatcher dispatcher;
    	cli = service.creerClient(cli);
    	
    	
		maSession.setAttribute("creerCli", cli);
		dispatcher = request.getRequestDispatcher("clientCree.jsp");
    	dispatcher.forward(request, response);
		
    	return cli;
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

}
