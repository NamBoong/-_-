package ±¸Çö;

import java.util.Scanner;

public class Main10817 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		answer(a, b, c);
		
		scan.close();

	}
	
	public static void answer(int a, int b, int c) {
		
		int sum = a+b+c;
		int min = Math.min(c, Math.min(a, b));
		int max = Math.max(c, Math.max(a, b));
		
		System.out.println(sum-min-max);
	}

}
