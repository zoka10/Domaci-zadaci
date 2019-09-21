package treci_dan;

import java.util.Scanner;

public class Zadatak_2_08122019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Uneti broj n ");
			int n=sc.nextInt();
			int i=1;
			int sum=0;
			int p=1;
			while(i<=n) {
			if(i%2==0) {
				sum+=1;
			}else{
				p*=1;
			}
			i++;
		}
			System.out.println("Proizvoda neparnih brojeva je "+p);
			System.out.println("Zbir paranih brojeva je " +sum);
		}
	}
