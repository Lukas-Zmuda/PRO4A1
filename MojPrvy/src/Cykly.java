
public class Cykly {

	public static void main(String[] args) {
		
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");

		for(int i = 0; i < 5;i++) {
			System.out.println((i + 1) + ". Ahoj");
		}
		
		//0, 2, 4, 6, 8, 10
		for(int i = 0; i < 11; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		//10, 9, 8, 7, ..., 0
		for(int i = 10; i >= 0; i--) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		//10:0, 9:1, 8:2, ..., 0:10
		for(int i = 10, j = 0; j < 11; i--, j++) {
			System.out.print(i + ":" + j + ", ");
		}
		System.out.println();
		int k = 0;
		while(k < 5) {
			System.out.print("*");
			k++;
		}
		
		System.out.println();
		k = 10;
		do {
			System.out.print("/");
			k++;
		}while(k < 5);
		
		
		
		
		
		
		
		
	}

}
