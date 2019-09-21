package domaci0829;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
private String titula;
private List<String>predmeti;
	public Profesor(String ime, String prezime, int godinarodjenja, String titula) {
		super(ime, prezime, godinarodjenja);
		this.titula=titula;
		predmeti=new ArrayList<>();
	}
	public String getTitula() {
		return titula;
	}
	public void dodajPredmet(String predmet) {
		predmeti.add(predmet);
	}
public boolean izbaciPredmet(String predmet) {
	return predmeti.remove(predmet);
}
public String getPremet(int i) {
	return predmeti.get(i);
}
public String getPredmet(String predmet) {
	return predmeti.get(predmeti.indexOf(predmet));
}
public boolean hasPredmet(String predmet) {
	return predmeti.contains(predmet);
}
public int countPredmete() {
	return predmeti.size();
}
public String lista() {
	String s="";
	for(String predmet:predmeti) {
		s+=predmet+" ";
	}
	return s;
	}
public String ispisp() {
    return ime + " " + prezime + "[" + godinarodjenja + "]" +" je" + " " + titula + " koji drzi nastavu na: " + lista();
}
}