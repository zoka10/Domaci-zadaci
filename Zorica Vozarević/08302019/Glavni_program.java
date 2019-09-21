package domaci0830;

import java.util.ArrayList;
import java.util.List;

public class Glavni_program {

	public static void main(String[] args) {
		List<Parcela>parcelasuma;
		List<Parcela>parcelanjiva;
		parcelasuma=new ArrayList<>();
		parcelanjiva=new ArrayList<>();
		Parcela p1= new Suma(100, 10, 1, 2, 5 );
		Parcela p2= new Suma(100, 10, 2, 2, 5 );
		Parcela p3= new Suma(100, 10, 3, 2, 5 );
		Parcela p4= new Njiva(100, 1, 5 );
		Parcela p5= new Njiva(100, 2, 5 );
		Parcela p6= new Njiva(100, 3, 5 );
		parcelasuma.add(p1);
		parcelasuma.add(p2);
		parcelasuma.add(p3);
		System.out.println();
		System.out.println(parcelasuma);
		parcelanjiva.add(p4);
		parcelanjiva.add(p5);
		parcelanjiva.add(p6);
		System.out.println(parcelanjiva);
	}

}
