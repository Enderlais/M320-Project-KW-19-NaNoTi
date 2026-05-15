public class BlitzKarte extends Karten {

    BlitzKarte(String name, int stuck) {
	 super(name, stuck);
	}


    @Override
    public void benutzen() {
        //	HausKarte.SetGeblitzt(true);
        System.out.println("Ein Stall wurde zerstört!");
    }
}

