package ±¸Çö;

import java.util.Scanner;

public class Main15963 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long m = scan.nextLong();
		
		answer(n, m);
		scan.close();
	}
	
	public static void answer(long n, long m) {
		
		if(n==m) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
