package ±¸Çö;

import java.util.Scanner;

public class Main14582 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[2][9];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int a = 0;
		int b = 0;
		int type = 0;
		
		for(int j=0; j<9; j++) {
			
			a = a + arr[0][j];			
			if(a>b) {
				type = 1;
				break;
			}		
			b = b + arr[1][j];
		}
		
		if(type==1) {
			System.out.println("Yes");
		}
		if(type==0) {
			System.out.println("No");
		}
		
		scan.close();
	}

}
