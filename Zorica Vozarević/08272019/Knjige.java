package domaci0827;

public class Knjige {
	/*
	 * Napisati klasu Knjige koja ima sledeca polja: naziv knjige, autora, broj
	 * strana, godinu izdanja. Sva polja mogu da se dohvate, a godina izdanja moze i
	 * da se postavi. Napisati glavni program koji kreira tri knjige i ispisuje sve
	 * njihove podatke.
	 */
	public String nazivknjige;
	public String autor;
	public String brojstrana;
	public int godinaizdanja;
	public Knjige(String nazivknjige, String autor, String brojstrana) {
		this.nazivknjige = nazivknjige;
		this.autor = autor;
		this.brojstrana = brojstrana;
		godinaizdanja = 0;
	}
	public int getGodinaizdanja() {
		return godinaizdanja;
	}
	public void setGodinaizdanja(int godinaizdanja) {
		this.godinaizdanja = godinaizdanja;
	}
	public String getNazivknjige() {
		return nazivknjige;
	}
	public String getAutor() {
		return autor;
	}
	public String getBrojstrana() {
		return brojstrana;
	}
	
}
