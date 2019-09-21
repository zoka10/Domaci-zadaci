package cetvrti_dan;

import java.util.Scanner;

public class Zadatak_2b_08132019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unesi broj n ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int br=1;
		int sum=0;
		while(br<=n) {
			sum+=br;
			br+=1;
		}
		
		System.out.println("Zbir je " +sum);
	}

}
