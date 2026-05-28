public class HausKarte extends Karten {
    private boolean geblitzt;
    private boolean blitzstange;
    private boolean verschlossen;

    HausKarte(String name, int stuck, boolean blitzstange, boolean geblitzt, boolean verschlossen) {
        super(name, stuck);
        this.geblitzt = geblitzt;
        this.blitzstange = blitzstange;
        this.verschlossen = verschlossen;
    }

    //getters

    public boolean getVerschlossen() {
        return verschlossen;
    }

    public boolean getBlitzerstange() {
        return blitzstange;
    }

    public boolean getGeblitzt() {
        return geblitzt;
    }

    //setters

    public void setVerschlossen(boolean e) {
        verschlossen = e;
    }

    public void setBlitzerstange(boolean e) {
        blitzstange = e;
    }

    public void setGeblitzt(boolean e) {
        geblitzt = e;
    }

    @Override
    public void benutzen(Spieler spieler, int swn) {

        System.out.println("Ein Stall wurde gebaut!");

    }
}
