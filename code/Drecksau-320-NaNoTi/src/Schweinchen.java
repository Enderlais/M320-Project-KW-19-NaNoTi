
public class Schweinchen {
private boolean drecking;
private boolean hausbesitzer;
private boolean blitzableiter;
private boolean verschlossen;

Schweinchen(boolean drecking, boolean Hausbesitzer, boolean blitzableiter, boolean verschlossen){
	this.drecking = drecking; 
	this.hausbesitzer = Hausbesitzer;
	this.blitzableiter = blitzableiter;
	this.verschlossen = verschlossen;
	}

boolean GetDrecking() {
	return 	this.drecking;
	
}

boolean GetHausbesitzer() {
	return 	this.hausbesitzer;
	
}

boolean GetBlitzableiter() {
	return 	this.blitzableiter;
	
}

boolean GetVerschlossen() {
	return 	this.verschlossen;
	
}

public void SetDrecking(boolean e) {
	
	drecking = e;
	
}

void SetHausbesitzer(boolean f) {
	
	hausbesitzer = f;
	
}

void SetBlitzableiter(boolean g) {
	
	blitzableiter = g;
	
}

void SetVerschlossen(boolean h) {
	
	verschlossen = h;
	
}

}
