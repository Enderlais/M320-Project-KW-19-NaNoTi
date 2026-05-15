public class Spieler {

    String spname;

    Spieler(String name) {
        spname = name;
    }

    String Getspname() {
        return spname;
    }

    @Override
    public String toString() {
        return spname;
    }
}