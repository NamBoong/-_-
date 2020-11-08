package ±¸Çö;

import java.util.Scanner;

public class Main10801 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[2][10];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int a = 0;
		int b = 0;
		
		for(int j=0; j<10; j++) {
			if(answer(arr[0][j], arr[1][j])==1) {
				a++;
			}
			if(answer(arr[0][j], arr[1][j])==2) {
				b++;
			}			
		}
		
		if(a==b) {
			System.out.println("D");
		}
		if(a>b) {
			System.out.println("A");
		}
		if(b>a) {
			System.out.println("B");
		}
		
		scan.close();
	}
	
	public static int answer(int a, int b) {
		if(a>b) {
			return 1;
		}
		if(a<b) {
			return 2;
		}
		else {
			return 0;
		}
	}

}
