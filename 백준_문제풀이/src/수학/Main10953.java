package ¼öÇÐ;

import java.util.Scanner;

public class Main10953 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			String a = scan.next();
			answer(a);
		}
		
		scan.close();
	}
	
	public static void answer(String n) {
		
		String[] arr = n.split(",");
		
		System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		
	}

}
