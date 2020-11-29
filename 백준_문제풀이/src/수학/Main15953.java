package ¼öÇÐ;

import java.util.Scanner;

public class Main15953 {

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
			System.out.println(test1(arr[i][0])+test2(arr[i][1]));
		}
		
		scan.close();
	}
	
	public static int test1(int a) {
		
		if(a==1) {
			return 5000000; 
		}
		else if(a>1 && a<=3) {
			return 3000000;
		}
		else if(a>3 && a<=6) {
			return 2000000;
		}
		else if(a>6 && a<=10) {
			return 500000;
		}
		else if(a>10 && a<=15) {
			return 300000;
		}
		else if(a>15 && a<=21) {
			return 100000;
		}
		else {
			return 0;
		}
	}
	public static int test2(int a) {
		
		if(a==1) {
			return 5120000; 
		}
		else if(a>1 && a<=3) {
			return 2560000;
		}
		else if(a>3 && a<=7) {
			return 1280000;
		}
		else if(a>7 && a<=15) {
			return 640000;
		}
		else if(a>15 && a<=31) {
			return 320000;
		}
		else {
			return 0;
		}
	}
}
