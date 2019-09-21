package deseti_dan;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi realne brojeve ");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		if (c>b) {
			System.out.println("Unesi poslednji broj ponovo!");
			c=sc.nextInt();
		}
		deljivo(a,b,c);
}
public static void deljivo(int a, int b, int c) {
	int n=b-a+1;
	int[] niz = new int[n];
	int j=0;
	for (int i=a; i<=b; i++) {
		if (i%c==0) {
			niz[j]=i; 
			j++;
		}
		}
	for (int i=0; i<j; i++) {
		System.out.print(niz[i]+ " ");
	}
}
}
