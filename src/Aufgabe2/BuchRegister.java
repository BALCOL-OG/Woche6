package Aufgabe2;

public class BuchRegister {

	Buch buch;
	Datum rueckGabe;
	
	BuchRegister(){
		
	}
	
	BuchRegister(String standNr, String titel, String verfasser, int tag, String monat){
		this.rueckGabe = new Datum(tag, monat);
		this.buch = new Buch(standNr, titel, verfasser);
	}

	
	
}
