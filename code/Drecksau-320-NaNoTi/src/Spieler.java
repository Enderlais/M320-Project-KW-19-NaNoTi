import java.util.ArrayList;

public class Spieler {

    String spname;

    Spieler(String name) {
        spname = name;
    }

    public void InitHand() {
    	
    	 ArrayList<Karten> hand = new ArrayList<>();
    	 
    	 while(hand.size() != 3) {
             hand.add(deck.ziehen());                   //geht ned
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