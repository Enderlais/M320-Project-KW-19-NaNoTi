import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        System.out.println("Willkommen zu unserem Dreckssau Text-Spiel");
        
        System.out.println("initializing.");
        
        
        try {
  		  Thread.sleep(90);
  		} catch (InterruptedException e) {
  		  Thread.currentThread().interrupt();
  		}
        
        
        System.out.print(".");
        
        try {
  		  Thread.sleep(400);
  		} catch (InterruptedException e) {
  		  Thread.currentThread().interrupt();
  		}
        
        System.out.print("...");
        
        try {
  		  Thread.sleep(60);
  		} catch (InterruptedException e) {
  		  Thread.currentThread().interrupt();
  		}
        
        System.out.print(".");
        
        ArrayList<String> spnList = new ArrayList<>();   //spn list name als increment machen um variable menge arrays zu erstellen
        
        try {
  		  Thread.sleep(300);
  		} catch (InterruptedException e) {
  		  Thread.currentThread().interrupt();
  		}
        
        System.out.print(".");
        
        try {
  		  Thread.sleep(1000);
  		} catch (InterruptedException e) {
  		  Thread.currentThread().interrupt();
  		}
        
        System.out.print("....");
        
        try {
  		  Thread.sleep(190);
  		} catch (InterruptedException e) {
  		  Thread.currentThread().interrupt();
  		}
        
        System.out.println("..");
        
        while(true) {
        	System.out.println("Wollen Sie eine runde spielen? (j/n)");
        	
        	String awn = sc.nextLine();
        	
        	if(awn.equals("j")) {
        		System.out.println("Okay :)");
        		
        		System.out.println("Bitte Spieleranzahl eingeben :");
        		
        		int spa = sc.nextInt();   // spa ist Spieleranzahl

        		int b = 0;
        		int i = 0;
        		while(spa > i) {
        			System.out.println("Bitte Spieler namen angeben");
        			b = i + 1;
        			System.out.println("Spieler " + b + " : " );
                   
                    String spn = sc.nextLine();
                    
                    if(spn.isEmpty()) {   
                    	System.out.println("kann nicht leer sein");
                    	  spn = sc.nextLine();
                    }else {if(spn.isBlank())  System.out.println("kann nicht leer sein");
                    spn = sc.nextLine();}
               
                    
                 spnList.add(spn);            //  Spieler spn = new Spieler(spn);
                    System.out.println(spnList);


        			i++;
        			System.out.println("erfolgreich registriert!");
                    if (i == spa) {
                        System.out.println("Alle Spieler erfolgreich registriert.");
                        System.out.println("Wollen Sie die jetzige Spielerliste ansehen? (j/n)");
                        String spListshow = new String(sc.next());
                        if (spListshow.equals("j")) {


                        } else if (spListshow.equals("n")) {

                        }
                    }
        		}
        		
        		
        		
        		// hier muss man dann das Spiel initialisieren, also jedem
        		// spieler die ihm zustehendem karten geben.
        		// bei 2 sind das 5 schweine, 3 = 4, 4 = 3
        		//hier müssen auch 3 random aktions karten ausgeteilt werden.
        		// der rest der karten muss auf einen ablagestapel
        		// alle schweine-attribute auf 0 setzen





        	} else if (awn.equals("n")) {
                System.out.println(":(");
                break;
            }

        }
        
	}

}
