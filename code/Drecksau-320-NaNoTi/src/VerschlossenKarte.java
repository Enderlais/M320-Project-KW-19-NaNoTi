
public class VerschlossenKarte extends Karten {


	    VerschlossenKarte(String name, int stuck) {
		 super(name, stuck);
		}


	    @Override
	    public void benutzen() {
	        //	HausKarte.setVerschlossen(true);
	        System.out.println("die scheune wurde Verrigelt!");
	    }
	


}
