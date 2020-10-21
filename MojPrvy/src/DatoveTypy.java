
public class DatoveTypy {

	public static void main(String[] args) {
		System.out.println("Ahoj");
		
		System.out.println(10 * 4);
		System.out.println("10 * 4");
		
		int cislo;
		cislo = 12;
		
		int a = 10;
		int b = 100, c = 12;
		
		// int public; toto nefunguje
		
		//int 1den; toto nefunguje
		int den1 = 1;
		System.out.println(den1);
		System.out.println("den1 = " + den1);
		System.out.println("5" + "10");
		System.out.println("Lukas" + "Zmuda");
		System.out.println(5 + 10);
		System.out.println("10 + 5 = " + (10 + 5));
		
		/*
		 * viacriadkovy komentar
		 * 
		 */
		
		byte bb = 10;
		
		int bbb = bb;
		
		int x = 1;
		byte xx = (byte)x;
		
		x = 123456;
		
		//desatinne cisla
		float f = 12.36f;
		System.out.println("f = " + f);
		double d = 12.9999;
		
		System.out.println("d = " + d);
		int dd = (int)d;
		System.out.println("dd = " + dd);
		
		d = dd;
		
		//znaky
		char zavinac = '@';
		
		zavinac = 64;
		System.out.println("l.zmuda" + zavinac + "ostrovskeho.com");
		
		char unicode = '\u0123';
		System.out.println(unicode);
		
		//log. hodnoty
		boolean prsi = false;
		prsi = true;
		
		System.out.println(prsi);
		
		//retazce
		String celeMeno = "";
		String meno = "Lukas", priezvisko = "Zmuda";
		celeMeno = meno + " " + priezvisko;
		System.out.println(celeMeno);
	}
}