package ±¸Çö;

import java.util.Scanner;

public class Main12790 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][8];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<8; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		int sum = 0;
		
		while(count<n) {
			sum = answer1(arr[count][0], arr[count][4]) + 5*(answer2(arr[count][1], arr[count][5]))
				+ 2*(answer3(arr[count][2], arr[count][6])) + 2*(answer4(arr[count][3], arr[count][7]));

			System.out.println(sum);
			count++;
		}
			
		scan.close();
	}
	
	public static int answer1(int a, int b) {		
		if(a+b<1) {
			return 1;
		}
		else {
			return a+b;
		}
	}
	
	public static int answer2(int a, int b) {		
		if(a+b<1) {
			return 1;
		}
		else {
			return (a+b);
		}
	}
	
	public static int answer3(int a, int b) {				
		if(a+b<0) {
			return 0;
		}
		else {
			return (a+b);
		}
	}	
	
	public static int answer4(int a, int b) {				
		return (a+b);
	}	
}
