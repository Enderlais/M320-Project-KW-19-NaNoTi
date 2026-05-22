import static java.lang.Thread.sleep;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections; //fürs shuffling

public class KartenDeck {
	int i = 0;
	private ArrayList<Karten> ziehstapel;
	private ArrayList<Karten> ablagestapel;

	public KartenDeck() {
		ziehstapel = new ArrayList<>();
		ablagestapel = new ArrayList<>();

		// Platz für die:
		kartenErstellen();
		mischen();
	}

	public void kartenErstellen() {
		while (i != 4) {
			ziehstapel.add(new BlitzKarte("Blitz", i + 1));
			System.out.println("BlitzKarte Ins Deck geladen " + i);
			i++;
		}
		i = 0;
		while (i != 21) {
			ziehstapel.add(new MatschKarte("Matsch", i + 1));
			System.out.println("MatschKarte Ins Deck geladen " + i);
			i++;
			int r = (int) Math.random() * 10000;
			r = r + 200;
			try {
				sleep(r);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

		}
		i = 0;
		// original ohne while mit 1 anstatt i
		while (i != 4) {
			ziehstapel.add(new RegenKarte("Regen", i + 1));
			System.out.println("RegenKarte Ins Deck geladen " + i);
			i++;
			int r = (int) Math.random() * 10000;
			r = r + 200;
			try {
				sleep(r);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		i = 0;
		while (i != 9) {
			ziehstapel.add(new HausKarte("Haus", i + 1, false, false, false));
			System.out.println("HausKarte Ins Deck geladen " + i);
			i++;
			int r = (int) Math.random() * 10000;
			r = r + 200;
			try {
				sleep(r);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		i = 0;
		while (i != 8) {
			ziehstapel.add(new WaschKarte("Wasch", i + 1));
			System.out.println("WaschKarte Ins Deck geladen " + i);
			i++;
			int r = (int) Math.random() * 10000;
			r = r + 200;
			try {
				sleep(r);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		i = 0;
		while (i != 4) {
			ziehstapel.add(new VerschlossenKarte("Verschliessen", i + 1));
			System.out.println("VerschlossenKarte Ins Deck geladen " + i);
			i++;
			int r = (int) Math.random() * 10000;
			r = r + 200;
			try {
				sleep(r);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		while (i != 4) {
			ziehstapel.add(new BlitzableiterKarte("Blitzableiter", i + 1));
			System.out.println("BlitzableiterKarte Ins Deck geladen " + i);
			i++;
			int r = (int) Math.random() * 10000;
			r = r + 200;
			try {
				sleep(r);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("alle karten erfolgreich ins deck geladen!");

		mischen();
	}

	public void mischen() {
		Collections.shuffle(ziehstapel); // Mischt die Karten vom Stapel
	}

	public Karten ziehen() {
		if (ziehstapel.isEmpty()) {
			ziehstapel = ablagestapel;
			ablagestapel = new ArrayList<>();
			mischen();
		}
		Karten bob = ziehstapel.get(0);
		ziehstapel.remove(0);
		return bob; // musst karte mitgeben und nicht remove.
	}

	public void ablegen(Karten karte) {
		ablagestapel.add(karte); // Da wird die Karte in einen anderen Stapel abgelegt
	}
}
