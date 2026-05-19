public abstract class Karten {

	String kartenname;
	private int stuck;

	Karten(String name, int stuck) {
		this.kartenname = name;
		this.stuck = stuck;
		}
	
	String getKartenname() {
		return kartenname;
	}
	
	int getStuck() {
		return stuck;
	}

	void setKartenname(String kna) {
		kartenname = kna;
	}
	
	void setStuck(int stuck) {
		this.stuck = stuck;
	}
    public abstract void benutzen();    //GANZ WICHTIG: Damit alle Unterklassen ihre eigene benutzen() Methode haben
}

