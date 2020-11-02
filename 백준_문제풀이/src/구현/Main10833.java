package ±¸Çö;

import java.util.Scanner;

public class Main10833 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			answer = answer + (arr[i][1]%arr[i][0]);
		}
		
		System.out.println(answer);
	}

}
