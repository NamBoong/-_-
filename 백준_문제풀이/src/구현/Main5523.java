package ±¸Çö;

import java.util.Scanner;

public class Main5523 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		
		answer(a, b, n);
		scan.close();
	}
	public static void answer(int[] a, int[] b, int n) {
		
		int aa = 0;
		int bb = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i]>b[i]) {
				aa++;
			}
			else if(a[i]<b[i]) {
				bb++;
			}
		}
		
		System.out.println(aa + " " + bb);
	}

}
