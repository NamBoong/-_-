package ±¸Çö;

import java.util.Scanner;

public class Main13300 {
	
	static double g1 = 0;
	static double g2 = 0;
	static double g3 = 0;
	static double g4 = 0;
	static double g5 = 0;
	static double g6 = 0;
	static double b1 = 0;
	static double b2 = 0;
	static double b3 = 0;
	static double b4 = 0;
	static double b5 = 0;
	static double b6 = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int student = scan.nextInt();
		int split = scan.nextInt();
		
		int[][] arr = new int[student][2];
		
		for(int i=0; i<student; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<student; i++) {
			answer(arr[i][0], arr[i][1]);
		}
		
		double room = Math.ceil(g1/split) + Math.ceil(g2/split) + Math.ceil(g3/split) + Math.ceil(g4/split) +
				Math.ceil(g5/split) + Math.ceil(g6/split) + Math.ceil(b1/split) + Math.ceil(b2/split) +
				Math.ceil(b3/split) + Math.ceil(b4/split) + Math.ceil(b5/split) + Math.ceil(b6/split);
		
		System.out.println((int)room);
		scan.close();
	}
	
	public static double answer(int a, int b) {
		
		if(a==0 && b==1) {
			return g1++;
		}
		if(a==0 && b==2) {
			return g2++;
		}
		if(a==0 && b==3) {
			return g3++;
		}
		if(a==0 && b==4) {
			return g4++;
		}
		if(a==0 && b==5) {
			return g5++;
		}
		if(a==0 && b==6) {
			return g6++;
		}
		
		if(a==1 && b==1) {
			return b1++;
		}
		if(a==1 && b==2) {
			return b2++;
		}
		if(a==1 && b==3) {
			return b3++;
		}
		if(a==1 && b==4) {
			return b4++;
		}
		if(a==1 && b==5) {
			return b5++;
		}
		if(a==1 && b==6) {
			return b6++;
		}
		
		else {
			return -1;
		}
	}


}
