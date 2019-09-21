package sesti_dan;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Učitati radijus. Ako je veći od 5 izračunati obim kruga inače izračunati površinu kruga
		Scanner sc= new Scanner (System.in);
		System.out.println("Uneti r ");
		double r=sc.nextDouble();
		double P, o;
		if(r>=5) {
			o=2*4*3.14;
			System.out.println("Obim kruga je " +o);
		}else if (r<=0) {
			System.out.println("Pogresan unos!");
		}else {
			P=r*r*3.14;
			System.out.println("Povrsina kruga je " +P);
		}
	}

}
