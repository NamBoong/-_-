package ±¸Çö;

import java.util.Scanner;

public class Main5596 {

	static int min = 0;
	static int man = 0;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[2][4];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<4; i++) {
			answer(arr[0][i], arr[1][i]);
		}
		
		if(min>=man) {
			System.out.println(min);
		}
		else {
			System.out.println(man);
		}
		
		scan.close();
	}
	
	public static void answer(int a, int b) {
		
		min = min + a;
		man = man + b;
		
	}

}
