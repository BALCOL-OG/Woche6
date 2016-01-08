package Aufgabe2;

import java.util.Scanner;

public class testetestetest {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		BuchRegister [] buchVerz = new BuchRegister[100];
		
		for (int count = 0; count<buchVerz.length;count++){
			buchVerz[count] = new BuchRegister("00","00","00", 00, "00");
		}
		
		buchVerz[0].buch = new Buch("A1", "Ding Dong", "LongDong");
		buchVerz[1].buch = new Buch("B1", "Sweet Baby Jesus", "LongDong");
		buchVerz[2].buch = new Buch("C1", "Bitte Funktionier", "LongDong");
		buchVerz[3].buch = new Buch("D1", "Bitte", "LongDong");
		buchVerz[4].buch = new Buch("E1", "Bitte", "LongDong");
		buchVerz[5].buch = new Buch("E1", "Bitte", "LongDong");
		buchVerz[6].buch = new Buch("E5", "Ding Dong", "LongDong");
				
		String cont  = "j";
		String weiter= "j";
		

		
		while(cont.equals(weiter)){
			menu(buchVerz);
			System.out.println("continue? j/n...");
			
			
			cont = scanner.next();
			
			
		}
		scanner.close();
		
		System.out.println("Beendet.");
		
	}
	
	public static void menu(BuchRegister[] buchVerz){
		
		
		int auswahl = 0;
	
		
		
		
			
		System.out.println("Bitte Operation auswaehlen...\n"
							+ "1. Suchen\n"
							+ "2. Neu aufnehmen\n"
							+ "3. Buch als verliehen kennzeichnen\n"
							+ "4. \n"
							+ "5. Anzahl der Buecher ausgeben \n"
							+ "6. Alle Buecher auflisten");
		
	
		
			auswahl = scanner.nextInt();
			scanner.nextLine();
		
		
		
		switch (auswahl){
				case 1:
					System.out.println("Buch suchen:");
					buchSuchen(buchVerz);
					
					break;
					
				case 2:
					buchAufnehmen(buchVerz);	
					break;
					
				case 3:
					verleihKennzeichnen(buchVerz);
					break;
					
				case 4:
					break;
					
				case 5:
					anzahlBuecher(buchVerz);
					break;
					
				case 6:
					for(int i=0;i<buchVerz.length;i++){
						if(buchVerz[i].buch.titel=="00"){
							break;
						}
						else{
							buchAnzeigen(buchVerz[i].buch);
						}
					}
					break;
											
				default:
					
					break;
			
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
	
		public static void buchSuchen(BuchRegister[] testVerz){

			
			String eingabe2 = scanner.nextLine();
			
			for (int i = 0; i<testVerz.length; i++)
			{
			eingabe2=eingabe2.trim();
			if (eingabe2.equalsIgnoreCase(testVerz[i].buch.titel.trim())){
				System.out.println(testVerz[i].buch.standNr);
			}
			
		}
		
}

		
		public static void buchAufnehmen(BuchRegister[]buchVerz){
			String leer = "00";
			int buchCount=0;
			for (int counter=0; counter<buchVerz.length; counter++){
				
				if(leer.equals(buchVerz[counter].buch.titel)){
					
					System.out.println("Bitte Stand Nummer eingeben");
					String standNr = scanner.nextLine();
					System.out.println("Bitte Buchtitel eingeben:");
					String titel = scanner.nextLine();
					
					for(int i=0;i<buchVerz.length;i++){
						if (buchVerz[i].buch.titel.equals(titel)){
							buchCount++;
							if (buchCount==3){
								System.err.println("Zu viele Buecher pro Titel");
							}
						}
					}
					
					System.out.println("Bitte Verfasser eingeben:");
					String verfasser = scanner.nextLine();
					
					buchVerz[counter].buch=new Buch(standNr,titel,verfasser);
					counter=buchVerz.length;
				}
			
			
			}
		}
		
		
		public static void verleihKennzeichnen(BuchRegister[] buchVerz){
			
			
			System.out.println("Bitte BuchNummer eingeben (startet bei 0)...");
			int num = scanner.nextInt();
			
			System.out.println("Bitte Rueckgabe Monat eingeben...");
			String monat=scanner.next();
			
			System.out.println("Bitte Tag (als Zahl) eingeben...");
			int tag=scanner.nextInt();
			

			
			String kontrolle = buchVerz[num].buch.titel;
			int buchCount = 0;
			int verleihCount = 0;
			
			for(int i=0;i<buchVerz.length;i++){
				if (buchVerz[i].buch.titel.equals(kontrolle)){
					buchCount++;
					if(buchVerz[i].rueckGabe.monat != "00"){
						verleihCount++;
					}
				}
			}
			
			buchCount = buchCount - verleihCount;
			if (buchCount <=1 || kontrolle.equals("00") ){
				System.err.println("Kann nicht verliehen werden.");
			}
			else{
				buchVerz[num].rueckGabe.tag=tag;
				buchVerz[num].rueckGabe.monat=monat;
				System.out.println(buchVerz[num].buch.titel+" --- Rueckgabe am "+tag+". "+monat);
			}
			
			
		}
		
		
		
		public static void buchAnzeigen(Buch buch){
			System.out.println(buch.standNr +" "+buch.titel+" "+buch.verfasser);		
		}
		
		public static void anzahlBuecher(BuchRegister[] buchVerz){
			int buchZahl = 0;
			for(int i=0;i<buchVerz.length;i++){
				if (buchVerz[i].buch.titel != "00"){
					buchZahl++;
				}
			}
			System.out.println("Anzahl der Buecher: "+buchZahl);
		}
		
		
	
}
