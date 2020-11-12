package ±¸Çö;

import java.util.Scanner;

public class Main17388 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(answer(a, b, c));

		
	}
	
	public static String answer(int a, int b, int c) {
		
		if(a+b+c>=100) {
			return "OK";
		}
		else{
			if(Math.min(c, Math.min(a, b))==a) {
				return "Soongsil";
			}
			
			else if(Math.min(c, Math.min(a, b))==b) {
				return "Korea";
			}
			
			else{
				return "Hanyang";
			}
		}
	}

}
