package ±‚«œ«–;

import java.util.Scanner;

public class Main16485 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long c = scan.nextLong();
		long b = scan.nextLong();
		
		answer(c, b);		
		
		scan.close();
	}
	
	public static void answer(long c, long b) {
		
		double answer = (double)c/b;
		
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
