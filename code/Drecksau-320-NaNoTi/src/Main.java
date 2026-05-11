import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        System.out.println("Wilkommen zu unserem Dreckssau Text-Spiel");
        
        while(true) {
        	System.out.println("Wollen Sie eine runde spielen");
        	System.out.println("0 = nein");
        	System.out.println("1 = ja");
        	
        	int awn = 0;
        	awn = sc.nextInt();
        	
        	if(awn == 1) {
        		System.out.println("Okay :)");
        		
        		System.out.println("Spieler anzahl bitte angeben :");
        		
        		int spa = sc.nextInt();   // spa ist spieler anzahl

        		
        		while(int i = 0; spa > i; i++; ) {
        			System.out.println("Bitte Spieler namen angeben");
        			System.out.println("Spieler " + "i :");
        			String spn = new String(sc.next());
        			ArrayList<> spnList = new ArrayList<>();   //spn list name als increment machen um variable menge arrayes zu erstellen
        			
        		}
        		
        		
        		
        		// hier muss man dann das spiel initialisieren, also jedem 
        		// spieler die ihm zustehendem karten geben.
        		// bei 2 sind das 5 schweine, 3 = 4, 4 = 3
        		//hier muessen auch 3 random aktions karten ausgeteilt werden.
        		// der rest der karten muss auf einen ablagestapel
        		// alle schweine-attribute auf 0 setzen
        		
        		
        		
        		
        		
        	}
        	
        }
        
	}

}
