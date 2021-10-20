import java.util.Scanner;

public class ZadanieUrok {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		System.out.println("Suma: ");
		suma = sc.nextInt();
		double vysledok = 0;
		double urok = 0;
		System.out.println("Urok: ");
		urok = sc.nextDouble();
		int pocetRokov = 0;
		System.out.println("Pocet rokov:");
		pocetRokov = sc.nextInt();
		
		//vysledok = suma * Math.pow((1 + (urok / 100) / 12),  pocetRokov * 12);
		vysledok = suma * ((1 + (urok / 100 * pocetRokov)));
		System.out.println("Vysledok: " + vysledok);
		
	}

}
