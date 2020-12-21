package ±¸Çö;

import java.util.Scanner;

public class Main11948 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] s = new int[4];
		int[] h = new int[2];
		
		for(int i=0; i<4; i++) {
			s[i] = scan.nextInt();
		}
		for(int i=0; i<2; i++) {
			h[i] = scan.nextInt();
		}
		
		System.out.println(science(s) + history(h));
		scan.close();
	}
	
	public static int science(int[] s) {
		
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			sum = sum + s[i];
		}
		
		int min = Math.min(Math.min(s[0], s[1]), Math.min(s[2], s[3]));
		
		return sum-min;
	}
	
	public static int history(int[] h) {
		return Math.max(h[0], h[1]);
	}

}
