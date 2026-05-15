import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Spieler> spnList = new ArrayList<>();

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

            System.out.println("Wollen Sie eine Runde spielen? (j/n)");

            String awn = sc.nextLine();

            if (awn.equalsIgnoreCase("j")) {

                System.out.println("Okay :)");

                int spa = 0;

                // Spieleranzahl prüfen
                while (true) {

                    try {

                        System.out.println("Bitte Spieleranzahl eingeben:");

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

                // Spieler initialisieren
                Spiel spiel = new Spiel();

                spnList = spiel.spielerInitialisieren(spa, sc);

                System.out.println("Alle Spieler erfolgreich registriert.");

                System.out.println("Wollen Sie die jetzige Spielerliste ansehen? (j/n)");

                String spListshow = sc.nextLine();

                if (spListshow.equalsIgnoreCase("j")) {

                    System.out.println(spnList);
                }

                System.out.println("Spiel startet!");

                // Kartendeck nur EINMAL erstellen
                KartenDeck deck = new KartenDeck();

                int runde = 1;
                int maxRunden = 10;

                boolean spiellauf = true;

                while (spiellauf && runde <= maxRunden) {

                    System.out.println();
                    System.out.println("==========");
                    System.out.println("Runde " + runde);
                    System.out.println("==========");

                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                    // Jeder Spieler ist einmal dran
                    for (Spieler spieler : spnList) {

                        System.out.println();

                        System.out.println(spieler.Getspname() + " ist dran!");

                        Karten k = deck.ziehen();

                        System.out.println("Gezogene Karte: " + k.getKartenname());

                        k.benutzen();

                        deck.ablegen(k);

                        System.out.println("Zug beendet.");

                        /*
                        Beispiel Wincondition

                        if (spielerHatGewonnen) {
                            spiellauf = false;
                            break;
                        }
                        */
                    }

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
}