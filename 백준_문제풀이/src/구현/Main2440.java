package ±¸Çö;

import java.util.Scanner;

public class Main2440 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		while(n>=0) {
			
			for(int i=0; i<n; i++) {
				System.out.printf("*");
			}
			System.out.println();
			n--;
		}
	}

}
