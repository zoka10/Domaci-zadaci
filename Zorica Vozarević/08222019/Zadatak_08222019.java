package deveti_dan;

import java.util.Scanner;

public class Zadatak_08222019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi realne brojeve ");
		double a =sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		proizvod(a,b,c);
		minimum(a,b,c);
		System.out.println("Proizvod brojeva je " +proizvod(a,b,c));
		System.out.println("Najmanji uneti broj je " + minimum(a,b,c));
	}
	public static double proizvod(double a, double b, double c) {
		return (a*b*c*2);
	}
	public static double minimum(double a, double b, double c) {
		double min=0;
		if (a<b&&a<c) 
			min=a;
	else if
		(b<c&&b<a)
		min=b;
	else if (c<a&&c<b)
			min=c;
		return min;
	}
	}