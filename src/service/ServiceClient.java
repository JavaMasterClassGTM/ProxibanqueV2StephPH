package service;

import java.util.List;

import dao.DaoClient;
import dao.IDaoClient;
import metier.Client;

/**
 * Classe permettant de faire le lien entre DaoClient et les diff�rentes servlet (contenues dans le package vue) gr�ce � une instance de la DaoClient.
 * D�finit les m�thodes pr�sentes dans IServiceClient.
 *
 */
public class ServiceClient implements IServiceClient {

	IDaoClient daoClient = new DaoClient();

	@Override
	public List<Client> voirClients() {
		return daoClient.voirClients();
	}

	@Override
	public Client creerClient(Client cli) {
		daoClient.creerClient(cli);
		return cli;
	}

	@Override
	public Client lireClient(String nom, String prenom) {
		return daoClient.lireClient(nom, prenom);
	}

	@Override
	public Client editerClient(Client cli) {
		daoClient.editerClient(cli);	
		return cli;
	}
	
}
