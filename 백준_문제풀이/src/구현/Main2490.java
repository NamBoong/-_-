package ±¸Çö;

import java.util.Scanner;

public class Main2490 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			answer(arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
		}
		scan.close();
	}
	
	public static void answer(int a, int b, int c, int d) {
		
		int count = 0;
		
		if(a==1) {
			count++;
		}
		
		if(b==1) {
			count++;
		}
		
		if(c==1) {
			count++;
		}
		
		if(d==1) {
			count++;
		}
		
		
		if(count==0) {
			System.out.println("D");
		}
		else if(count==1) {
			System.out.println("C");
		}
		else if(count==2) {
			System.out.println("B");
		}	
		else if(count==3) {
			System.out.println("A");
		}
		else {
			System.out.println("E");
		}
	}

}
