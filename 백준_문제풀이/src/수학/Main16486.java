package ¼öÇÐ;

import java.util.Scanner;

public class Main16486 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long d1 = scan.nextLong();
		long d2 = scan.nextLong();
		d2 = d2*2;
		double pie = 3.141592;
		
		System.out.format("%.6f", (d1*2+(d2*pie)));
		scan.close();
	}

}
