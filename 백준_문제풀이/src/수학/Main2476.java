package ¼öÇÐ;

import java.util.Scanner;

public class Main2476 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int money = 0;
		
		for(int i=0; i<n; i++) {
			if(money<answer(arr[i][0], arr[i][1], arr[i][2])) {
				money = answer(arr[i][0], arr[i][1], arr[i][2]);
			}
		}
		
		System.out.println(money);
		
		scan.close();
	}
	
	public static int answer(int a, int b, int c) {
		
		if(a==b && b==c) {
			return 10000+(a*1000);
		}
		else if(a!=b && b!=c && a!=c) {
			return Math.max(c, Math.max(a, b))*100;
		}
		else {
			if(a==b) {
				return 1000+(a*100);
			}
			else if(a==c) {
				return 1000+(a*100);
			}
			else {
				return 1000+(b*100);
			}
		}
		
	}

}
