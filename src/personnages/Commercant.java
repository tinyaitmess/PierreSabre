package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom,"th�", argent);
	}
	
	//pour seFaireExtorquer j'ai rendu argent protected
	public int seFaireExtorquer() {
		parler(" J'ai tout perdu! Le monde est trop injuste...");
		return argent=0;
	}
	
	public void recevoir(int arg) {
		parler(arg+" sous ! Je te remercie g�n�reux donateur!");
		argent+=arg;
	}
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",20);
	}
	
}
