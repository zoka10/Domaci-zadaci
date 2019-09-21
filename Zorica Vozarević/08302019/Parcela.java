package domaci0830;

public abstract class Parcela {
	/*
	 * Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu povrsinu(u kvadratnim metrima) prilikom kreiranja. 
	 * Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char). 
	 * Moze da joj se odredi prinos u periodu zadatom brojem godina. 
	 * Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRSINA].
	 */
private static int Uid=0;
private int id;
public int povrsina;
public int godina;

public Parcela(int povrsina, int godina) {
	super();
	id = ++Uid;
	this.povrsina = povrsina;
	this.godina=godina;
}
public int getId() {
	return id;
}
public static int getUid() {
	return Uid;
}
public int getGodina() {
	return godina;
}
public int getPovrsina() {
	return povrsina;
}
public abstract char getOznaka();
public abstract int getPrinos();
@Override
public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append(getOznaka()).append("-").append(getId()).append("[").append(getPovrsina()).append("]");
	return sb.toString();
}
}
