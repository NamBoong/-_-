package ¼öÇĞ;

import java.util.Scanner;

public class Main17256 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[3];
		int[] c = new int[3];
		
		for(int i=0; i<3; i++) {
			a[i] = scan.nextInt();
		}
		for(int i=0; i<3; i++) {
			c[i] = scan.nextInt();
		}
		
		int[] b = new int[3];
		
		b[0] = c[0]-a[2];
		b[1] = c[1]/a[1];
		b[2] = c[2]-a[0];
		
		System.out.println(b[0] + " " + b[1] + " " + b[2]);
		
		scan.close();
	}

}
