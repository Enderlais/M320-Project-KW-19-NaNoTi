public class BlitzableiterKarte extends Karten {


    BlitzableiterKarte(String name, int stuck) {
        super(name, stuck);
    }


    @Override
    public void benutzen(Spieler spieler, int swn) {
        //	HausKarte.setBlitzableiter(true);
        System.out.println("Blitzableiter Installiert!");
    }


}
