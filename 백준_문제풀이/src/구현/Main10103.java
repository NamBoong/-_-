package ±¸Çö;

import java.util.Scanner;

public class Main10103 {
	static int chang = 100;
	static int sang = 100;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		

		int count = 0;
		while(count<n) {
			answer(arr[count][0], arr[count][1]);
			count++;
		}
		
		System.out.println(chang);
		System.out.println(sang);
		
		scan.close();
	}
	
	public static int answer(int a, int b) {
		
		if(a>b) {
			sang = sang-a;
			return sang;
		}
		else if(a<b) {
			chang = chang-b;
			return chang;
		}
		else {
			return 0;
		}
	}

}
