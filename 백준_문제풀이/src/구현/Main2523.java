package ±¸Çö;

import java.util.Scanner;

public class Main2523 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
		
	}
	
	public static void answer(int n) {
		
		int count = 1;
		
		while(count<n) {
			
			for(int i=0; i<count; i++) {
				System.out.printf("*");
			}
			System.out.println();
			count++;
		}
		
		count = n;
		
		while(count>=0) {
			
			for(int i=count; i>0; i--) {
				System.out.printf("*");
			}
			System.out.println();
			count--;
		}
		
	}

}
