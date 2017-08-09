package metier;

/**
 * Classe abstraite Compte permettant de factoriser des attributs communs aux épargne et courant.
 *
 */
public abstract class Compte {

	private int numCompte;
	private String dateCreation;
	private double solde;
	private int idClient;
	private String typeCompte;
	
	
	
	public Compte(int numCompte, String dateCreation, double solde, int idClient, String typeCompte) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.idClient = idClient;
		this.typeCompte = typeCompte;
	}


	public Compte(int numCompte, String dateCreation, double solde) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}


	public int getNumCompte() {
		return numCompte;
	}


	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}


	public String getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getTypeCompte() {
		return typeCompte;
	}


	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}


	@Override
	public String toString() {
		return "Compte numéro :" + getNumCompte() + ", créée le " + getDateCreation() + "a un solde de " + getSolde() + "€";
	}
	
	
	
}
