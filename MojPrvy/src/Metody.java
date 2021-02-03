import java.util.Scanner;

public class Metody {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		pozdravSa();
		System.out.println("------");
		//pozdravSa();
		pozdrav("Fero");
		kresliCiaru("+", 10);
		
		System.out.println(naDruhu(13));
		//int vstup = sc.nextInt();
		//int x = naDruhu(sc.nextInt());
		
		//System.out.println(x);
		
		System.out.println(mocnina(5, 12));
		
		int[] pole = vytvorPole(10, -78);
		vypisPole(pole);
		
		System.out.println(Math.pow(100, 0.5));
		System.out.println(Math.sqrt(100));
	}
	
	//metody bez navratoveho typu
	static void pozdravSa() {
		System.out.println("Ahoj. Tu je tvoj pocitac!");
	}
	
	static void pozdrav(String meno) {
		kresliCiaru("*", 20);
		System.out.println("Ahoj " + meno + "!");
		kresliCiaru("*", 20);
	}
	
	static void kresliCiaru(String znak, int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vypisPole(int[] pole) {
		for(int cislo: pole) {
			System.out.print(cislo + ", ");
		}
		System.out.println();
	}
	//metody s navratovym typom
	
	static int naDruhu(int cislo) {
		int vysledok = 0;
		vysledok = cislo * cislo;
		return vysledok;
	}
	
	static int mocnina(int zaklad, int exponent) {
		int vysledok = 1;
		for(int i = 0; i< exponent; i++) {
			vysledok *= zaklad;
		}
		return vysledok;
	}
	
	static int[] vytvorPole(int dlzka, int hodnota) {
		int[] pole = new int[dlzka];
		for(int i = 0; i < pole.length; i++) {
			pole[i] = hodnota;
		}
		return pole;
	}

}
