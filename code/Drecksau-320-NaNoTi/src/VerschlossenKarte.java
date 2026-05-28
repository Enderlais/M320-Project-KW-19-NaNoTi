public class VerschlossenKarte extends Karten {


    VerschlossenKarte(String name, int stuck) {
        super(name, stuck);
    }


    @Override
    public void benutzen(Spieler spieler, int swn) {
        //	HausKarte.setVerschlossen(true);
        System.out.println("Das Haus wurde verriegelt!");
    }


}
