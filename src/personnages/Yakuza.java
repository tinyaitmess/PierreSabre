package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int vol= victime.argent;
		victime.seFaireExtorquer();
		argent+=vol;
		parler("J'ai pique les "+vol+" sous de "+victime.getNom()
			+",ce qui me fait "+argent+" sous dans ma poche. HiHi!");
	}

}
