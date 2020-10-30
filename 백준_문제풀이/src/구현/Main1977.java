package ±¸Çö;

import java.util.Scanner;

public class Main1977 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int m = scan.nextInt();
		int n = scan.nextInt();
		
		answer(m, n);
		scan.close();
	}
	
	public static void answer(int m, int n) {
		
		int goal = 0;
		int min = Integer.MAX_VALUE;
		int count = 0;
		
		for(int i=1; i<=10000; i++) {
			if(Math.pow(i, 2)>=m && Math.pow(i, 2)<=n) {
				goal = goal + (int)Math.pow(i, 2);
				if(min>(int)Math.pow(i, 2)) {
					min = (int)Math.pow(i, 2);
				}
				count++;
			}
		}
		
		if(count==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(goal);
			System.out.println(min);
		}
		
	}

}
