public class BlitzKarte extends Karten {

    BlitzKarte(String name, int stuck) {
        super(name, stuck);
    }


    @Override
    public void benutzen(Spieler spieler, int swn) {
        //	HausKarte.SetGeblitzt(true);
        System.out.println("Ein Stall wurde zerstört!");
    }
}

