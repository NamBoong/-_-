package ±¸Çö;

import java.util.Scanner;

public class Main2669 {
	
	static int[][] paper = new int[100][100];

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = scan.nextInt();
			}
			answer(arr[i][0], arr[i][1], arr[i][2], arr[i][3]);	
		}
		
		int count = 0;
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(paper[i][j]==1) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}
	
	public static void answer(int a, int b, int c, int d) {
		
		for(int i=b; i<d; i++) {
			for(int j=a; j<c; j++) {
				if(paper[i][j]==0) {
					paper[i][j] = 1;
				}
			}
		}
		
	}

}
