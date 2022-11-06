package personnages;

public class Commercant extends Humain {
	public Commercant(String nom,String boisson, int argent) {
		super(nom,boisson, argent);
	}
	
	//pour seFaireExtorquer j'ai rendu argent protected
	public int seFaireExtorquer() {
		parler(" J’ai tout perdu! Le monde est trop injuste...");
		return argent=0;
	}
	
	public void recevoir(int argent) {
		parler(argent+" sous ! Je te remercie généreux donateur!");
	}
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco","thé",20);
	}
	
}
