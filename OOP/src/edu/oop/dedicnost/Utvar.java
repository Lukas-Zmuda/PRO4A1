package edu.oop.dedicnost;

public class Utvar {
	
	double x, y;
	
	Utvar(){
		x = 0;
		y = 0;
	}

	public Utvar(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void nakresli() {
		System.out.println("Kreslim utvar na suradniciach[" + this.x + ", " + this.y + "]");
	}
	

}
