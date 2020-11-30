package ¼öÇÐ;

import java.util.Scanner;

public class Main3003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();
		
		System.out.println(king(a) + " " + king(b) + " " + look(c) + " " + look(d) + " " + look(e) + " " + pon(f));
		scan.close();
	}
	
	public static int king(int ab) {
		return 1-ab;
	}
	public static int look(int cde) {
		return 2-cde;
	}
	public static int pon(int f) {
		return 8-f;
	}
}
