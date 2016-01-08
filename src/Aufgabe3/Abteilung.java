package Aufgabe3;

public class Abteilung {

	private String bezeichnung, nameLtr;
	private Mitarbeiter[] mitarbeiter={new Mitarbeiter(0,"",""),
										new Mitarbeiter(0,"",""),
										new Mitarbeiter(0,"",""),
										new Mitarbeiter(0,"",""),
										new Mitarbeiter(0,"",""),
	};
			
			
	private double budget;
	
	
	Abteilung(String bezeichnung, String nameLtr, double budget){
		
		this.bezeichnung = bezeichnung;
		this.nameLtr = nameLtr;
		this.budget = budget;
	}
	
	Abteilung(String bezeichnung, String nameLtr, Mitarbeiter[] mitarbeiter,double budget){
		
		this.bezeichnung = bezeichnung;
		this.nameLtr = nameLtr;
		this.mitarbeiter = mitarbeiter;
		this.budget = budget;
	}
	
	public void display(){
		System.out.println("Bezeichnung: "+this.getBezeichnung()+" - NameLtr: "+this.getNameLtr()+" - Budget: "+this.getBudget());
		System.out.println("Mitarbeiter:");
		for(int i=0; i<this.mitarbeiter.length; i++){
			System.out.println(this.mitarbeiter[i].getName()+", "+this.mitarbeiter[i].getVorname()+" | "+this.mitarbeiter[i].getPersNr());
		}
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getNameLtr() {
		return nameLtr;
	}

	public void setNameLtr(String nameLtr) {
		this.nameLtr = nameLtr;
	}

	public Mitarbeiter[] getMitarbeiter() {
		return mitarbeiter;
	}

	public void setMitarbeiter(Mitarbeiter[] mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
}
