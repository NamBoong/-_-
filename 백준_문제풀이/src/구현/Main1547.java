package ±¸Çö;

import java.util.Scanner;

public class Main1547 {

	static int[] ball = new int[3];
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		ball[0] = 1;
		
		int count = 0;
		
		while(count<n) {
			answer(arr[count][0], arr[count][1]);
			
			count++;
		}
		
		if(ball[0]==1) {
			System.out.println(1);
		}
		else if(ball[1]==1) {
			System.out.println(2);
		}
		else if(ball[2]==1) {
			System.out.println(3);
		}
		else {
			System.out.println(-1);
		}
		
		scan.close();
	}
	
	public static void answer(int a, int b) {
		
		int aa = a-1;
		int bb = b-1;
		
		int temp = ball[aa];
		ball[aa] = ball[bb];
		ball[bb] = temp;
		
	}

}
