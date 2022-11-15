package histoire;
import personnages.Gaulois;
import personnages.Equipement;


public class Musee {
	private Trophee [] tab = new Trophee[200];
	private int nbTrophee = 0;
	
	
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		Trophee trophee = new Trophee(gaulois, equipement);
		this.tab[nbTrophee] = trophee;
		this.nbTrophee = this.nbTrophee + 1;
		
	}

}
