package metier;

/**
 *Classe Compte courant permettant de lister les attributs et méthodes des comptes courants.
 *
 */
public class CompteCourant extends Compte{
	
	private double decouvertMax = 1000.0;

	public CompteCourant(int numCompte, String dateCreation, double solde, int idClient, String typeCompte,
			double decouvertMax) {
		super(numCompte, dateCreation, solde, idClient, typeCompte);
		this.decouvertMax = decouvertMax;
	}

	public double getDecouvertMax() {
		return decouvertMax;
	}

	public void setDecouvertMax(double decouvertMax) {
		this.decouvertMax = decouvertMax;
	}
	
	
	
}
