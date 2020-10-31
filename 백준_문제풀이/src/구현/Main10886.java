package ±¸Çö;

import java.util.Scanner;

public class Main10886 {
	
	static Scanner scan = new Scanner(System.in);
	static int cute = 0;
	static int notcute = 0;

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			answer(arr[i]);
		}
		
		if(cute>notcute) {
			System.out.println("Junhee is cute!");
		}
		else {
			System.out.println("Junhee is not cute!");
		}
		
		scan.close();
		
	}
	
	public static void answer(int n) {
		
		if(n==1) {
			cute++;
		}
		
		if(n==0) {
			notcute++;
		}
	}

}
