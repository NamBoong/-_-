package ¼öÇÐ;

import java.util.Scanner;

public class Main2480 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a==b && b==c) {
			System.out.println(type1(a, b, c));
		}
		else if ((a==b && b!=c) || (a==c && a!=b)) {
			System.out.println(type2(a, b, c));
		}
		else if(b==c && a!=b) {
			System.out.println(type3(a, b, c));
		}
		else {
			System.out.println(type4(a, b, c));
		}
		
		scan.close();
	}
	
	public static int type1(int a, int b, int c) {
		return 10000+(a*1000);
	}
	
	public static int type2(int a, int b, int c) {
		return 1000+(a*100);
	}

	public static int type3(int a, int b, int c) {
		return 1000+(b*100);
	}
	
	public static int type4(int a, int b, int c) {
		int answer = Math.max(c, Math.max(a, b));
		
		return 100*answer;
	}
	
}
