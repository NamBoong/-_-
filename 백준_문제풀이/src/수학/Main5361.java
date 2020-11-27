package ¼öÇÐ;

import java.util.Scanner;

public class Main5361 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][5];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.format("$%.2f\n", a(arr[i][0])+b(arr[i][1])+c(arr[i][2])+d(arr[i][3])+e(arr[i][4]));
		}
		scan.close();
	}
	
	public static double a(int a) {
		double n = 350.34;
		
		return n*a;
	}
	public static double b(int b) {
		double n = 230.90;
		
		return n*b;
	}
	public static double c(int c) {
		double n = 190.55;
		
		return n*c;
	}
	public static double d(int d) {
		double n = 125.30;
		
		return n*d;
	}
	public static double e(int e) {
		double n = 180.90;
		
		return n*e;
	}

}
