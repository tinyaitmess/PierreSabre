package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public int getReputation() {
		return reputation;
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
	
	public int perdre() {
		
		reputation-=1;
		parler("J’ai perdu mon duel et mes "+argent+" sous, snif..."+
		"J'ai déshonoré le clan de "+clan);
		argent=0;
		return 0;
	}
	
	public void gagner(int gain) {
		argent+=gain;
		reputation+=1;
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan de "+clan+" ?"+
		"Je l'ai depouillé de ses "+gain+" sous.");
	}
}
