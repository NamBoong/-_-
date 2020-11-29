package ¼öÇÐ;

import java.util.Scanner;

public class Main2845 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int p = scan.nextInt();
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
		}
		
		int peple = l*p;
		
		for(int i=0; i<5; i++) {
			System.out.printf(answer(peple, arr[i]) + " ");
		}
		
		scan.close();
	}
	
	public static int answer(int a, int b) {
		return b-a;
	}

}
