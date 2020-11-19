package ¼öÇÐ;

import java.util.Scanner;

public class Main13458 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double[] a = new double[n];
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		long b = scan.nextLong();
		long c = scan.nextLong();
		
		long answer = n;
		for(int i=0; i<n; i++) {
			a[i] = a[i] - b;
		}
		
		for(int i=0; i<n; i++) {
			if(a[i]>0) {
				answer = answer + (int)Math.ceil(a[i]/c);
			}
		}
		
		System.out.println(answer);
		
		scan.close();
	}

}
