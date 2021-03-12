package edu.oop.auto;

public class Auto {
	
	String znacka;
	String model;
	double maxRychlost;
	double spotreba;
	int pocetNajazdenychKm;
	double aktualnaRychlost;
	
	void info() {
		System.out.println("Znacka: " + znacka);
		System.out.println("Model: " + model);
		System.out.println("Max. rychlost: " + maxRychlost);
		System.out.println("Spotreba: " + spotreba);
		System.out.println("Pocet najazdenych km:" + pocetNajazdenychKm);
		System.out.println("Aktualna rychlost:" + aktualnaRychlost);
	}
	
	void zrychli(double novaRychlost) {
		if(novaRychlost + aktualnaRychlost > maxRychlost) {
			System.out.println("Chces prekrocit max rychlost!!!");
		}else {
			aktualnaRychlost = novaRychlost;
		}
	}
	
	double jazda(int pocetKm) {
		pocetKm += pocetKm;
		//podla Forgaca
		return pocetKm / spotreba;
	}
}