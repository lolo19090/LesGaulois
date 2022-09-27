package personnages;

public class Village {
	private String nom;
	private Chef chef;
	
	
	public Village(String nom, Chef chef) {
		this.nom = nom;
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}

	private String prendreParole() {
		return "Le chef " + nom + ":";
	}

}
