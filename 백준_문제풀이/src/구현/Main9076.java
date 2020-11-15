package ±¸Çö;

import java.util.Scanner;

public class Main9076 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][5];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			answer(arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4]);
		}
		
		scan.close();
	}
	
	public static void answer(int a, int b, int c, int d, int e) {

		int[] arr = new int[5];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		if(arr[3]-arr[1]>=4) {
			System.out.println("KIN");
		}
		else {
			System.out.println(arr[1]+arr[2]+arr[3]);
		}
		
	}

}
