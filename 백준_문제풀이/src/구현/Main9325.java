package ±¸Çö;

import java.util.Scanner;

public class Main9325 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		scan.close();
	}
	
	public static void answer(int n) {
		
		int[] money = new int[n];
		int[] option = new int[n];	
		
		int answer = 0;
	
		for(int i=0; i<n; i++) {
			
			money[i] = scan.nextInt();
			option[i] = scan.nextInt();

			int[][] arr = new int[option[i]][2];
			
			for(int j=0; j<option[i]; j++) {
				for(int k=0; k<2; k++) {
					arr[j][k] = scan.nextInt();
				}
				
				answer = answer + (arr[j][0]*arr[j][1]);
			}
			
			System.out.println(answer+money[i]);		
			answer = 0;
		}
		
	}

}
