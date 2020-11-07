package ±¸Çö;

import java.util.Scanner;

public class Main10984 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();

		int[] arr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			arr2[i] = scan.nextInt();
			answer(arr2[i]);
		}
		
		scan.close();
	}
	
	public static void answer(int n) {
	
		double[][] arr = new double[n][2];
		int sum1 = 0;
		double sum2 = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextDouble();			
			}
		}
		
		
	
		for(int i=0; i<n; i++) {
			sum1 = sum1 + (int)arr[i][0];
			sum2 = sum2 + (arr[i][0] * arr[i][1]);
		}
		
		System.out.printf(sum1 + " ");
		System.out.format("%.1f\n", (sum2/sum1));
	}

}
