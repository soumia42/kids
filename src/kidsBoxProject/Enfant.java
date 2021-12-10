package kidsBoxProject;

public class Enfant {
private String identifiantEnfant;
private int xEnfant;
private int yEnfant;
private Box box;
public String getIdentifiantEnfant() {
	return identifiantEnfant;
}
public void setIdentifiantEnfant(String identifiantEnfant) {
	this.identifiantEnfant = identifiantEnfant;
}
public int getxEnfant() {
	return xEnfant;
}
public void setxEnfant(int xEnfant) {
	this.xEnfant = xEnfant;
}
public int getyEnfant() {
	return yEnfant;
}
public void setyEnfant(int yEnfant) {
	this.yEnfant = yEnfant;
}
public Enfant() {
	super();
	// TODO Auto-generated constructor stub
}
public Enfant(String identifiantEnfant, int xEnfant, int yEnfant) {
	super();
	this.identifiantEnfant = identifiantEnfant;
	this.xEnfant = xEnfant;
	this.yEnfant = yEnfant;
}
public Box getBox() {
	return box;
}
public void setBox(Box box) {
	this.box = box;
}
public Enfant(String identifiantEnfant, int xEnfant, int yEnfant, Box box) {
	super();
	this.identifiantEnfant = identifiantEnfant;
	this.xEnfant = xEnfant;
	this.yEnfant = yEnfant;
	this.box = box;
}


}
