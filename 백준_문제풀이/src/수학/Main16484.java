package ¼öÇÐ;

import java.util.Scanner;

public class Main16484 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double n = scan.nextInt();
		double d = scan.nextInt();
		
		double answer = n/2-d;
		
		System.out.format("%.1f", answer);
		
		scan.close();
	}

}
