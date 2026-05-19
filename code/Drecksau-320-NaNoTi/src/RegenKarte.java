
public class RegenKarte extends Karten {

	RegenKarte(String name, int stuck) {
		 super(name, stuck);
		}	

    @Override
    public void benutzen() {
        //if(Schweinchen.GetHausbesitzer() = true) {
        //		System.out.println("leider besitzt das schwein ein haus!");
        //	}else {
        //	Schweinchen.SetHausbesitzer(true);
        System.out.println("Ein Schwein wurde sauber!");
    }

}
