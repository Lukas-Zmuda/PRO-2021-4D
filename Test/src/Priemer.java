import java.util.Scanner;

public class Priemer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double suma = 0;
		int pocet = 0;
		int cislo = 0;
//		System.out.println("Zadaj cislo");
//		int cislo = sc.nextInt();
//		while(cislo != 0) {
//			suma += cislo;
//			pocet++;
//			System.out.println("Zadaj cislo");
//			cislo = sc.nextInt();
//		}
		
		do {
			System.out.println("Zadaj cislo");
			cislo = sc.nextInt();
			suma += cislo;
			pocet++;
		}while(cislo != 0);
		
		if (pocet == 0) {
			pocet--;
			System.out.println("Nezadal si ziadne cislo");
		}else {
			pocet--;
			System.out.println("Priemer: " + (suma / pocet));
		}

	}

}
