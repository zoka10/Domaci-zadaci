package domaci0830;

public class Njiva extends Parcela {
	public int prinosPoKvM;
	public Njiva(int povrsina, int godina, int prinosPoKvM) {
		super(povrsina, godina);
this.prinosPoKvM=prinosPoKvM;

	}

	@Override
	public char getOznaka() {
		return 'N';
	}

	@Override
	public int getPrinos() {
		int formula=povrsina*prinosPoKvM;
		return formula;
	}
	@Override
	public String toString() {
		return super.toString()+":"+getPrinos();
}
}
