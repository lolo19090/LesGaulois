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
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		//précondition
		assert force > 0;
		int oldForce = force;
		
		forceCoup = calculResistanceEquipement(forceCoup);
		
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		 }
		if(force == 0) {
			parler("Aïe");
		}
		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			}
			// post condition la force a diminuée
			assert force < oldForce;
			return equipementEjecte;
			}
		
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
	
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + toString() + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
			}
				return equipementEjecte;
				
		}
	
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force+ "]";
	}
	
	
	public void sEquiper(Equipement equipm) {
		int i = 0;
		String soldat = "Le soldat ";
		switch(nbEquipement) {
		case 0:
			this.equipements[0] = equipm;
			this.nbEquipement = 1;
		System.out.println(soldat+ nom+ " s'équipe d'un " + equipm.toString());
		break;
		case 2:
			System.out.println(soldat+nom+" est déjà bien protégé !");
			break;
		default:
			for(Equipement test : equipements) {
				if(test == equipm) {
					System.out.println(soldat+ nom+" possède déjà un "+ test.toString());
					i= 1;
				}
			}
			if (i==0) {
				this.equipements[nbEquipement] = equipm;
				this.nbEquipement = nbEquipement +1;
				System.out.println(soldat+nom+" s'équipe d'un "+equipm.toString());
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