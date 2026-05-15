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
    	}
    	i = 0;
    	while( i != 21 ) {
        ziehstapel.add(new MatschKarte("Matsch", i + 1));
        i++;
    	}
    	 i = 0;
    	// original ohne while mit 1 anstatt i
    	while( i != 4 ) {
        ziehstapel.add(new RegenKarte("Regen", i + 1));
    	}
    	i = 0;
    	while( i != 9 ) {
        ziehstapel.add(new HausKarte("Haus", i + 1, false, false, false));
    	}
    	i = 0;
    	while( i != 8 ) {
        ziehstapel.add(new WaschKarte("Wasch", i + 1));
    	}
    	i = 0;
    	while( i != 4 ) {
        ziehstapel.add(new VerschlossenKarte("Verschliessen", i + 1));
    	}
    	while( i != 4 ) {
            ziehstapel.add(new BlitzableiterKarte("Blitzableiter", i + 1));
        	}
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
