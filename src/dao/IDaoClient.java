package dao;

import java.util.List;

import metier.Client;

public interface IDaoClient {
	public List<Client> voirClients();

	public void creerClient(Client cli);
	
	public void editerClient(Client cli);
	
	public Client lireClient(String nom, String prenom);
	
}
