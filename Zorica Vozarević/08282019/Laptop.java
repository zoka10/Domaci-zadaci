package ucionica;

public class Laptop {
/*
 * Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. 
 * Marka moze samo da se dohvati. Laptop takdje moze da menja polaznika ili da ostane bez polaznika. 
 * Moze da se ispise u obliku: MARKA{POLAZNIK}
 */
	private String marka;
	private Polaznik polaznik;
	public Laptop(String marka) {
		this.marka = marka;
		polaznik = null;
	}
	public String getMarka() {
		return marka;
	}
	public void menjajPolaznik() {
		polaznik=null;
	}
	public String ispis() {
		String s;
		if (polaznik == null) {
			s = "Nema polaznika";
		} else {
			s = polaznik.ispis();
		}
		return marka + "{"+polaznik +"}" + s;
	}
}
