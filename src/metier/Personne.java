package metier;

/**
 * Classe abstraite Personne permettant de factoriser des attributs communs aux clients et conseillers.
 *
 */
public abstract class Personne {

	//Attributs
	private String nom;
	private String prenom;
	
	//Constructeur de la classe abstraite
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne() {
		super();
		
	}
	
	//Getters et setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	//toString
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
