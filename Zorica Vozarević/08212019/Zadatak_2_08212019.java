package osmi_dan;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi duzinu niza");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.print("Unesi elemente " );
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
	}
	
		for (int i = n-1; 0 <=i; i--) {
			System.out.print(niz[i]+" " );
			
			}
		}
}