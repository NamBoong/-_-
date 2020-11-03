package ±¸Çö;

import java.util.Scanner;

public class Main9085 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		answer(n);
		scan.close();
	}
	
	public static void answer(int n) {
		
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			int[] num = new int[arr[i]];
			for(int j=0; j<arr[i]; j++) {
				num[j] = scan.nextInt();
				sum = sum + num[j];
			}
			System.out.println(sum);
			sum = 0;
		}
		
	}

}
