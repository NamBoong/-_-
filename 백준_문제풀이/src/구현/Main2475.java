package ±¸Çö;

import java.util.Scanner;

public class Main2475 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		answer(a, b, c, d, e);
		scan.close();
	}
	
	public static void answer(int a, int b, int c, int d, int e) {
		
		int goal = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) + Math.pow(d, 2) + Math.pow(e, 2));
		
		System.out.println(goal%10);
	}

}
