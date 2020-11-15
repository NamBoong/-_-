package ¼öÇÐ;

import java.util.Scanner;

public class Main11006 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			answer(arr[i][0], arr[i][1]);
		}
		
		scan.close();
	}
	
	public static void answer(int n, int m) {
		
		int nomal = 0;
		int unnomal = 0;
		
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=m; j++) {
				if(i*2+j==n && i+j==m) {
					nomal = i;
					unnomal = j;
				}
			}
		}
		
		System.out.println(unnomal + " " + nomal);
	}

}
