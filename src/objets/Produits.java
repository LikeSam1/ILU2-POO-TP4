package objets;

public abstract class Produits {
	String nom;
	String unite;
	
	String getNom() {
		return nom;
	}
	
	public abstract String decrireProduit();
}
