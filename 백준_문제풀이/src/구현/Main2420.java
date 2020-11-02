package ±¸Çö;

import java.util.Scanner;

public class Main2420 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		answer(a, b);
		
		scan.close();
	}
	
	public static void answer(long a, long b) {
		
		System.out.println(Math.abs(a-b));
	}

}
