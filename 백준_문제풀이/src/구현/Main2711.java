package ±¸Çö;

import java.util.Scanner;

public class Main2711 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] num = new int[n];
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
			arr[i] = scan.next();
			
			answer(num[i], arr[i]);
		}
		
		scan.close();
	}
	
	public static void answer(int n, String a) {
		
		String[] arr = a.split("");
		
		arr[n-1] = "";
		
		for(int i=0; i<a.length(); i++) {
			System.out.printf(arr[i]);
		}
		System.out.println();
	}

}
