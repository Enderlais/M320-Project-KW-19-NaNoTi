public class MatschKarte extends Karten {
private boolean i;
	
MatschKarte(String name, int stuck) {
	 super(name, stuck);
	}

    @Override
    public void benutzen() {
        //	Schweinchen.SetDrecking(true);	// dann set dreckig auf 0
        System.out.println("Ein Schwein wurde dreckig!");

    }

}
