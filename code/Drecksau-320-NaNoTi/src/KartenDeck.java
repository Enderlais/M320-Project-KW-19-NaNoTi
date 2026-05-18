import java.util.ArrayList;
import java.util.Collections; //fürs shuffling
public class KartenDeck {
int i = 0;
    private ArrayList<Karten> ziehstapel;
    private ArrayList<Karten> ablagestapel;

    public KartenDeck() {
        ziehstapel = new ArrayList<>();
        ablagestapel = new ArrayList<>();

        //Platz für die:
        kartenErstellen();
        mischen();                
    }

    public void kartenErstellen() {
    	while( i != 4 ) {
    	ziehstapel.add(new BlitzKarte("Blitz", i + 1));
    	System.out.println("BlitzKarte Ins Deck geladen " + i);
    	i++;
    	}
    	i = 0;
    	while( i != 21 ) {
        ziehstapel.add(new MatschKarte("Matsch", i + 1));
        System.out.println("MatschKarte Ins Deck geladen " + i);
        i++;
    	}
    	 i = 0;
    	// original ohne while mit 1 anstatt i
    	while( i != 4 ) {
        ziehstapel.add(new RegenKarte("Regen", i + 1));
        System.out.println("RegenKarte Ins Deck geladen " + i);
        i++;
    	}
    	i = 0;
    	while( i != 9 ) {
        ziehstapel.add(new HausKarte("Haus", i + 1, false, false, false));
        System.out.println("HausKarte Ins Deck geladen " + i);
        i++;
    	}
    	i = 0;
    	while( i != 8 ) {
        ziehstapel.add(new WaschKarte("Wasch", i + 1));
        System.out.println("WaschKarte Ins Deck geladen " + i);
        i++;
    	}
    	i = 0;
    	while( i != 4 ) {
        ziehstapel.add(new VerschlossenKarte("Verschliessen", i + 1));
        System.out.println("VerschlossenKarte Ins Deck geladen " + i);
        i++;
    	}
    	while( i != 4 ) {
            ziehstapel.add(new BlitzableiterKarte("Blitzableiter", i + 1));
            System.out.println("BlitzableiterKarte Ins Deck geladen " + i);
            i++;
        	}
    	System.out.println("alle karten erfolgreich ins deck geladen!");
    }

    public void mischen() {
        Collections.shuffle(ziehstapel);    //Mischt die Karten vom Stapel
    }

    public Karten ziehen() {
        if (ziehstapel.isEmpty()) {
            ziehstapel = ablagestapel;
            ablagestapel = new ArrayList<>();
            mischen();
        }
        return ziehstapel.remove(0);
    }

    public void ablegen(Karten karte) {
        ablagestapel.add(karte);    //Da wird die Karte in einen anderen Stapel abgelegt
    }
}
