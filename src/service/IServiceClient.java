package service;

import java.util.List;

import metier.Client;

/**
 * Interface contenant les méthodes qui seront définies dans ServiceClient.
 *
 */
public interface IServiceClient {
	public List<Client> voirClients();
	public Client lireClient(String nom, String prenom);
	public Client creerClient(Client cli);
	public Client editerClient(Client cli);
}
