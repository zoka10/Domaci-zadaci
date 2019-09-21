package deseti_dan;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi cele brojeve ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		Ucitajniz(niz);
		proizvod(niz);
		zbir(niz);
		System.out.println("Proizvod elemenata na neparnim pozicijama je "+ proizvod(niz));
		System.out.println("Zbir parnih elemenata niza "+ zbir(niz));
	}
	public static void Ucitajniz(int[]niz) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Unesi niz " +niz.length+" elementa ");
	for (int i = 0; i < niz.length; i++) {
		niz[i]=sc.nextInt();
	}
	}
	public static int proizvod(int[]niz) {
	int p=1;
	for (int i =0; i<niz.length; i++) {
		if (i%2!=0){
		p*=niz[i];
		}
	}	
	return p;
	}
	
	public static int zbir(int[]niz) {
		int sum=0;
		for (int i = 0; i < niz.length; i++) {
			if(niz[i]%2==0) {
				sum+=niz[i];
			}
			}
		return sum;
	}
	}