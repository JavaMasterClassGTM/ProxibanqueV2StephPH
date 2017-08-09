package metier;

/**
 * Classe Compte épargne permettant de lister les attributs et méthodes des comptes épargnes.
 *
 */
public class CompteEpargne extends Compte {

	private double remuneration = 1.03;
	
	public CompteEpargne(int numCompte, String dateCreation, double solde, int idClient, String typeCompte,
			double remuneration) {
		super(numCompte, dateCreation, solde, idClient, typeCompte);
		this.remuneration = remuneration;
	}

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}
}
