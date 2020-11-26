package ¼öÇÐ;

import java.util.Scanner;

public class Main9550 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] candy = new int[n][2];
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<2; j++) {
				candy[i][j] = scan.nextInt();
			}

			int[][] peple = new int[n][candy[i][0]];
			
			for(int j=0; j<candy[i][0]; j++) {
				peple[i][j] = scan.nextInt();
			}
			
			for(int j=0; j<candy[i][0]; j++) {				
				answer[i] = answer[i] + (int)Math.floor(peple[i][j]/candy[i][1]);
			}
		}	
		for(int i=0; i<n; i++) {
			System.out.println(answer[i]);
		}
		
		scan.close();
	}

}
