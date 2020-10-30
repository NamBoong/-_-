package ±¸Çö;

import java.util.Scanner;

public class Main2522 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		int count = 0;
		
		while(count<n) {
			
			for(int i=n-count-1; i>0; i--) {
				System.out.printf(" ");
			}
			
			for(int i=0; i<=count; i++) {
				System.out.printf("*");
			}
			
			System.out.println();
			
			count++;
		}
		
		int count2 = 0;
		
		while(count2<n-1) {
			
			for(int i=0; i<=count2; i++) {
				System.out.printf(" ");
			}
			
			for(int i=n-count2-1; i>0; i--) {
				System.out.printf("*");
			}
			
			System.out.println();
			
			count2++;
		}
	}

}
