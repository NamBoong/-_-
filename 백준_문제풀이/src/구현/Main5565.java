package ±¸Çö;

import java.util.Scanner;

public class Main5565 {
	
	static Scanner scan = new Scanner(System.in);
	static int ten = scan.nextInt();		
	static int answer = 0;

	public static void main(String[] args) {
		
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
			answer(arr[i]);
		}
		
		System.out.println(ten-answer);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		answer = answer + n;
	}

}
