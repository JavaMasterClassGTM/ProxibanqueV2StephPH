package dao;

//import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//import javax.servlet.ServletException;

import metier.Client;
import util.Bdd;
//import vue.ServletCreerClient;

/**
 * Classe qui définit les méthodes servant à récuperer une liste de client, lire
 * les informations d'un client, creer un client ou modifier ses informations.
 *
 */
public class DaoClient implements IDaoClient {

	private Connection cnt;

	@Override
	public List<Client> voirClients() {
		List<Client> allClients = new ArrayList<>();
		try {
			cnt = Bdd.seConnecter();
			String s = "select * from client order by idclient asc";
			Statement stall = cnt.createStatement();

			ResultSet rs = stall.executeQuery(s);
			while (rs.next()) {
				int idClient = rs.getInt("idclient");
				String prenom = rs.getString("prenom");
				String adresseCompl = rs.getString("adressecompl");
				String nom = rs.getString("nom");
				String email = rs.getString("email");
				String telephone = rs.getString("telephone");
				int idCons = rs.getInt("idcons");
				Client cli = new Client(nom, prenom, idClient, adresseCompl, telephone, email, idCons);
				allClients.add(cli);
			}

			Bdd.seDeconnecter(cnt);

		} catch (SQLException ex) {
			Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		return allClients;
	}

	@Override
	public void creerClient(Client cli) {

		try {
			cnt = Bdd.seConnecter();
			String st = "insert into client (idcons, prenom, nom, adressecompl, email, telephone) "
					+ "values(?,?,?,?,?,?)";
			PreparedStatement pst = cnt.prepareStatement(st);
			pst.setInt(1, cli.getIdCons());
			pst.setString(2, cli.getPrenom());
			pst.setString(3, cli.getNom());
			pst.setString(4, cli.getAdresseCompl());
			pst.setString(5, cli.getEmail());
			pst.setString(6, cli.getTelephone());
			pst.executeUpdate();

			Bdd.seDeconnecter(cnt);

		} catch (SQLException ex) {
			Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@Override
	public void editerClient(Client cli) {
		
		try {
			cnt = Bdd.seConnecter();
			String s = "update client set prenom=?, nom=?, adressecompl=?, email=? where idclient=?";
			PreparedStatement ptsd = cnt.prepareStatement(s);
			ptsd.setString(1, cli.getPrenom());
			ptsd.setString(2, cli.getNom());
			ptsd.setString(3, cli.getAdresseCompl());
			ptsd.setString(4, cli.getEmail());
			ptsd.setInt(5, cli.getIdClient());
			ptsd.executeUpdate();

			Bdd.seDeconnecter(cnt);
		} catch (SQLException ex) {
			Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@Override
	public Client lireClient(String nom, String prenom) {
		Client cli = new Client();

		try {
			cnt = Bdd.seConnecter();
			String s = "select * from client where prenom = ? and nom = ?";

			PreparedStatement pst1 = cnt.prepareStatement(s);
			pst1.setString(1, prenom);
			pst1.setString(2, nom);

			ResultSet rs = pst1.executeQuery();

			rs.next();
			int idClient = rs.getInt("idclient");
			String adresseCompl = rs.getString("adressecompl");
			String email = rs.getString("email");

			cli.setIdClient(idClient);
			cli.setNom(nom);
			cli.setPrenom(prenom);
			cli.setAdresseCompl(adresseCompl);
			cli.setEmail(email);

			Bdd.seDeconnecter(cnt);

		} catch (SQLException ex) {
			Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		return cli;
	}
}
