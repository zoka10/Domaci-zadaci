package sesti_dan;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		// Napisati program za ispis proizvoda (faktorijele) brojeva od 1 do n
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int i=1;
		int P=1;
		while (i<=n) {
			P*=i;
			System.out.println(P);
			i++;
		}

	}

}
