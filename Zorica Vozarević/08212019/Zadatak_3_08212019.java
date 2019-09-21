package osmi_dan;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi duzinu niza");
		int n = sc.nextInt();
		int[] niz = new int[n];
		boolean rastuci=true;
		System.out.print("Unesi elemente " );
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
	}
		for (int j = 0; j < niz.length-1; j++) {
			if (niz[j]>niz[j+1]) {
				rastuci=false;
				break;
			}
		}
		if(rastuci) {
				System.out.println("Niz je rastuci.");
			}else {
				System.out.println("Niz nije rastuci.");
			
		}
}
}