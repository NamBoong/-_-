package ¼öÇÐ;

import java.util.Scanner;

public class Main11109 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		
		int[][] arr = new int[test][4];
		
		for(int i=0; i<test; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<test; i++) {
			if(arr[i][0]+answer(arr[i][1], arr[i][3]) < answer(arr[i][1], arr[i][2])) {
				System.out.println("parallelize");
			}
			if(arr[i][0]+answer(arr[i][1], arr[i][3]) == answer(arr[i][1], arr[i][2])) {
				System.out.println("does not matter");
			}
			if(arr[i][0]+answer(arr[i][1], arr[i][3]) > answer(arr[i][1], arr[i][2])) {
				System.out.println("do not parallelize");
			}
		}
		
		scan.close();
	}
	
	public static int answer(int a, int b) {
		return a*b;
	}

}
