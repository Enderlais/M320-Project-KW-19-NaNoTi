import java.util.ArrayList;

public class Spieler {

	int spau = 0;
    String spname;

    Spieler(String name) {
        spname = name;
    }

    public void InitHand(KartenDeck deck) {

        ArrayList<Karten> hand = new ArrayList<>();

        while (hand.size() != 3) {
            hand.add(deck.ziehen());                   //geht doch
        }
    }



    public void Initschweichen(int spa) {

        ArrayList<Schweinchen> sps = new ArrayList<>();

        if (spa == 2) {
            while (sps.size() != 5) {
                sps.add(new Schweinchen(false, false, false, false));
            }
        } else if (spa == 3) {
            while (sps.size() != 4) {
                sps.add(new Schweinchen(false, false, false, false));
            }
        } else {
            while (sps.size() != 3) {
                sps.add(new Schweinchen(false, false, false, false));
            }
        }
    }
    

        String Getspname () {
            return spname;
        }

        @Override
        public String toString () {
            return spname;
        }
    }
