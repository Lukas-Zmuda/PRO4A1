
class Obdlznik {

	double x, y;
	double a, b;
	
	double obvod() {
		return 2 * (a + b);
	}
	
	double obsah() {
		return a * b;
	}
	
	void vypisInfo() {
		System.out.println("Obdlznik na suradnici[" + x + ", " + y + "] a = " + a + ", b = " + b);
	}
	
	void kompletInfo() {
		vypisInfo();
		System.out.println("Obsah: " + obsah() + " cm");
		System.out.println("Obvod: " + obvod() + " cm");
	}
	
	
}
