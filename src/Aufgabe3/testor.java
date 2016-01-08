package Aufgabe3;

import java.util.Scanner;

public class testor {

	
	public static void main(String[] Args) {
		
		
		
		
		Mitarbeiter[] mitarbeiter0 = {new Mitarbeiter(1,"Pimmel","Peter"),
											new Mitarbeiter(2,"Mike","Mikey"),
											new Mitarbeiter(3,"Sam","Serious"),
											new Mitarbeiter(1,"Pimmel","Peter"),
											new Mitarbeiter(2,"Mike","Mikey"),
											};
		
		Mitarbeiter[] mitarbeiter1 = {new Mitarbeiter(6,"Chong","Ching"),
										new Mitarbeiter(7,"Ding Dong","Rama Lama"),
										new Mitarbeiter(8,"Terminator","Der")};
		
		Mitarbeiter[] mitarbeiter2 = {new Mitarbeiter(10,"Wand","Andi")};
		
		Abteilung abteilung0 = new Abteilung("Lager","Müller", mitarbeiter0, 100000 );
		Abteilung abteilung1 = new Abteilung("Typen","DerTyp", mitarbeiter1,  1);
		Abteilung abteilung2 = new Abteilung("Boss","Andi Wand",mitarbeiter2, 888888);
		
		Abteilung[] abteilungen ={abteilung0,abteilung1,abteilung2};
		
		Scanner s = new Scanner(System.in);
		int auswahl;
		System.out.println("Welche Abteilung anzeigen?"
				+ "\n1."+abteilungen[0].getBezeichnung()
				+ "\n2."+abteilungen[1].getBezeichnung()
				+ "\n3."+abteilungen[2].getBezeichnung()
				+ "\n4. Alle ausgeben");
		auswahl = s.nextInt();
		s.close();
		
		switch (auswahl){
				case 1:
					abteilungen[0].display();
					break;
					
				case 2:
					abteilungen[1].display();
					break;
				case 3:
					abteilungen[2].display();
					break;
				case 4:
					for(int i=0;i<abteilungen.length;i++){
						abteilungen[i].display();
						System.out.println("------------------");
					}
					break;
				default:
					System.err.println("Falsche Eingabe");
					break;
		}
		
		
		
		
	}
	
	

}
