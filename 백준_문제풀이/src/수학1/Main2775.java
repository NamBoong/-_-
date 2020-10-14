package ¼öÇÐ1;

import java.util.Scanner;

public class Main2775 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n*2];
		
		for(int i=0; i<n*2; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[][] arr2 = new int[15][14];
		
		for(int i=0; i<14; i++) {
			arr2[0][i] = i+1;
		}
		
		int test = 0;
		
		while(test<14) {
			
			for(int i=1; i<15; i++) {
				for(int j=0; j<=test; j++) {
					arr2[i][test] = arr2[i][test] + arr2[i-1][j];
				}
			}
			test++;
		}
		
		int count = 0;
		
		while(count<n*2) {
			if(count%2==0) {
				System.out.println(arr2[arr[count]][arr[count+1]-1]);
			}
			count++;
		}
		
		scan.close();
	}

}
