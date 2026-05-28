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


                // Kartendeck nur EINMAL erstellen
                KartenDeck deck = new KartenDeck();
                int q = 0;
                while (q != spa) {
                    Spieler r = new Spieler("placeholder");
                    r = spnList.get(q);                                //	initialisiert alles fuer den spieler
                    q++;
                    r.InitSchweichen(spa);
                    r.InitHand(deck);
                }
                System.out.println("Spiel startet!");
                //  Initschweichen(spa)

                // press anny key to continue

                boolean spiellauf = true;

                while (spiellauf) {
                    int runde = 1;
                    System.out.println();
                    System.out.println("Runde " + runde);
                    System.out.println("-----");
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
                    int jazsz = 0;    //jazs = jetzidger am zuge spieler zahl

                    while (jazsz != spa - 1) {
                        int jzskw = 0;
                        jazs = spnList.get(jazsz);                                          //  jzsk     jetzt zu spielende karte
                        System.out.println("Spieler " + jazs + " ist dran!");

                        jazs.NachZihen(deck);

                        System.out.print("Dein aktueller deck: ");
                        System.out.println(jazs.hand);
                        System.out.println("Welche Karte willst du spielen?");
                        boolean bernt = true;
                        while (bernt == true) {
                            try {
                                jzskw = sc.nextInt() - 1;                 //jetzt zu spielende karte wahl
                                if (jzskw >= 0 && jzskw <= 2) { // korrigiert nutzereingabe so das es mit dem array stimmt. und giebt falsch aus wenn zu niedrig
                                    System.out.println("Valide Eingabe!");
                                    bernt = false;
                                } else {
                                    System.out.println("Bitte eine Zahl zwischen 1 bis 3 eingeben");
                                    System.out.println(jazs.hand);
                                    System.out.println("Welche Karte willst du spielen?");  //Kann irgendwie nicht laufen

                                }
                            } catch (Exception e) {
                                System.out.println("Nur Zahlen erlaubt!");
                                System.out.println(jazs.hand);
                                System.out.println("Welche Karte willst du spielen?");
                                sc.nextLine();
                            }
                        }
                        Karten jzsk = jazs.GetHandPos(jzskw);                      //nimmt die hand position die ausgewhelt wurde und giebt diese zuruck    || jzsk ist jetztige zu spielende karte 
                        System.out.println(jzsk + "test Output 1");                //test / debug
                        deck.ablegen(jzsk);
                        jazs.hand.remove(jzskw);
                        System.out.println(jzsk + "test output 2");
                        System.out.println(jazs.hand + "test output");                //test / debug


                        // muss noch if selber karte einbauen

                        System.out.println("Bitte wähle einen Gegner, dem du die Karte verwenden willst");
                        System.out.println(spnList);
                        int jsza = sc.nextInt() - 1;								//jetztiger spieler zum angreifen
                                                                    //jsas jetztig zu atterkierendes schwein
          
                        while(jsza > spnList.size() || jsza == -1 ) {
                        	System.out.println("invalide eingabe, bitte versure chochmal");
                        }
                        Spieler jzas = spnList.get(jsza);
                        
                        System.out.println("Bitte wähle ein gegnerischen schweinchen");
                        System.out.println(jzas.sps);
                        int jzasch = sc.nextInt() - 1;                                            //jsasch jetztig zu atterkierendes schwein //muss noch check einbauen von oben wegen nummer

                        jzsk.benutzen(jzas, jzasch);

                        try {
                            sleep(2000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        jazsz++;
                        if (jazsz == spnList.size()) {
                            runde++;
                        }

                    }
                }
            } else if (awn.equalsIgnoreCase("n")) {

                System.out.println(":(");
                break;

            } else {

                System.out.println("Ungültige Eingabe");
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

            }

        sc.close();
    }

    //   public int GetSpa() {
    // 	return spa;
    //  }
}
*/