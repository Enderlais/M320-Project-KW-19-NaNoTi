import java.util.ArrayList;
import java.util.Collections; //fürs shuffling
public class KartenDeck {

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
        ziehstapel.add(new BlitzKarte("Blitz", 1));
        ziehstapel.add(new MatschKarte("Matsch", 1));
        ziehstapel.add(new RegenKarte("Regen", 1));
        ziehstapel.add(new HausKarte("Haus", 1, false, false, false));
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
