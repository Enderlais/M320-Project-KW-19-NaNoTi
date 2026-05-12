
public class Karten {
	private String name;
	private int stuck;

	
	
	Karten(String name, int Stuck) {
		this.name = name;
		this.stuck = Stuck;
		}
	
	String GetName() {
		return name;
		
	}
	
	int GetStuck() {
		return stuck;
		
	}
	
	
	void setName(String na) {
		name = na;
		
	}
	
	void setStuck(int r) {
		r = stuck;
		
	}
	
}

