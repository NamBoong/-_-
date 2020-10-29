package ¼öÇÐ;

import java.util.Scanner;

public class Main10039 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		answer(a, b, c, d, e);
		
		scan.close();
	}
	
	public static void answer(int a, int b, int c, int d, int e) {
		
		int goal = 0;
		
		if(a<40) {
			goal = goal + 40;
		}
		else {
			goal = goal + a;
		}
		
		if(b<40) {
			goal = goal + 40;
		}
		else {
			goal = goal + b;
		}
		
		if(c<40) {
			goal = goal + 40;
		}
		else {
			goal = goal + c;
		}
		
		if(d<40) {
			goal = goal + 40;
		}
		else {
			goal = goal + d;
		}
		
		if(e<40) {
			goal = goal + 40;
		}
		else {
			goal = goal + e;
		}
		
		System.out.println(goal/5);
	}

}
