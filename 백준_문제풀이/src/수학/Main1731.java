package ¼öÇÐ;

import java.util.Scanner;

public class Main1731 {

	static long su = 0;
	static long turn = 0;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextLong();
		}
		
		answer(arr[0], arr[1], arr[2]);
		
		if(turn==1) {
			System.out.println(arr[n-1]+su);
		}
		if(turn==2) {
			System.out.println(arr[n-1]*su);
		}
		
		scan.close();
	}
	
	public static void answer(long a, long b, long c) {
		
		if(b-a==c-b) {
			su = b-a;
			turn = 1;
		}
		else if(b/a==c/b  && b-a!=c-b) {
			su = b/a;
			turn = 2;
		}
		
	}

}
