public class WaschKarte extends Karten {

    WaschKarte(String name, int stuck) {
        super(name, stuck);
    }


    @Override
    public void benutzen(Spieler spieler, int swn) {                                    //swn = schweinenummer 			//geht ned, weiss nicht wiso
        Schweinchen jsw = spieler.sps.get(swn);
        
        
        
        
        
        
        
        
        jsw.SetDrecking(false);    // dann set dreckig auf 0							//jws ist jetztige schwein nummer
        spieler.sps.set(swn, jsw);      // Schwein wird mit dreckigem Schwein ersetzt
        System.out.println("Ein Schwein wurde dreckig!");
    }
}



