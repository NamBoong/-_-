package ±¸Çö;

import java.util.Scanner;

public class Main2442 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int count = 0;
		
		while(count<n) {
			
			for(int i=n-1-count; i>0; i--) {
				System.out.printf(" ");
			}
			
			for(int i=0; i<2*count+1; i++) {
				System.out.printf("*");
			}
			
			System.out.println();
			count++;
		}
		
	}

}
