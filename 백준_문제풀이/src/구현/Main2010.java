package ±¸Çö;

import java.util.Scanner;

public class Main2010 {
	
	static int goal = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			if(i!=n-1) {
				answer(arr[i]-1);
			}
			else {
				answer(arr[i]);
			}
		}
		
		System.out.println(goal);
		scan.close();
	}
	
	public static void answer(int n) {
		
		goal = goal + n;
	}

}
