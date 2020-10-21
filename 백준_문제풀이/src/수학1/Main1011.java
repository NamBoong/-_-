package ¼öÇÐ1;

import java.util.Scanner;

public class Main1011 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	static int[][] arr = new int[n][2];
	
	public static void main(String[] args) {

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
	
	public static void answer(int a, int b) {
		
		int aa = a;
		int bb = b;
		int c = bb-aa;
		
		int max = (int)Math.sqrt(c);
		
		if(max == Math.sqrt(c)) {
			System.out.println(2*max-1);
		}
		
		else if(c<=max*max+max) {
			System.out.println(2*max);
		}
		
		else {
			System.out.println(2*max+1);
		}
		
		
	}

}
