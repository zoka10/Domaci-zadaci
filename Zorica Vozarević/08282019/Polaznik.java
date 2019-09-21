package ucionica;

/*Polaznik  ima ime i prezime 
 * koje se zadaje prilikom kreiranja polaznika. 
 * Polaznik poseduje i identifikacioni broj  
 * koji se moze dohvatiti. 
 * Ime i prezime polaznika se moze dohvatiti 
 * ali ne i postaviti. 
 * Vozac se ispisuje u obliku: IME_PREZIME{ID}.
 */
public class Polaznik {
	private String ime, prezime;
	private static int idbroj = 0;
	private int idbr;

	public Polaznik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		idbr = ++idbroj;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public static int getIdbroj() {
		return idbroj;
	}

	public int getIdbr() {
		return idbr;
	}

	public String ispis() {
		return ime + "_" + prezime + "{" + idbr + "}";
	}
}