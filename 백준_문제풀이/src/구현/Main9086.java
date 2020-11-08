package ±¸Çö;

import java.util.Scanner;

public class Main9086 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.next();
			System.out.println(answer(arr[i]));
		}
		scan.close();
	}
	
	public static String answer(String a) {
		
		String[] arr = a.split("");
		
		return arr[0] + arr[a.length()-1];
	}

}
