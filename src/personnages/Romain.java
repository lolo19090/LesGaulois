package personnages;


public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "�"+ texte + "�");
	}

	private String prendreParole() {
		return "Le romain "+nom+":";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		}
		else {
			parler("J'abandonne...");
		}
		
	}
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force+ "]";
	}
	
	
	public static void main(String[] args) {
		 Romain minus = new Romain("Minus", 6);
		 System.out.println(minus);
		 minus.parler("Je vais te battre !");
		 minus.recevoirCoup(7);

	}
}