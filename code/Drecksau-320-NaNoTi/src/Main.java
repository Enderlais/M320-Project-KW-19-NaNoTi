import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

//=================================================================================
//                      Main Methode
//=================================================================================
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Spieler> spnList = new ArrayList<>();

        System.out.println("Willkommen zu unserem Dreckssau Text-Spiel");

        System.out.println("initializing.");
// Punkte animation die Punkte laden mit verzögerung hinein.
        try {
            sleep(90);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print("..");

        try {
            sleep(90);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print("..");

        try {
            sleep(90);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print("..");

        try {
            sleep(90);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print("..");

        try {
            sleep(90);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print("..");

        try {
            sleep(90);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("..");

        try {
            sleep(90);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
// Spiel startet
        while (true) {

            System.out.println("Wollen Sie eine Runde spielen? (j/n)");

            String awn = sc.nextLine();
            // Wenn der user das Spiel startet mit "j" dann beginnt es.
            if (awn.equalsIgnoreCase("j")) {

                System.out.println("Okay :)");

                int spa = 0; // Default spieler anzahl ist bei 0. (Wird nacher geändert)												// die muss irgendwie in spieler. jar benutzt werden zb linie 27
                // Spieleranzahl prüfen
                while (true) {
                    try {

                        System.out.println("Bitte Spieleranzahl eingeben:");

                        spa = sc.nextInt(); //Spieleranzahl
                        sc.nextLine(); // Puffer leeren

                        if (spa >= 2 && spa <= 4) {
                            System.out.println("Spieleranzahl akzeptiert!");
                            break;
                        } else {
                            System.out.println("Bitte geben Sie eine Spielerzahl zwischen 2 und 4 an!");
                        }

                    } catch (Exception e) {

                        System.out.println("Nur Zahlen erlaubt!");
                        sc.nextLine();
                    }
                }

                // Spieler initialisieren
                Spiel spiel = new Spiel();

                spnList = spiel.spielerInitialisieren(spa, sc);

                System.out.println("Alle Spieler erfolgreich registriert.");

                System.out.println("Wollen Sie die jetzige Spielerliste ansehen? (j/n)");

                String spListshow = sc.nextLine();

                if (spListshow.equalsIgnoreCase("j")) {

                    System.out.println(spnList); //spnList = Spielername Liste
                    
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    
                    
                    
                }

                System.out.println("Spiel startet!");

                // Kartendeck nur EINMAL erstellen
                KartenDeck deck = new KartenDeck();
                int q = 0;
                 while(q != spa) { 
                	 Spieler r = new Spieler("placeholder");
                	 r = spnList.get(q);								//	initialisiert alles fuer den spieler
                	 q++;
                	 r.InitSchweichen(spa);
                	 r.InitHand(deck);
                 }
                
              //  Initschweichen(spa)

                // press anny key to continue
                int runde = 1;

                boolean spiellauf = true;

                
                
                while (spiellauf) {

                    System.out.println();
                    System.out.println("Runde " + runde);
                    System.out.println("_____");
                    int r = 0;
                    r = (int) Math.random() * 10000;
                    r = r + 150;

                    try {
                        sleep(r);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                    // Jeder Spieler ist einmal dran
          
                 Spieler jazs = new Spieler("Bob Stadler");    //jazs = jetzidger am zuge spieler
                 int   jazsz = 0;    //jazs = jetzidger am zuge spieler zahl
                 
                    while(jazsz != spa) { 
                    	 int jzskw = 0;
                   	 jazs = spnList.get(jazsz);   										  //  jzsk     jetzt zu spielende karte    
                   	  		System.out.println("spieler " + jazs + " am zuge!");
                   	 
                   	 jazs.NachZihen(deck);
                   	 
                   	 System.out.println("dein volles deck : " + jazs.hand);
                   	 System.out.println("welche karte willst du spielen?");
                   	 boolean bernt = true;
                   	 while(bernt == true) { 
                   		
                   	 jzskw = sc.nextInt() - 1;               	 //  jzskw    jetzt zu spielende karte wahl
                   	if ( jzskw >= -1 ||  jzskw <= 4) {System.out.println("invalide eingabe, bitte zahl zwischen 1 ~ 3 eingeben");}				// korrigiert nutzereingabe so das es mit dem array stimmt. und giebt falsch aus wenn zu niedrig
                   	else {bernt = false;}
                   	 } 
                   	 Karten jzsk = jazs.GetHandPos(jzskw);		              //nimmt die hand position die ausgewhelt wurde und giebt diese zuruck
                   	  System.out.println(jzsk + "test Output 1");                //test / debug
                   	  jazs.hand.remove(jzskw);
                   	 System.out.println(jzsk + "test output 2");	
                   	System.out.println(jazs.hand + "test output");                //test / debug
                   	
                        
                   	try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }		
          
                   	jazsz++;
                   	 
                    }
                }
            }
        }
    }
}
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    /*   for (Spieler spieler : spnList) {

                        System.out.println();

                        System.out.println(spieler.Getspname() + " ist dran!");

                        Karten k = deck.ziehen();

                        System.out.println("Gezogene Karte: " + k.getKartenname());
                        System.out.println("Möchten Sie ihre Karte verwenden? (j/n)");
                        // Hand wird gezeigt
                        
                        System.out.println("Welche Karte wollen Sie verwenden?");
                            int cardchoose = sc.nextInt();
                            if (cardchoose == 1) {
                                k.benutzen();
                                deck.ablegen(k);
                            }
                            //Hier aktionen einfuegen u karten hand anzeigen.j



                        System.out.println("Zug beendet.");

                        /*
                        Beispiel Wincondition

                        if (spielerHatGewonnen) {
                            spiellauf = false;
                            break;
                        }
                        */

/*
                    runde++;
                }

                System.out.println();
                System.out.println("Game Over");
                System.out.println("Der Gewinner ist: Placeholder!");

                break;

            } else if (awn.equalsIgnoreCase("n")) {

                System.out.println(":(");
                break;

            } else {

                System.out.println("Ungültige Eingabe");
            }
        }

        sc.close();
    }

    //   public int GetSpa() {
    // 	return spa;
    //  }
}
*/