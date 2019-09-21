package domaci0829;

public class Covek {
public String ime;
public String prezime;
public int godinarodjenja;
public Covek(String ime, String prezime, int godinarodjenja) {
	super();
	this.ime = ime;
	this.prezime = prezime;
	this.godinarodjenja = godinarodjenja;
}
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	this.ime = ime;
}
public String getPrezime() {
	return prezime;
}
public void setPrezime(String prezime) {
	this.prezime = prezime;
}
public int getGodinarodjenja() {
	return godinarodjenja;
}

public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append(getIme()).append("_").append(getPrezime()).append("[").append(getGodinarodjenja()).append("]");
	return sb.toString();
}
}
