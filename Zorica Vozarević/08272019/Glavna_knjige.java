package domaci0827;

public class Glavna_knjige {

	public static void main(String[] args) {
		Knjige a = new Knjige ("Ana Karenjina","Lav Tolstoj", "864");
		Knjige a1 = new Knjige ("Rat i mir","Lav Tolstoj", "1225");
		Knjige a2 = new Knjige ("Zlocin i kazna","Fjodor Dostojevski", "638");
		a.setGodinaizdanja(1877);
		a1.setGodinaizdanja(1869);
		a2.setGodinaizdanja(1866);
		System.out.println(a.getNazivknjige()+" "+a.getAutor()+" "+a.getGodinaizdanja()+" "+a.getBrojstrana());
		System.out.println(a1.getNazivknjige()+" "+a1.getAutor()+" "+a1.getGodinaizdanja()+" "+a1.getBrojstrana());
		System.out.println(a2.getNazivknjige()+" "+a2.getAutor()+" "+a2.getGodinaizdanja()+" "+a2.getBrojstrana());
	}
	
}
