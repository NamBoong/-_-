package ¼öÇÐ3;

import java.util.Scanner;

public class Main11050 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		int k = scan.nextInt();
		
		answer(n, k);
		
		scan.close();
	}
	
	public static void answer(int a, int b) {
		
		int aa = 1;
		int bb = 1;
		int cc = 1;
		
		for(int i=a; i>=2; i--) {
			aa = aa*i;
		}
		
		for(int i=b; i>=2; i--) {
			bb = bb*i;
		}
		
		for(int i=a-b; i>=2; i--) {
			cc = cc*i;
		}
		
		System.out.println((aa/bb)/cc);
	}

}
