import java.util.Scanner;

public class WaschKarte extends Karten {
	Scanner sc = new Scanner(System.in);
    WaschKarte(String name, int stuck) {
        super(name, stuck);
    }


    
    @Override
    public void benutzen(Spieler spieler, int swn) {                                    //swn = schweinenummer 			//geht ned, weiss nicht wiso
        Schweinchen jsw = spieler.sps.get(swn);
        
        if(jsw.GetDrecking() == false) {
        	System.out.println("dieses schweinchen ist bereits sauber, bitte waehle ein anderes.");
        	System.out.println(spieler.sps);
        	  jsw = spieler.sps.get(sc.nextInt() - 1);
        }
        jsw.SetDrecking(true);    // dann set dreckig auf 0							//jws ist jetztige schwein nummer
        spieler.sps.set(swn, jsw);      // Schwein wird mit dreckigem Schwein ersetzt
        System.out.println("Ein Schwein wurde gesaubert!");
    }}




