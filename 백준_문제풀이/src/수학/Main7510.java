package ¼öÇÐ;

import java.util.Scanner;

public class Main7510 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Scenario #" + (i+1) + ":");
			System.out.println(answer(arr[i][0], arr[i][1], arr[i][2]) + "\n");
		}
		
		scan.close();
	}
	
	public static String answer(int a, int b, int c) {
		
		int max = Math.max(c, Math.max(a, b));
		int min = Math.min(c, Math.min(a, b));
		int mid = a+b+c-max-min;
		
		if(Math.pow(min, 2)+Math.pow(mid, 2)==Math.pow(max, 2)) {
			return "yes";
		}
		else {
			return "no";
		}
	}

}
