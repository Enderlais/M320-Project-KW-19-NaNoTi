import java.util.ArrayList;
import java.util.Scanner;
public class Spiel {

    public ArrayList<Spieler> spielerInitialisieren(int anzahl, Scanner sc) {

        ArrayList<Spieler> spliste = new ArrayList<>();

        for (int i = 0; i < anzahl; i++) {

            System.out.println("Spieler " + (i + 1) + " Name:");

            String name = sc.nextLine();

            Spieler s = new Spieler(name);

            spliste.add(s);
        }

        return spliste;

    }


}
