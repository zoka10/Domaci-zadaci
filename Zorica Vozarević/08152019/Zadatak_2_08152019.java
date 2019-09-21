package peti_dan;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Uneti zeljeni niz ");
		int f=sc.nextInt();
		int f1=0;
		int f2=1;
		int i, sum;
		System.out.println("Fibonacijev niz je " +f);
		for(i=1; i<=f; ++i) {
			sum=f1+f2;
			f1=f2;
			f2=sum;
			System.out.println(f1 +" ");
		}

	}

}
