package edu.ulohy;

public class Tester {

	public static void main(String[] args) {
		Ucet u = new Ucet("1","Moj mocny ucet",500);
		
		
		System.out.println(u.vyber(300));
		System.out.println(u.vklad(1000));
		System.out.println(u.credit(1000));
		System.out.println(u.getZostatok());
		
		//u.zostatok = -10000;
		System.out.println(u.getZostatok());

	}

}
