package edu.oop.dedicnost;

public class Kruh extends Utvar{

	double polomer;
	
	Kruh(){
		this.polomer = 0;
	}

	public Kruh(double priemer) {
		super();
		this.polomer = priemer;
	}
	
	public Kruh(double x, double y, double priemer) {
		super(x, y);
		this.polomer = priemer;
	}
	
	public double obvod() {
		return 2 * Math.PI * this.polomer;
	}
	
	public double obsah() {
		return Math.PI * this.polomer * this.polomer;
	}

	@Override
	public void nakresli() {
		System.out.println("Kreslim kruh na suradniciach[" + this.x + ", " + this.y + "]r = " + this.polomer);
	}
	
	
	
		
}
