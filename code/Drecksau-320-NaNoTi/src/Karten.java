
public abstract class Karten {
	private String name;
	private int stuck;

	
	
	Karten(String name, int stuck) {
		this.name = name;
		this.stuck = stuck;
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

