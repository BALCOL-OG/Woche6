package Aufgabe3;

public class Mitarbeiter {

	
	private int persNr;
	private String name, vorname;
	
	
	
	Mitarbeiter(int persNr, String name, String vorname){
		this.persNr = persNr;
		this.name = name;
		this.vorname = vorname;
	}



	public int getPersNr() {
		return persNr;
	}



	public void setPersNr(int persNr) {
		this.persNr = persNr;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getVorname() {
		return vorname;
	}



	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}
