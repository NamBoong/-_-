package ±‚«œ«–;

import java.util.Scanner;

public class Main16479 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int d1 = scan.nextInt();
		int d2 = scan.nextInt();
		
		if(d1==d2) {
			System.out.println((int)Math.pow(k, 2));
		}
		else {
			answer(k, d1, d2);
		}
		
		scan.close();
	}
	
	public static void answer(int k, int d1, int d2) {
		
		double d = d1-d2;
		d = d/2;
		
		double answer = Math.pow(k, 2) - Math.pow(d, 2);
		
		if(answer==(int)answer) {
			System.out.println((int)answer);
		}
		else if (Math.ceil(answer*1000000)/1000000.0==answer) {
			System.out.println(answer);
		}
		else {
			System.out.format("%.6f", answer);
		}
	}

}
