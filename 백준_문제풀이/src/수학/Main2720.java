package ¼öÇÐ;

import java.util.Scanner;

public class Main2720 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			answer(arr[i]);
		}
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		int money = n;
		
		System.out.printf((money/quarter) + " ");
		
		money = money - ((money/quarter)*quarter);
		
		System.out.printf((money/dime) + " ");
		
		money = money - ((money/dime)*dime);
		
		System.out.printf((money/nickel) + " ");
		
		money = money - ((money/nickel)*nickel);
		
		System.out.println((money/penny));
	}

}
