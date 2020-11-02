package ±¸Çö;

import java.util.Scanner;

public class Main1748 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		answer(n);
		scan.close();
	}
	
	public static void answer(int n) {
		
		int answer = 0;
		
		for(int i=1; i<=n; i++) {

			if(i<10) {
				answer = answer + 1;
			}
			
			if(i>=10 && i<100) {
				answer = answer + 2;
			}
			
			if(i>=100 && i<1000) {
				answer = answer + 3;
			}
			
			if(i>=1000 && i<10000) {
				answer = answer + 4;
			}
			
			if(i>=10000 && i<100000) {
				answer = answer + 5;
			}
			
			if(i>=100000 && i<1000000) {
				answer = answer + 6;
			}
			
			if(i>=1000000 && i<10000000) {
				answer = answer + 7;
			}
			
			if(i>=10000000 && i<100000000) {
				answer = answer + 8;
			}
			
			if(i==100000000) {
				answer = answer + 9;
			}
		}
		
		System.out.println(answer);
	}

}
