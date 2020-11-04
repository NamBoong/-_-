package ±¸Çö;

import java.util.Scanner;

public class Main2566 {
	
	static int max = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = scan.nextInt();
				
				answer(arr[i][j]);
			}
		}
		
		System.out.println(max);
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(max==arr[i][j]) {
					System.out.println((i+1) + " " + (j+1));
				}
			}
		}
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		if(max<n) {
			max = n;
		}
		
	}

}
