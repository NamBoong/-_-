package ¼öÇÐ;

import java.util.Scanner;

public class Main10178 {

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
			System.out.println(answer(arr[i][0], arr[i][1]));
		}
		
		scan.close();
	}
	
	public static String answer(int a, int b) {
		
		int aa = a/b;
		int bb = a%b;
		
		String answer = "You get " + aa + " piece(s) and your dad gets " + bb + " piece(s).";

		return answer;

	}
}
