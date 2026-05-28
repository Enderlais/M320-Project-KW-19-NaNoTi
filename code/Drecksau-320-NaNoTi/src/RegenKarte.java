public class RegenKarte extends Karten {

    RegenKarte(String name, int stuck) {
        super(name, stuck);
    }

    @Override
    public void benutzen(Spieler spieler, int swn) {                                    //swn = schweinenummer 			//geht ned, weiss nicht wiso
       swn = 0;
    	while(spieler.sps.size() != swn) {
    	Schweinchen jsw = spieler.sps.get(swn);
        if(jsw.GetHausbesitzer() == false) {
        	jsw.SetDrecking(false);    // dann set dreckig auf 0							//jws ist jetztige schwein nummer
        } else {System.out.println("leider hatt schweinchen nummer " + swn + " von " + spieler + " ein haus.");
        } swn++;
        
    	}
        
        System.out.println("Ein Schwein wurde dreckig!");
    }

}
