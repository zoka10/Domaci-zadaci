package osmi_dan;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu niza");
		int n = sc.nextInt();
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi elemente " + i);
			niz[i] = sc.nextInt();
		}
		int sum=0;
		System.out.println("Unesi broj sa kojim se deli ");
		int br = sc.nextInt();
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				sum+=i;
				System.out.println("Brojevi koji su deljivi "+niz[i]);
				
			}
			}
			}
			}