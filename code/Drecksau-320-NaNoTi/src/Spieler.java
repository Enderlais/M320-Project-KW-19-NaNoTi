import java.util.ArrayList;

public class Spieler {

    String spname;

    Spieler(String name) {
        spname = name;
    }

    public void InitHand(KartenDeck deck) {
    	
    	 ArrayList<Karten> hand = new ArrayList<>();
    	 
    	 while(hand.size() != 3) {
             hand.add(deck.ziehen());                   //geht doch
    	 }
    }
    
    public void Initschweichen() {
    	
   	 ArrayList<Karten> sps = new ArrayList<>();                 //sps ist spieler schweinchen
   	 
   	 if(spa = 2 ) {
   	 while(sps.size() != 5) {
            sps.add(new Schweinchen(false, false, false, false ));                   //geht doch
   	 }
   	 }
    
    String Getspname() {
        return spname;
    }

    @Override
    public String toString() {
        return spname;
    }
}