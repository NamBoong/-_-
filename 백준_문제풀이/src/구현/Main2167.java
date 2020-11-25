package ±¸Çö;

import java.util.Scanner;

public class Main2167 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		int x = scan.nextInt();
		int[][] arr = new int[y][x];
		
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int test = scan.nextInt();
		int[][] testcase = new int[test][4];
		
		for(int i=0; i<test; i++) {
			for(int j=0; j<4; j++) {
				testcase[i][j] = scan.nextInt() -1;
			}
		}
		
		int count = 0;
		
		while(count<test) {
			
			int sum = 0;
			
			for(int i=testcase[count][0]; i<=testcase[count][2]; i++) {
				for(int j=testcase[count][1]; j<=testcase[count][3]; j++) {
					sum = sum + arr[i][j];
				}
			}
			System.out.println(sum);
			count++;
		}
		
		scan.close();
	}

}
