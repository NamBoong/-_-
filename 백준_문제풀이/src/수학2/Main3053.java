package ¼öÇÐ2;

import java.util.Scanner;

public class Main3053 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Double n = scan.nextDouble();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(Double n) {
		
		Double nn = n;
		
		System.out.format("%.6f\n", nn*nn*Math.PI);
		System.out.format("%.6f", 2*nn*nn);
		
	}

}
