package ±¸Çö;

import java.util.Scanner;

public class Main1673 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int chicken = a;
			int cupon = a;
			
			while(cupon>=b) {
				cupon = cupon - b;
				chicken++;
				cupon++;
			}
			
			System.out.println(chicken);
		}
		
		scan.close();
	}

}
