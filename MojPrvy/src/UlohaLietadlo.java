import java.util.Scanner;

public class UlohaLietadlo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double zrychlenie = 0, rychlost = 0;
		System.out.println("Zadaj zrychlenie lietadla:");
		zrychlenie = sc.nextDouble();
		System.out.println("Zadaj vzletovu rychlost: ");
		rychlost = sc.nextDouble();
		
		double dlzka = (zrychlenie * zrychlenie) / (2 * rychlost);
		System.out.println("Lietadlo potrebuje runway s dlzkou " + dlzka + " m.");

	}

}
