package personnages;

public class Commercant extends Humain {
	private String boisson="thé";
	public Commercant(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	//pour seFaireExtorquer j'ai rendu argent public
	public int seFaireExtorquer() {
		
		return argent=0;
	}
	
}
