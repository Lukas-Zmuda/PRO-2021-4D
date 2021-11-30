
public class Metody {

	public static void main(String[] args) {
		System.out.println("Zoznam ziakov:");
		vlozCiaru(10);
		System.out.println("Fero");
		System.out.println("Ivan");
		vlozCiaru('*', 16);
		System.out.println("Pocet ziakov:" + vynasob(1, 2.56));
	}
	
	//metody bez navratovej hodnoty
	static void vlozCiaru() {
		System.out.println("_________________");
	}
	
	static void vlozCiaru(int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print('_');
		}
		System.out.println();
	}
	
	static void vlozCiaru(char znak, int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	//metody s navratovou hodnotou
	
	static int vynasob(int a, int b) {
		int c = a * b;
		return c;
	}
	
	static double vynasob(double a, double b) {
		return a * b;
	}



}
