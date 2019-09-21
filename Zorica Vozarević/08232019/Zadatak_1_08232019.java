package deseti_dan;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Npisi ceo broj ");
		int n=sc.nextInt();
		inv(n);
		System.out.println(inv(n));
	}
	public static int inv (int n) {
		int br =0;
		while(n!=0) {
			int c=n%10;
			br*=10;
			br+=c;
			n/=10;
		}
		return br;
}
}