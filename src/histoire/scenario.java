package histoire;

import java.util.Random;

import personnages.Gaulois;
import personnages.Romain;

public class scenario {
	public static void main(String[] args) {
		Romain minus = new Romain(" Minus ", 6);
		 System.out.println(minus);
		 Gaulois asterix = new Gaulois("Astérix ", 8);
		 System.out.println(asterix);
		 asterix.parler("Bonjour a tous !");
		 minus.parler(" UN GAU... UN GAUGAUUU... UN GAULOIS !!!!");
		 asterix.frapper(minus);
		 asterix.frapper(minus);
		 asterix.frapper(minus);
		 }
	

}
