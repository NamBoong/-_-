package ±¸Çö;

import java.util.Scanner;

public class Main2747 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int n = scan.nextInt();
		
		if(n>=2) {
			answer(n);
		}
		
		if(n==0) {
			System.out.println(0);
		}
		
		if(n==1) {
			System.out.println(1);
		}
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int one = 0;
		int two = 1;
		int answer = 1;		
		int count = 2;
		
		while(count<=n) {			
			answer = one + two;		
			one = two;
			two = answer;
			
			count++;
		}
		
		System.out.println(answer);
		
	}

}
