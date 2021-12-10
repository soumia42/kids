package kidsBoxProject;



public class Jardin implements Distance{
private Box[] box;
private Enfant[] enfant;

	

		public Jardin(Box[] box, Enfant[] enfant) {
	super();
	this.box = box;
	this.enfant = enfant;
}
		public Box[] getBox() {
	return box;
}
public void setBox(Box[] box) {
	this.box = box;
}
public Enfant[] getEnfant() {
	return enfant;
}
public void setEnfant(Enfant[] enfant) {
	this.enfant = enfant;
}
		public Jardin() {
	super();
	// TODO Auto-generated constructor stub
}
	static public double sqr(int a) {
        return a*a;
    }
	@Override
	public double disCalculer(Enfant e,Box b) {
		// TODO Auto-generated method stub
		return Math.sqrt(sqr(b.getxBox() - e.getxEnfant()) + sqr(b.getyBox() - e.getyEnfant()));
	}

	
	
}
