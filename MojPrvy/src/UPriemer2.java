import java.util.Scanner;

public class UPriemer2 {

	public static void main(String[] args) {
		// Program vypocita aritmeticky priemer zo zadanych cisel
		// nacita postupnost cisel ukoncenu 0
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("---Program na vypocet aritmetickeho priemeru---");
		int pocet = 0;
		double suma = 0;
		int cislo = 0;
		
		do {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();
			suma = suma + cislo;
			pocet++;
		}while(cislo != 0);
		pocet--;
		
		System.out.println("Priemer: " + (suma / pocet));

	}

}
