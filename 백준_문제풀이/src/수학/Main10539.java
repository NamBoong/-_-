package ¼öÇÐ;

import java.util.Scanner;

public class Main10539 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] answer = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			answer[i] = arr[i] * (i+1) - sum;			
			sum = sum + answer[i];			
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf(answer[i] + " ");
		}
	}

}
