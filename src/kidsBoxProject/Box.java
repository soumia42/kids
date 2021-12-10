package kidsBoxProject;

import java.util.ArrayList;
import java.util.List;

public class Box {
private String identifiantBox;
private int xBox;
private int yBox;
private List<Enfant> enfants=new ArrayList<Enfant>();
public String getIdentifiantBox() {
	return identifiantBox;
}
public void setIdentifiantBox(String identifiantBox) {
	this.identifiantBox = identifiantBox;
}
public int getxBox() {
	return xBox;
}
public void setxBox(int xBox) {
	this.xBox = xBox;
}
public int getyBox() {
	return yBox;
}
public void setyBox(int yBox) {
	this.yBox = yBox;
}
public Box() {
	super();
	// TODO Auto-generated constructor stub
}
public Box(String identifiantBox, int xBox, int yBox) {
	super();
	this.identifiantBox = identifiantBox;
	this.xBox = xBox;
	this.yBox = yBox;
}
public List<Enfant> getEnfants() {
	return enfants;
}
public void setEnfants(List<Enfant> enfants) {
	this.enfants = enfants;
}
public Box(String identifiantBox, int xBox, int yBox, List<Enfant> enfants) {
	super();
	this.identifiantBox = identifiantBox;
	this.xBox = xBox;
	this.yBox = yBox;
	this.enfants = enfants;
}


	
	
}
