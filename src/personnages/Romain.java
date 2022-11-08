package personnages;


public class Romain {
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement[] equipements ;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[3];
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + ""+ texte + "");
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
	
	
	public void sEquiper(Equipement equipm) {
		int i = 0;
		switch(nbEquipement) {
		case 0:
			this.equipements[0] = equipm;
			this.nbEquipement = 1;
		System.out.println("Le soldat "+ nom+ " s'équipe d'un " + equipm.toString());
		break;
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
			break;
		default:
			for(Equipement test : equipements) {
				if(test == equipm) {
					System.out.println("Le soldat "+ nom+" possède déjà un "+ test.toString());
					i= 1;
				}
			}
			if (i==0) {
				this.equipements[nbEquipement] = equipm;
				this.nbEquipement = nbEquipement +1;
				System.out.println("Le soldat "+nom+" s'équipe d'un "+equipm.toString());
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		 Romain minus = new Romain("Minus", 6);
		 System.out.println(minus);
		 System.out.println("Je possède ceci comme équipement : ");
		 for(Equipement equipements : Equipement.values()) {
			 System.out.println(" -  "+ equipements);
		 }
		 minus.parler("Je vais te battre !");
		 Equipement casque = Equipement.CASQUE;
		 Equipement bouclier = Equipement.BOUCLIER;
		 minus.sEquiper(casque);
		 minus.sEquiper(casque);
		 minus.sEquiper(bouclier);
		 minus.sEquiper(bouclier);

		 

	}
}