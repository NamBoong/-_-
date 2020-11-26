package ¼öÇÐ;

import java.util.Scanner;

public class Main5575 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][6];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			answer(arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4], arr[i][5]);
		}
		
		scan.close();
	}
	
	public static void answer(int a, int b, int c, int d, int e, int f) {
		if(c>f) {
			e--;
			f = f+60;
			if(b>e) {
				d--;
				e = e+60;
				System.out.println((d-a) + " " + (e-b) + " " + (f-c));
			}
			else {
				System.out.println((d-a) + " " + (e-b) + " " + (f-c));
			}
		}
		else {
			if(b>e) {
				d--;
				e = e+60;
				System.out.println((d-a) + " " + (e-b) + " " + (f-c));
			}
			else {
				System.out.println((d-a) + " " + (e-b) + " " + (f-c));
			}
		}
	}

}
