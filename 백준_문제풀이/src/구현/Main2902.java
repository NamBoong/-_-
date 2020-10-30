package ±¸Çö;

import java.util.Scanner;

public class Main2902 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		String n = scan.nextLine();
		
		answer(n);
		scan.close();
	}
	
	public static void answer(String n) {
		
		String[] arr = n.split("-");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].charAt(0));
		}
	}

}
