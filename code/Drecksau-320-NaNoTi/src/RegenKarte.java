public class RegenKarte extends Karten {

    RegenKarte(String name, int stuck) {
        super(name, stuck);
    }

    @Override
    public void benutzen(Spieler spieler, int swn) {                                    //swn = schweinenummer 			//geht ned, weiss nicht wiso
        int swn2 = 0;
        while (spieler.sps.size() != swn2) {
            Schweinchen jsw = spieler.sps.get(swn2);
            if (jsw.GetHausbesitzer() == false) {
                jsw.SetDrecking(false);    // dann set dreckig auf 0							//jws ist jetzige schweinchen
            } else {
                System.out.println("Leider hat Schweinchen Nummer " + swn + " von " + spieler + " ein Haus.");
            }
            spieler.sps.set(swn2, jsw);
            swn2++;
        }

        System.out.println("Ein Schwein wurde dreckig!");
    }

}
