
public class Schweinchen {
private boolean drecking;
private boolean Hausbesitzer;
private boolean blitzableiter;
private boolean verschlossen;

Schweinchen(boolean drecking, boolean Hausbesitzer, boolean blitzableiter, boolean verschlossen){
	this.drecking = drecking; 
	this.Hausbesitzer = Hausbesitzer;
	this.blitzableiter = blitzableiter;
	this.verschlossen = verschlossen;
	}

boolean GetDrecking() {
	return 	this.drecking;
	
}

boolean GetHausbesitzer() {
	return 	this.Hausbesitzer;
	
}

boolean GetBlitzableiter() {
	return 	this.blitzableiter;
	
}

boolean GetVerschlossen() {
	return 	this.verschlossen;
	
}

}
