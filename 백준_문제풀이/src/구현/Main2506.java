package ±¸Çö;

import java.util.Scanner;

public class Main2506 {

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
		
		int answer = 0;
		int plus = 1;
		
			for(int i=0; i<n; i++) {
				if(arr[i]==1) {
					answer = answer + plus;
					plus++;
				}
				if(arr[i]==0) {
					plus=1;
				}
			}
		
		System.out.println(answer);
	}

}
