
public class Pole {

	public static void main(String[] args) {
		
		//deklaracia pola
		int[] cisla;
		
		//inicializacia pola
		cisla = new int[7];
		
		cisla[0] = 77;
		cisla[1] = cisla[0] - 10;
		cisla[2] = 10 * cisla[1];
		
		for(int i = 0; i < 7; i++) {
			System.out.print(cisla[i] + ", ");
		}
		
		String[] mena = {"Peter", "Matus", "Marek", "Jan", "Ivana"};
		System.out.println("\nPrvy v zozname je " + mena[0]);
		
		System.out.println("Pocet mien v zozname: " + mena.length);
		int[] vyska = {169, 180, 178, 159, 169};
		
		System.out.println("Zoznam mien:");
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i] + ": " + vyska[i] + " cm");
		}
		
		for(String m: mena) {
			System.out.print(m + ", ");
		}
		
		double suma = 0;
		for(int i = 0; i < vyska.length; i++) {
			suma += vyska[i];
		}
		
		System.out.println("\nPriemerna vyska: " + suma / vyska.length);
 
	}

}
