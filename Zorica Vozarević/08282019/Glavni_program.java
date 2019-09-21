package ucionica;

public class Glavni_program {

	public static void main(String[] args) {
		Polaznik p = new Polaznik ("Zoka", "Zoka");
		Laptop l = new Laptop("hp");
		System.out.println(p.ispis());
		System.out.println(l.ispis());
		l.menjajPolaznik();
		System.out.println(l.ispis());

	}

}
 