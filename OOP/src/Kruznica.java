class Kruznica {
	
	//instancne premenne (fields)
	double x;
	double y;
	double polomer;
	
	//metody
	
	void vypisInfo() {
		System.out.println("Kruznica so stredom[" + x + ", " + y + "] r = " + polomer);
	}
	
	double obvod() {
		return 2 * Math.PI * polomer;
	}
	
	double obsah() {
		return Math.PI * polomer * polomer;
	}
	
	void kompletInfo() {
		vypisInfo();
		System.out.println("Obsah: " + obsah() + " cm");
		System.out.println("Obvod: " + obvod() + " cm");
	}
	
	public String toString() {
		return "Kruznica so stredom[" + x + ", " + y + "] r = " + polomer;
	}
}
