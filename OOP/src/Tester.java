
public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Kruznica k1;
		
		//inicializacia objektu v pamati
		k1 = new Kruznica();
		
		Kruznica k2 = new Kruznica();
		
		k1.x = 1;
		k1.y = 1;
		k1.polomer = 10;
		
		k2.x = 5;
		k2.y = 5;
		k2.polomer = 100;
		
		//System.out.println("Polomer kruznice k1 je " + k1.polomer);
		
		//k1.vypisInfo();
		//k2.vypisInfo();
		
		//System.out.println("Obsah k1: " + k1.obsah());
		
		k1.kompletInfo();
		k2.kompletInfo();
		
		

	}

}
