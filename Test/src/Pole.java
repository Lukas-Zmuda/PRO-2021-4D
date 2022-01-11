
public class Pole {

	public static void main(String[] args) {
		
		//vytvorenie pola vymenovanim prvkov
		String[] mena4D = {"Matus", "Tomas", "Samo", "Matus", "Viktor",
				"Nandy", "Marek"};
		
		System.out.println("Treti v poradi je " + mena4D[2] + ".");
		
		//vytvorenie prazdneho pola
		String[] mena4DLavaStrana = new String[4];
		
		mena4DLavaStrana[3] = "Nikola";
		mena4DLavaStrana[0] = "Mate";
		mena4DLavaStrana[1] = "David";
		mena4DLavaStrana[2] = "Patrik";
		
		System.out.println(mena4D);
		
		System.out.println("Zoznam 4D:");
		System.out.println("Pocet ziakov: " + mena4D.length);
		for(int i = 0; i < mena4D.length; i++) {
			System.out.println(mena4D[i]);
		}
		
		System.out.println("------------");
		System.out.println("Druha strana:");
		for(String meno: mena4DLavaStrana) {
			System.out.println(meno);
		}

		System.out.println("Posledny v zozname: " + mena4DLavaStrana[mena4DLavaStrana.length - 1]);
		
		String meno = "Lukas";
		
		String meno2 = new String("Lukas");
		
		
		String meno3 = "Lukas";
		String meno4 = new String("Lukas");
		
	}

}
