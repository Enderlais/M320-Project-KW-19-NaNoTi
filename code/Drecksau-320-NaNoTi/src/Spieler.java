import java.util.ArrayList;

public class Spieler {

    String spname;
    ArrayList<Karten> hand = new ArrayList<>();
    Spieler(String name) {
        spname = name;
    }

    Spieler(String spname, ArrayList<Karten> hand) {
        this.spname = spname;
        this.hand = hand;
    }

    public void InitHand(KartenDeck deck) {

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
