import java.util.ArrayList;

//=================================================================================
//                      Spieler Klasse
//=================================================================================
public class Spieler {


    ArrayList<Schweinchen> sps = new ArrayList<>();

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
        int r = 0;
        while (hand.size() != 3) {
            hand.add(deck.ziehen());
            System.out.println(hand.get(r));//geht doch
            r++;
        }
    }

    public void NachZihen(KartenDeck deck) {
        int r = 0;
        while (hand.size() != 3) {
            hand.add(deck.ziehen());
            System.out.println("Du hast eine " + hand.get(r) + " gezogen :)");
            r++;
        }
    }

    public void InitSchweichen(int spa) {

        int jsa = 0;                        //	jsa = jetztige schweinchen anzahl
        if (spa == 2) {
            while (sps.size() != 5) {
                sps.add(new Schweinchen(false, false, false, false));
                jsa++;
                System.out.println("schweinchen nummer " + jsa + " initiallisiert");
            }
        } else if (spa == 3) {
            while (sps.size() != 4) {
                sps.add(new Schweinchen(false, false, false, false));
                jsa++;
                System.out.println("schweinchen nummer " + jsa + " initiallisiert");                                            //debug code hinzugef
            }
        } else {
            while (sps.size() != 3) {
                sps.add(new Schweinchen(false, false, false, false));
                jsa++;
                System.out.println("schweinchen nummer " + jsa + " initiallisiert");
            }
        }
    }


    public Karten GetHandPos(int pos) {
        return hand.get(pos);
    }

    public void RemoveHandPos(int pos) {
        hand.remove(pos);
    }

    public void AddHandPos(Karten karte) {
        hand.add(karte);
    }
//  public  hand GetHand() {
    // 	return hand;						//array hand als ruckgabe geht noch ned
    //   }

    public String Getspname() {
        return spname;
    }

    @Override
    public String toString() {
        return spname;
    }
}
