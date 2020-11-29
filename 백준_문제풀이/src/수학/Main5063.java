package ¼öÇĞ;

import java.util.Scanner;

public class Main5063 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		int[][] arr = new int[test][3];
		
		for(int i=0; i<test; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<test; i++) {
			System.out.println(answer(arr[i][0], arr[i][1], arr[i][2]));
		}
		
		scan.close();
	}
	
	public static String answer(int a, int b, int c) {
		
		int answer = b-c;
		
		if(a==answer) {
			return "does not matter";
		}
		else if(a>answer) {
			return "do not advertise";
		}
		else {
			return "advertise";
		}
	}

}
