package peti_dan;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s;
		double a, b, c, r, h, p;
		do {
			System.out.println("Izracunaj povrsinu odabrane figure ");
			System.out.println("0 - Izlaz");
			System.out.println("1 - kocka");
			System.out.println("2 - kvadar");
			System.out.println("3 - valjak");
			System.out.println("4 - lopta");
			s = sc.nextInt();
			switch (s) {
			case 1:
				System.out.println("Unesi stranicu kocke ");
				a = sc.nextDouble();
				p = 6 * a * a;
				System.out.println("P=" + p);
				break;
			case 2:
				System.out.println("Unesi stranice kvadra ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				p = 2 * a * b + 2 * a * c + 2 * b * c;
				System.out.println("P=" + p);
				break;
			case 3:
				System.out.println("Unesi poluprecnik i visinu valjka ");
				r = sc.nextDouble();
				h = sc.nextDouble();
				p = 2 * r * r * 3.14 + 2 * r * h * 3.14;
				System.out.println("P=" + p);
				break;
			case 4:
				System.out.println("Unesi poluprecnik lopte ");
				r = sc.nextDouble();
				p = 4 * r * r * 3.14;
				System.out.println("P=" + p);
				break;
			default:
				System.out.println("Los unos!");

				break;
			case 0:
				System.out.println("Izlaz");
				break;
			}
		} while (s != 0);

	}

}
