package ¼öÇÐ;

import java.util.Scanner;

public class Main8932 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][7];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<7; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		
		while(count<n) {
			
			long a = one(arr[count][0]) + two(arr[count][1]) + three(arr[count][2]) + four(arr[count][3])
			 		+ five(arr[count][4]) + six(arr[count][5]) + seven(arr[count][6]);
			
			System.out.println(a);
			
			count++;
		}
		scan.close();
	}
	
	public static long one(int n) {		
		return (long) (9.23076*Math.pow((26.7-n), 1.835));
	}
	
	public static long two(int n) {	
		return (long) (1.84523*Math.pow((n-75), 1.348));
	}
	
	public static long three(int n) {	
		return (long) (56.0211*Math.pow((n-1.5), 1.05));
	}

	public static long four(int n) {	
		return (long) (4.99087*Math.pow((42.5-n), 1.81));
	}
	
	public static long five(int n) {	
		return (long) (0.188807*Math.pow((n-210), 1.41));
	}

	public static long six(int n) {	
		return (long) (15.9803*Math.pow((n-3.8), 1.04));
	}

	public static long seven(int n) {	
		return (long) (0.11193*Math.pow((254-n), 1.88));
	}
}
