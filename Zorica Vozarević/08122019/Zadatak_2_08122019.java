package treci_dan;

import java.util.Scanner;

public class Zadatak_2_08122019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Uneti broj n ");
		int n=sc.nextInt();
		int i=1;
		int s=0;
		int p=1;
		while(i<=n) {
		if(i%2==0) {
			System.out.println("Zbir parnih brojeva je " +s);
			s+=1;
		}else if(i%2==1){
			System.out.println("Zbir proizvoda brojeva je "+p);
			p*=1;
			i+=i;
		}
	}
	}
}
