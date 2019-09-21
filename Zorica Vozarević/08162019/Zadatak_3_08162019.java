package sesti_dan;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// Naći sumu brojeva u intervalu od 1 do n djeljivih sa 5
		System.out.println("Upisi n ");
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt(), i;
		int sum=0;
		for (i=1; i<=n; i++) {
			if(i%5==0) {
				sum+=i;
				System.out.println(sum); 
		}
			
	}
	}
}
