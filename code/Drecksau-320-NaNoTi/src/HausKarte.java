import java.util.ArrayList;
import java.util.Scanner;

public class HausKarte extends Karten {
    private boolean geblitzt;
    private boolean blitzstange;
    private boolean verschlossen;
    private boolean isthaus;
    Scanner sc = new Scanner(System.in);
    ArrayList<HausKarte> sak = new ArrayList<>(); 	
    HausKarte(String name, int stuck, boolean blitzstange, boolean geblitzt, boolean verschlossen) {
        super(name, stuck);
        this.geblitzt = geblitzt;
        this.blitzstange = blitzstange;
        this.verschlossen = verschlossen;
        isthaus = true;
    }

    //getters
    public boolean getIstHaus() { return isthaus;}
    
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
    public void benutzen(Spieler spieler, int swn) {                                    //swn = schweinenummer 			//geht ned, weiss nicht wiso
        Schweinchen jsw = spieler.sps.get(swn);
        
        if(jsw.GetHausbesitzer() == true) {
        	System.out.println("dieses schweinchen ist bereits Hausbesitzer, bitte waehle ein anderes.");
        	System.out.println(spieler.sps);
        	  jsw = spieler.sps.get(sc.nextInt() - 1);
        }
        jsw.SetHausbesitzer(true);    // dann set dreckig auf 0							//jws ist jetztige schwein nummer
        spieler.sps.set(swn, jsw);      // Schwein wird mit dreckigem Schwein ersetzt
        System.out.println("Ein Schwein wurde dreckig!");
    }

}
