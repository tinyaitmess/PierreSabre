package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong",0);
		yaku.direBonjour();
		yaku.extorquer(marco);
		
	}
}
