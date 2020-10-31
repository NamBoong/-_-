package ±¸Çö;

import java.util.Scanner;

public class Main2914 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		answer(n, m);

		scan.close();
	}
	
	public static void answer(int n, int m) {
		
		System.out.println(n*(m-1)+1);
	}

}
