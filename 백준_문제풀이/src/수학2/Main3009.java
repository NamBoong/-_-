package ¼öÇĞ2;

import java.util.Scanner;

public class Main3009 {

	static Scanner scan = new Scanner(System.in);
	
	static int[][] arr = new int[3][2];

	public static void main(String[] args) {

		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}	
	
		int x = 0;
		int y = 0;
		
		if(arr[0][0]==arr[1][0]) {
			x = arr[2][0];
		}
		
		if(arr[0][0]==arr[2][0]) {
			x = arr[1][0];
		}
		
		if(arr[1][0]==arr[2][0]) {
			x = arr[0][0];
		}
		
		
		if(arr[0][1]==arr[1][1]) {
			y = arr[2][1];
		}
		
		if(arr[0][1]==arr[2][1]) {
			y = arr[1][1];
		}
		
		if(arr[1][1]==arr[2][1]) {
			y = arr[0][1];
		}
		
		System.out.println(x + " " + y);
		
		scan.close();
	}

}
