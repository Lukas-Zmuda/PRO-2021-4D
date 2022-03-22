package edu.oop.zaklady;

public class Student {
	
	//instancne premenne
	//vlastnosti
	String meno;
	String priezvisko;
	int vek;
	char pohlavie;
	
	//konstruktor
	Student(){
		meno = "nezname";
		priezvisko = "nezname";
		vek = 6;
		pohlavie = 'n';
		System.out.println("Volany prazdny konstruktor");
	}
	
	
	
	Student(String meno, String priezvisko, int vek, char pohlavie) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
		this.pohlavie = pohlavie;
	}



	//metody
	//schopnosti objektu
	void vekInfo() {
		System.out.println(meno + " ma " + vek + " rokov.");
	}
	
	void vypisInfo() {
		System.out.println("Meno: " + meno);
		System.out.println("Priezvisko: " + priezvisko);
		System.out.println("Vek: " + vek);
		System.out.println("Pohlavie: " + pohlavie);
		
	}

}
