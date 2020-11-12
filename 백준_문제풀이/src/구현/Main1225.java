package ±¸Çö;

import java.util.Scanner;

public class Main1225 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		System.out.println(answer(a, b));
		
		scan.close();
	}

	public static long answer(String a, String b) {

		String[] aarr = a.split("");
		String[] barr = b.split("");

		long sum = 0;
		
		for(int i=0; i<aarr.length; i++) {
			for(int j=0; j<barr.length; j++) {
				sum = sum + Integer.parseInt(aarr[i])*Integer.parseInt(barr[j]);
			}
		}
		
		return sum;
	}
}
