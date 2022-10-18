package histoire;

import java.util.Random;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class scenario {
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix ",5 , 10 );
		panoramix.parler(" Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		Romain minus = new Romain(" Minus ", 20);
		 Gaulois obelix = new Gaulois("Obelix", 80);
		 panoramix.booster(obelix);
		 obelix.parler("Par Benelos ce n'est pas juste");
		 Gaulois asterix = new Gaulois("Astérix ", 8);
		 asterix.parler("Bonjour a tous !");
		 panoramix.booster(asterix);
		 minus.parler(" UN GAU... UN GAUGAUUU... UN GAULOIS !!!!");
		 asterix.frapper(minus);
		 asterix.frapper(minus);
		 asterix.frapper(minus);
		 }
	

}
