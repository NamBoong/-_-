package ±¸Çö;

import java.util.Scanner;

public class Main10990 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
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
			
			if(count==0) {
				System.out.println("*");
			}
			
			if(count!=0) {
				
				System.out.printf("*");
				
				for(int i=0; i<count*2-1; i++) {
					System.out.printf(" ");
				}
				
				System.out.println("*");
				
			}

			count++;
		}
	}

}
