package ±¸Çö;

import java.util.Scanner;

public class Main5554 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		answer(a, b, c, d);
		scan.close();
	}
	
	public static void answer(int a, int b, int c, int d) {
		
		int sum = a+b+c+d;
		
		System.out.println(sum/60);
		System.out.println(sum%60);
		
	}

}
