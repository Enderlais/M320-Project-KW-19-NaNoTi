import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen zu unserem Dreckssau Text-Spiel");

        System.out.println("initializing.");


        try {
            sleep(90);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        System.out.print(".");

        try {
            sleep(400);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("...");

        try {
            sleep(60);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print(".");

        try {
            sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print(".");

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("....");

        try {
            sleep(190);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("..");

        while (true) {
            System.out.println("Wollen Sie eine runde spielen? (j/n)");

                String awn = sc.nextLine();

                if (awn.equalsIgnoreCase("j")) {
                    System.out.println("Okay :)");

                    int spa = 0;

                    while (true) {

                        try {
                            System.out.println("Bitte Spieleranzahl eingeben :");

                            spa = sc.nextInt();
                            sc.nextLine();

                            if (spa >= 2 && spa <= 4) {
                                System.out.println("Spieleranzahl akzeptiert!");
                                break;
                            } else {
                                System.out.println("Bitte geben Sie eine Spielerzahl zwischen 2 und 4 an");
                            }

                        } catch (Exception e) {
                            System.out.println("Nur Zahlen erlaubt!");
                            sc.nextLine();
                        }
                    }

                    int i = 0;

                    Spiel spiel = new Spiel();

                    ArrayList<Spieler> spnList = spiel.spielerInitialisieren(spa, sc);


                    System.out.println("Alle Spieler erfolgreich registriert.");

                    System.out.println("Wollen Sie die jetzige Spielerliste ansehen? (j/n)");
                    String spListshow = sc.nextLine();

                    if (spListshow.equalsIgnoreCase("j")) {
                        System.out.println(spnList);
                    }


                    if (i == spa) {
                        System.out.println("Alle Spieler erfolgreich registriert.");
                        System.out.println("Wollen Sie die jetzige Spielerliste ansehen? (j/n)");
                        String spListshow = sc.nextLine();
                        if (spListshow.equalsIgnoreCase("j")) {
                            System.out.println(spnList);
                            System.out.println("Spiel start!");
                          
                            try {
                                sleep(1000);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }   
                            
                            
                            
                        } else if (spListshow.equalsIgnoreCase("n")) {
                            System.out.println("Spiel start!");
                        }
                    }
                    System.out.println("Spiel start!");

                    int runde = 1;
                    boolean spiellauf = true;

                    while (spiellauf) {

                        System.out.println("==========");
                        System.out.println("Runde " + runde);
                        System.out.println("==========");

                        try {
                            sleep(250);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        for (Spieler spieler : spnList) {

                            System.out.println();
                            System.out.println(spieler + " ist dran!");

                            KartenDeck deck = new KartenDeck();

                            Karten k = deck.ziehen();

                            System.out.println("Gezogene Karte: " + k.getKartenname());

                            k.benutzen();

                            deck.ablegen(k);
                            // Karte ziehen
                            // Schwein waschen
                            // Stall bauen
                            // usw.

                            System.out.println("Zug beendet.");

                            /* Beispiel Endgame
                            if (spielerHatGewonnen) {
                                spielLäuft = false;
                                break;
                            }
                            */
                        }
                        runde++;
                    }


                    // hier muss man dann das Spiel initialisieren, also jedem
                    // spieler die ihm zustehendem karten geben.
                    // bei 2 sind das 5 schweine, 3 = 4, 4 = 3
                    //hier müssen auch 3 random aktions karten ausgeteilt werden.
                    // der rest der karten muss auf einen ablagestapel
                    // alle schweine-attribute auf 0 setzen

                    System.out.println("Game Over");
                    System.out.println("Der Gewinner ist: " + "Placeholder" + "!");
                    break;
                } else if (awn.equalsIgnoreCase("n")) {
                    System.out.println(":(");
                    break;
                } else {
                    System.out.println("Ungültige Eingabe");
                }
            }

        }

    }

