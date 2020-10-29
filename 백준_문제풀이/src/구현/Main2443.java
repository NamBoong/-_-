package ±¸Çö;

import java.util.Scanner;

public class Main2443 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int count = n;
		int space = 0;
		
		while(count>0) {
			
			for(int i=count*2-1; i>0; i--) {
				System.out.printf("*");
			}
			
			System.out.println();
			
			for(int i=0; i<=space; i++) {
				System.out.printf(" ");
			}
			
			count--;
			space++;
		}
	}

}
