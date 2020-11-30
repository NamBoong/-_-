package ¼öÇÐ;

import java.util.Scanner;

public class Main3460 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			String answer = Integer.toBinaryString(arr[i]);
			answer(answer);
		}	
		scan.close();
	}
	
	public static void answer(String a) {
		
		String[] arr = a.split("");
		
		int count = 0;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i].equals("1")) {
				System.out.printf(count + " ");
			}
			count++;
		}
		System.out.println();
	}

}
