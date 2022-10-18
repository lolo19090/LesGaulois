package personnages;


public class Village { 
	private String nom; 
	private Chef chef; 
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private int nbVillageoisMax;

	
	public Village(String nom, int nbMax) { 
		this.nom = nom; 
		this.nbVillageoisMax = nbMax;
	} 

	
	public void setChef(Chef chef) { 
		this.chef = chef; 
	} 

	
	public String getNom() { 
		return nom; 
	} 
	
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[nbVillageois] = gaulois;
		this.nbVillageois = this.nbVillageois + 1;
	}
	
	public Gaulois trouverHabitant(int num) {
		return this.villageois[num-1];
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		 System.out.println(village);
//		 Gaulois gaulois = village.trouverHabitant(30);
		 Gaulois asterix = new Gaulois("Asterix",5);
		 village.ajouterHabitant(asterix);
		 
		 

	}
}