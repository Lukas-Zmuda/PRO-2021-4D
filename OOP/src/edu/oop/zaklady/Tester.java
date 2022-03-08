package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Student s1;
		
		//inicializacia objektu v pamati
		s1 = new Student();
		
		Student s2 = new Student();
		
		s1.meno = "Fero";
		s1.priezvisko = "Mravec";
		s1.vek = 16;
		s1.pohlavie = 'm';
		
		s2.meno = "Jan";
		s2.priezvisko = "Hrach";
		s2.vek = 44;
		s2.pohlavie = 'm';
		
		s1.vekInfo();
		s2.vekInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
