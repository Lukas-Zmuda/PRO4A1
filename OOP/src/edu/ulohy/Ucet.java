package edu.ulohy;

public class Ucet {
	
	//modifikatory pristupu
	//public, private, ziaden, protected
	
	private String id;
	private String nazov;
	private int zostatok;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public int getZostatok() {
		return zostatok;
	}

	
	public Ucet(String id, String nazov, int zostatok) {
		this.id = id;
		this.nazov = nazov;
		this.zostatok = zostatok;
	}

	public double credit (int  vklad) {
		zostatok = zostatok + vklad;
		return zostatok;
	}
	
	public int vklad(int suma) {
		if(suma > 0) {
			zostatok += suma;
		}
		return zostatok;
	}
	
	public int vyber(int suma) {
		if(suma > 0) {
			if(suma <= zostatok) {
				zostatok -= suma;
			}else {
				System.out.println("Nemas peniaze na ucte!");
			}
		}
		return zostatok;
	}
	
	public String toString() {
		return "Ucet[id=" + id + ",nazov=" + nazov + ",zostatok=" + zostatok;
	}
}
