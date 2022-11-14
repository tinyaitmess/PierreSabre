package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don=argent/10;
		argent-=don;
		parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
	}
	public void provoquer(Yakuza adversaire) {
		if ((2*honneur)>adversaire.getReputation()) {
			argent+=adversaire.getArgent();
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait"+
			"à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
			
		}else {
			honneur-=1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argent);
			
			argent=0;
		}
	}
	
}
