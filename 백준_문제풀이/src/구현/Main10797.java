package ±¸Çö;

import java.util.Scanner;

public class Main10797 {

	static Scanner scan = new Scanner(System.in);
	static int date = scan.nextInt();
	static int count = 0;
	static int check = 0;
	
	public static void main(String[] args) {

		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
			answer(arr[i]);
		}
		
		scan.close();
	}
	
	public static void answer(int a) {
		
		if(date==a) {
			count++;
		}
		check++;
		
		if(check==5) {
			System.out.println(count);
		}
	}

}
