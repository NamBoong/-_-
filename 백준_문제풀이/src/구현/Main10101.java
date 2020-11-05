package ±¸Çö;

import java.util.Scanner;

public class Main10101 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		answer(a, b, c);
		scan.close();
	}
	
	public static void answer(int a, int b, int c) {
		
		if(a+b+c!=180) {
			System.out.println("Error");
		}
		else if(a+b+c==180 && a==60 && b==60 && c==60) {
			System.out.println("Equilateral");
		}
		else if(a+b+c==180 && a!=b && b!=c && a!=c) {
			System.out.println("Scalene");
		}
		else {
			System.out.println("Isosceles");
		}
		
	}

}
