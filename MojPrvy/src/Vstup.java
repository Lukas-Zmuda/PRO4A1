import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		String meno = "";
		System.out.println("Zadaj meno: ");
		meno = sc.nextLine();
		
		System.out.println("Ahoj " + meno + "! Ako sa mas?");
		
		int rokNarodenia = 0;
		System.out.println("Zadaj rok narodenia: ");
		rokNarodenia = sc.nextInt();
		System.out.println("Mas " + (2020 - rokNarodenia) + " rokov.");
		

	}

}
