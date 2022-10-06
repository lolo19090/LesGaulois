package personnages;
import java.util.*;
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;


	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}

	private String prendreParole() {
		return "Le druide " + nom + ":";
	}
	
	public void preparerPotion() {
		Random random = new Random();
		this.forcePotion = random.nextInt(effetPotionMax-effetPotionMin) + effetPotionMin;
		if (this.forcePotion > 7) {
			parler("J'ai pr�par� une super potion de force " + this.forcePotion);
		}
		else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force  " + this.forcePotion);
		}
		
		
		}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();	
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() != "Obelix") {
			gaulois.boirePotion(this.forcePotion);
		}
		else {
			parler("Non Obelix, tu n'auras pas de potion");
			
		}
		
	}
}
