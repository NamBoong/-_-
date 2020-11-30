package ¼öÇÐ;

import java.util.Scanner;

public class Main10707 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int p = scan.nextInt();
		
		int x = x(a, p);
		int y1 = 0;
		int y2 = 0;
		
		if(p<=c) {
			y1 = b;			
			System.out.println(answer(x, y1));
		}
		if(p>c) {
			y2 = b + y((p-c), d);
			System.out.println(answer(x, y2));
		}
		
		scan.close();
	}
	public static int x(int a, int b) {
		return a*b;
	}
	public static int y(int p, int d) {
		return p*d;
	}
	public static int answer(int a, int b) {
		return Math.min(a, b);
	}
}
