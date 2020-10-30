package ±¸Çö;

import java.util.Scanner;

public class Main3046 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int r1 = scan.nextInt();
		int s = scan.nextInt();
		
		answer(r1, s);
		scan.close();
	}
	
	public static void answer(int r1, int s) {
		
		System.out.println(s*2-r1);
	}

}
