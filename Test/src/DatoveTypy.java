
public class DatoveTypy {

	public static void main(String[] args) {
		
		//celociselne premenne
		
		//deklaracia premennej
		int cisla;
		
		//inicializacia premennej
		cisla = 10;
		System.out.println(cisla);
		
		System.out.println("cisla = " + cisla);
		
		int a = 10;
		byte b = 102;
		
		int x = 1, y = 2, z = 3;
		
		int bin = 0b10000000;
		System.out.println("bin = " + bin);
		int hex = 0xff;
		System.out.println("hex = " + hex);
		
		int oct = 0123;
		System.out.println("oct" + oct);
		
		byte bb = 12;
		int ii = bb;
		
		bb = (byte)ii;
		
		//desatinne cisla
		float f = 12.3f;
		double dd = 23.5;
		
		//znak
		char zav = '@';
		zav = 64;
		
		System.out.println("zavinac = " + zav);
		
		char uni = '\u0150';
		System.out.println(uni);
		

		//logicke
		boolean prsi = false;
		
	}

}
