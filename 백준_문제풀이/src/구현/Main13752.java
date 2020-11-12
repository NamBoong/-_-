package ±¸Çö;

import java.util.Scanner;

public class Main13752 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			answer(arr[i]);
		}
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		for(int i=0; i<n; i++) {
			System.out.printf("=");
		}
		System.out.println();
	}

}
