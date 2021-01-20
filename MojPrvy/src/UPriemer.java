import java.util.Scanner;

public class UPriemer {

	public static void main(String[] args) {
		// Program vypocita aritmeticky priemer zo zadanych cisel
		// najprv nacita z kolkych cisel chce pocitat a potom samotne cisla
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("---Program na vypocet aritmetickeho priemeru---");
		System.out.println("Zadaj pocet cisel: ");
		int pocet = sc.nextInt();
		double suma = 0;
		int cislo = 0;
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj " + (i + 1) + ". cislo: ");
			cislo = sc.nextInt();
			suma = suma + cislo;
		}
		
		System.out.println("Priemer: " + (suma / pocet));

	}

}
