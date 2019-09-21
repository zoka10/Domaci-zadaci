package domaci0830;

public class Suma extends Parcela {
private int povrsina_stabla;
private int sazrevanje;
private int prinos_stabla;
	public Suma(int povrsina, int godina, int povrsina_stabla, int prinos_stabla, int sazrevanje) {
		super(povrsina, godina);
		this.povrsina_stabla=povrsina_stabla;
		this.sazrevanje=sazrevanje;
		this.prinos_stabla=prinos_stabla;

	}

	@Override
	public char getOznaka() {
		return 'S';
	}

	@Override
	public int getPrinos() {
		int formula=povrsina/povrsina_stabla*prinos_stabla*(godina/sazrevanje);
		return formula;
	}
	@Override
	public String toString() {
		return super.toString()+getPrinos();
}
}
