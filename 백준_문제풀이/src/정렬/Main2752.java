package Á¤·Ä;

import java.util.Scanner;

public class Main2752 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(min(a, b, c) + " " + mid(a, b, c) + " " + max(a, b, c));
		
		scan.close();
	}
	
	public static int min(int a, int b, int c) {
		
		return Math.min(c, Math.min(a, b));
	}
	
	public static int mid(int a, int b, int c) {
		
		return (a+b+c)-Math.max(c, Math.max(a, b)) - Math.min(c, Math.min(a, b));
	}
	
	public static int max(int a, int b, int c) {
		
		return Math.max(c, Math.max(a, b));
	}

}
