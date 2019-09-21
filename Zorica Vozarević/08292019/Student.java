package domaci0829;

public class Student extends Covek {
	/*Student je covek
	 * koji se kreira sa brojem indeksa i ima  
	 * trenutnu godinu studija i trenutni prosek. 
	 * Sva polja mogu samo da se dohvate. 
	 * Studenta ispisati u formatu: Ime_Prezime[godina rodjenja] je 
	 * student ___ (god studija) godine studija sa prosekom____ 
	 * (trenutni prosek).
	 */
	public int brojindex;
	public int godinastudija;
	public double prosek;
	public Student(String ime, String prezime, int godinarodjenja, int brojindex, int godinastudija, double prosek) {
		super(ime, prezime, godinarodjenja);
		this.godinastudija=godinastudija;
		this.brojindex=brojindex;
		this.prosek=prosek;
	}
	public int getBrojindex() {
		return brojindex;
	}
	public int getGodinastudija() {
		return godinastudija;
	}
	public double getProsek() {
		return prosek;
	}
	public String ispis() {
		StringBuilder sb=new StringBuilder();
		sb.append(getIme()+"_"+getPrezime()+" ["+getGodinarodjenja()+"] "+"je student "+getGodinastudija()+" godine studija sa prosekom "+getProsek());
		return sb.toString();
	}
}
