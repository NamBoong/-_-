package ¼öÇÐ;

import java.util.Scanner;

public class Main5543 {
	
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
		
		System.out.println((int)(Math.min(c, Math.min(a, b)) + Math.min(d, e) - 50));
		
	}

}
