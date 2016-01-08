package Aufgabe2;

public class Buch {

	String standNr;
	String titel;
	String verfasser;
	
	
	Buch(){
		
	};
	
	Buch(String standNr, String titel, String verfasser){
		this.standNr = standNr;
		this.titel = titel;
		this.verfasser = verfasser;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	
}
