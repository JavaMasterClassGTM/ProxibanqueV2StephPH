package vue;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

import metier.Client;
import service.ServiceClient;

/**
 * Servlet implementation class ChoisirClientEdite
 */
@WebServlet("/ChoisirClientEdite")
public class ChoisirClientEdite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChoisirClientEdite() {
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

	public void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceClient service = new ServiceClient();
		
    	HttpSession maSession = request.getSession();
		
    	//R�cup�ration des param�tres requ�te
    	String nom = request.getParameter("nomuser");
    	String prenom = request.getParameter("prenomuser");
		
    	
    	RequestDispatcher dispatcher;
    	dispatcher = request.getRequestDispatcher("editerClient.jsp");
    	Client cli = service.lireClient(nom, prenom);
		maSession.setAttribute("client", cli);
		
		dispatcher.forward(request, response);
    
	}

}
