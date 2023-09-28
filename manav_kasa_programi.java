package manav_kasa_programi;

import java.util.Scanner;

public class manav_kasa_programi {

	public static void main(String[] args) {

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;

		Scanner scan = new Scanner(System.in);

		System.out.print("Armut kaç kilo: ");
		double a = scan.nextDouble();
		armut = armut * a;

		System.out.print("Elma kaç kilo: ");
		double e = scan.nextDouble();
		elma = elma * e;

		System.out.print("Domates kaç kilo: ");
		double d = scan.nextDouble();
		domates = domates * d;

		System.out.print("Muz kaç kilo: ");
		double m = scan.nextDouble();
		muz = muz * m;

		System.out.print("Patlıcan kaç kilo: ");
		double p = scan.nextDouble();
		patlican = patlican * p;

		double toplam = armut + elma + domates + muz + patlican;

		System.out.print("Toplam tutar: " + toplam);

	}

}
