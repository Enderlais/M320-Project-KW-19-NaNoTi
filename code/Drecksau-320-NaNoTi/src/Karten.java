
public class Karten {
	private String Name;
	private int Stuck;

	
	
	Karten(String Name, int Stuck) {
		this.Name = Name;
		this.Stuck = Stuck;
		}
	
	String GetName() {
		return Name;
		
	}
	
	int GetStuck() {
		return Stuck;
		
	}
	
	
	void setName(String Na) {
		Name = Na;
		
	}
	
	void setStuck(int r) {
		r = Stuck;
		
	}
}

