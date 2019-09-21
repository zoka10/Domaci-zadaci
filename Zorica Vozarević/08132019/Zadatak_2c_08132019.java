package cetvrti_dan;

import java.util.Scanner;

public class Zadatak_2c_08132019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unesi broj k ");
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println("Unesi broj n");
		int n=sc.nextInt();
		int sum=0;
		while(k<n) {
			sum+=k;
			k+=1;
		}
		
		System.out.println("Zbir je " +sum);
	}

}
