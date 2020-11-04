package ±¸Çö;

import java.util.Scanner;

public class Main2460 {
	
	static int station = 0;
	static int max = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[10][2];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}		
			answer(arr[i][0], arr[i][1]);		
		}
		
		System.out.println(max);
		
		scan.close();
	}
	
	public static void answer(int a, int b) {
		
		station = station - a + b;
		
		if(max<station) {
			max = station;
		}
		
		
	}

}
