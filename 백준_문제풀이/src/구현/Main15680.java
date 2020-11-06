package ±¸Çö;

import java.util.Scanner;

public class Main15680 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(answer(n));
		
		scan.close();
	}
	
	public static String answer(int n) {
		
		if(n==1) {
			return "Leading the Way to the Future";
		}
		else {
			return "YONSEI";
		}
		
	}

}
