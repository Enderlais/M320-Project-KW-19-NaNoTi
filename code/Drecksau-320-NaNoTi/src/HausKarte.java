
public class HausKarte extends Karten {
private boolean geblitzt;
private boolean blitzstange;
private boolean verschlossen;
	HausKarte(String name, int stuck, boolean blitzstange, boolean geblitzt, boolean verschlossen){
		super(name, stuck);
		this.geblitzt = geblitzt;
		this.blitzstange = blitzstange;
	}
	
	
	
	
	//getters
	
	public boolean GetVerschlossen() {
		return verschlossen;
		
	}
	
	public boolean GetBlitzerstange() {
		return blitzstange;
		
	}
	
	public boolean GetGeblitzt() {
		return geblitzt;
		
	}
	
	
	
	//setters
	
	
	public void SetVerschlossen(boolean e) {
		
		verschlossen = e;
		
	}
	
	public void SetBlizerstange(boolean e) {
		
		blitzstange = e;
		
	}
	
	public void SetGeblitzt(boolean e) {
		
		geblitzt = e;
		
	}

	

	
}
