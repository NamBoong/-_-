package ¼öÇÐ2;

import java.util.Scanner;

public class Main1978 {

	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	static int[] arr = new int[n];
	static int count2 = 0;
		
	public static void main(String[] args) {

		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			
			answer(arr[i]);
		}

		System.out.println(count2);
		scan.close();
	}
	
	public static void answer(int a) {
		
		int num = a;
		int count = 0;
		
		for(int i=2; i<=num; i++) {
			if(num%i==0) {
					count++;
			}
		}
		
		if(count==1) {
			count2++;
		}
		
		
	}

}
