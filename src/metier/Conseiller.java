package metier;

/**
 * Classe contenant les attributs et constructeur propres aux conseillers.
 *
 */
public class Conseiller extends Personne{

	private int idCons;

	public Conseiller(String nom, String prenom, int idCons) {
		super(nom, prenom);
		this.idCons = idCons;
	}

	public int getIdCons() {
		return idCons;
	}

	public void setIdCons(int idCons) {
		this.idCons = idCons;
	}
	
	
	
}
