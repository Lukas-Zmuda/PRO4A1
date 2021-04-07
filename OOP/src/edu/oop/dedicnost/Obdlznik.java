package edu.oop.dedicnost;

public class Obdlznik extends Utvar{
	
	double d, s;

	public Obdlznik(double d, double s) {
		super();
		this.d = d;
		this.s = s;
	}

	public Obdlznik(double x, double y, double d, double s) {
		super(x, y);
		this.d = d;
		this.s = s;
	}

	public double obvod() {
		return 2 * (d + s);
	}
	
	public double obsah() {
		return d * s;
	}
	@Override
	public void nakresli() {
		System.out.println("Kreslim obdlznik na suradniciach[" + this.x + ", " + this.y + "]d = " + this.d + ", s = " + this.s);
	}

	

	

	
	

}
