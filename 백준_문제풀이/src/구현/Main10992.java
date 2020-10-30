package ±¸Çö;

import java.util.Scanner;

public class Main10992 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		scan.close();
	}
	
	public static void answer(int n) {
		
		int count = 0;
		int count2 = 0;
		
		while(count<n) {

			
			if(count==0) {
				for(int i=0; i<n-1; i++) {
					System.out.printf(" ");
				}
				System.out.println("*");
			}
			
			if(count>=2) {			
				for(int i=n-count; i>0; i--) {
					System.out.printf(" ");
				}
					System.out.printf("*");
				for(int i=0; i<count2*2+1; i++) {
					System.out.printf(" ");
				}
					System.out.println("*");

					count2++;
			}
			
			if(count==n-1 && n!=1) {
				for(int i=0; i<count*2+1; i++) {
					System.out.printf("*");
				}
			}
			
			count++;
		}
		
	}

}
