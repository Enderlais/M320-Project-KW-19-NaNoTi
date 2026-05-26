public class MatschKarte extends Karten {
private boolean i;
	
MatschKarte(String name, int stuck) {
	 super(name, stuck);
	}

@Override 
    public void Benutzen(Spieler spieler, int swn) {									//swn = schweinenummer 			//geht ned, weiss nicht wiso
        Schweinchen	jsw = spieler.sps.get(swn);
        	jsw.SetDrecking(true);	// dann set dreckig auf 0							//jws ist jetztige schwein nummer
        	spieler.sps.set(swn, jsw);
        System.out.println("Ein Schwein wurde dreckig!");

    }

}
