package edu.oop.dedicnost;

public class Tester {

	public static void main(String[] args) {
		
		Kruh k = new Kruh();
		//k.nakresli();
		
		k.polomer = 12;
		//System.out.println(k.obsah());
		//k.nakresli();
		
		Obdlznik o = new Obdlznik(10, 20);
		
		Utvar ob = new Obdlznik(100, 200);
		
		//ob.nakresli();
		
		Utvar[] utvary = new Utvar[3];
		utvary[0] = k;
		utvary[1] = o;
		utvary[2] = ob;
		
		for(Utvar uu: utvary) {
			if(uu instanceof Kruh) {
				System.out.println("K:");
			}else if(uu instanceof Obdlznik){
				System.out.println("O:");
			}
			uu.nakresli();
		}

	}

}
