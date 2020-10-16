package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main2675 {

	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	static int[] arr = new int[n];
	static String[] arr2 = new String[n];
	static int count = 0;

	public static void main(String[] args) {
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			arr2[i] = scan.next();
		}
		
		for(int i=0; i<n; i++) {
			answer(arr2[i]);
		}
		
		
	}
	
	public static void answer(String code) {
		
		String a = code;
		int num = 0;
		
		while(num<a.length()) {
			for(int i=0; i<arr[count]; i++) {
				System.out.print(a.charAt(num));
			}
			num++;
		}
		System.out.println();
		count++;
		
	}

}
