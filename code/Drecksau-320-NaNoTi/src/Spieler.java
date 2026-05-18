import java.util.ArrayList;

public class Spieler {

    String spname;

    Spieler(String name) {
        spname = name;
    }

    public void InitHand() {
    	
    	 ArrayList<Karten> Hand = new ArrayList<>();
    	 
    	 while(Hand.size() != 3) {
    	Hand.add(deck.ziehen());                   //geht ned
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