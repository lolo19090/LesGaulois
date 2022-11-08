package personnages;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Village { 
	private String nom; 
	private Chef chef; 
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private int nbVillageoisMax;

	
	public Village(String nom, int nbMax) { 
		this.nom = nom; 
		this.nbVillageoisMax = nbMax;
		this.villageois = new Gaulois[nbMax];
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
		return this.villageois[num];
	
	}
	
	public void afficherVillageois() {
		int i = 0;
		System.out.println("Dans "+getNom()+ " du chef "+this.chef.getNom()+" vivent les l�gendaires gaulois : ");
		while(i<this.nbVillageois) {
			System.out.println("- "+ villageois[i].getNom());
			i=i+1;
		}
				
				
	
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		Chef chef = new Chef("Abraracourcix",6,village);
		village.setChef(chef);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		

	}
}