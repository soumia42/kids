package kidsBoxProject;

import java.util.Arrays;

import java.util.Scanner;

public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int nbrBox=input.nextInt();
		int nbrEnfant=input.nextInt();
		Box[] boxs=new Box[nbrBox];
		Enfant[] enfants=new Enfant[nbrEnfant];
		
		Jardin jardin=new Jardin(boxs,enfants);
		
for (int i=0;i<nbrBox;i++) {
	boxs[i]=new Box(input.next(),input.nextInt(),input.nextInt());
}

for(int i=0;i<nbrEnfant;i++) {
	enfants[i]=new Enfant(input.next(),input.nextInt(),input.nextInt());
}

                          

double[][] distances=new double[nbrEnfant][nbrBox];


for(int i=0;i<nbrEnfant;i++) {
	for(int j=0;j<nbrBox;j++) {
		distances[i][j]=jardin.disCalculer(enfants[i], boxs[j]);
	
	}}
	
	for(int i =0;i<nbrEnfant;i++) {
		
		Arrays.sort(distances[i]);
	}
	
	for(int i=0;i<nbrEnfant;i++) {
		System.out.println("la distance minimale entre"+" "+enfants[i].getIdentifiantEnfant()+" "+"et une box est:"+distances[i][0]);
	}



	}

}
