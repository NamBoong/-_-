package ±¸Çö;

import java.util.Scanner;

public class Main2441 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int count = n;
		
		while(count>=0) {
			
			for(int i=0; i<n-count; i++) {
				System.out.printf(" ");
			}
			
			for(int i=count; i>0; i--) {
				System.out.printf("*");
			}
			System.out.println();
			
			count--;
		}
	}

}
