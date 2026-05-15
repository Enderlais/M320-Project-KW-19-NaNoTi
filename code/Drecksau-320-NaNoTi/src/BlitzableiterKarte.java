
public class BlitzableiterKarte extends Karten {
  
	
	BlitzableiterKarte(String name, int stuck) {
	 super(name, stuck);
	}


    @Override
    public void benutzen() {
        //	HausKarte.setBlitzableiter(true);
        System.out.println("Blitzableiter Installiert!");
    }


}
