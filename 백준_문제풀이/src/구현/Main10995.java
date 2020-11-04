package ±¸Çö;

import java.util.Scanner;

public class Main10995 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		answer(n);
		scan.close();
	}
	
	public static void answer(int n) {
		
		int count = 0;
		
		while(count<n) {
			
			for(int i=0; i<n; i++) {
				if(count%2==0) {
					System.out.printf("* ");
				}
				if(count%2==1) {
					System.out.printf(" *");
				}
			}
			
			System.out.println();
			
			count++;
		}
		
	}

}
