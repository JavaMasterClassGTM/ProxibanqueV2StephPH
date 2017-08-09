package metier;

/**
 * JavaBean de la classe Client qui étend la classe abstraite Personne.
 *
 */
public class Client extends Personne {

	private int idClient;
	private String adresseCompl;
	private String telephone;
	private String email;
	private int idCons;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;

	// Surcharge du constructeur

	public Client(String nom, String prenom, int idClient, String adresseCompl, String telephone, String email,
			int idCons, CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super(nom, prenom);
		this.idClient = idClient;
		this.adresseCompl = adresseCompl;
		this.telephone = telephone;
		this.email = email;
		this.idCons = idCons;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	public Client(String nom, String prenom, int idClient, String adresseCompl, String telephone, String email,
			int idCons) {
		super(nom, prenom);
		this.idClient = idClient;
		this.adresseCompl = adresseCompl;
		this.telephone = telephone;
		this.email = email;
		this.idCons = idCons;
	}

	public Client(int idClient, String nom, String prenom, String adresseCompl, String email) {
		super(nom, prenom);
		this.idClient = idClient;
		this.adresseCompl = adresseCompl;
		this.email = email;
	}

	public Client(String nom, String prenom, String adresseCompl, String telephone, String email, int idCons) {
		super(nom, prenom);
		this.adresseCompl = adresseCompl;
		this.telephone = telephone;
		this.email = email;
		this.idCons = idCons;
	}

	public Client(String nom, String prenom) {
		super(nom, prenom);
	}

	public Client() {
		super();
	}
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getAdresseCompl() {
		return adresseCompl;
	}

	public void setAdresseCompl(String adresseCompl) {
		this.adresseCompl = adresseCompl;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdCons() {
		return idCons;
	}

	public void setIdCons(int idCons) {
		this.idCons = idCons;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	@Override
	public String toString() {

		return "Client : " + getNom() + " " + getPrenom() + ", idClient = " + idClient + ", adresse = " + adresseCompl
				+ ", téléphone : " + telephone + ", Compte épargne : " + compteEpargne + ", Compte courant : "
				+ compteCourant + ", idCons = " + idCons;
	}
}
