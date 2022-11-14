package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	private int nbConnaissance;
	private Humain[] connaissances;
	
	public Humain(String nom, String boisson, int argent, int nbConnaissance) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.nbConnaissance= nbConnaissance;
		connaissances= new Humain[30];
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("("+ nom +") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson+".");
	}
	
	public void boire() {
		parler( "Mmmm, un bon verre de "+ boisson+" ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix>=argent) {
			parler(" J'ai "+argent+" sous en poche."
+" Je vais pouvoir m'offrir "+bien +" ├а "+prix+" sous");
			perdreArgent(prix);
		}else {
			parler(" Je n'ai plus que "+argent+" sous en poche. Je ne peux meme pas"
+ " m'offrir "+bien+" ра "+prix+" sous.");
		}
	}
	public void memoriser(Humain humain) {
		if (nbConnaissance<30) {
			connaissances[nbConnaissance]=humain;
			nbConnaissance+=1;
		}else {
			for(int i=0;i<29;i++) {
				connaissances[i]=connaissances[i+1];
			}
			connaissances[29]=humain;
		}
	}
	
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre();
		memoriser(autreHumain);
	}
	public void listerConnaissance() {
		for (int i=0;i<nbConnaissance;i++) {}
	}

}
