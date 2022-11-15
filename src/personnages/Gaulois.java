package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbtrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}

	private String prendreParole() {
		return("Le gaulois " + nom + ":");
	}

	//public void frapper(Romain romain) {
	//	System.out.println(nom + "envoie un grand coup dans la machoire de" + romain.getNom());
	//	romain.recevoirCoup((force / 3)* effetPotion);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] equipement = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; equipement != null && i < equipement.length; i++,
				nbtrophees++) {
				this.trophees[nbtrophees] = equipement[i];
			}
		}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", e∑ffetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
		
		
	}
	
	
	public void faireUneDonnation(Musee musee) {
		
		
	}

	public static void main(String[] args) {
		 Gaulois asterix = new Gaulois("Astérix", 8);
		 System.out.println(asterix);
		 asterix.parler("Bonjour !!");
		 asterix.boirePotion(4);

	}
}
