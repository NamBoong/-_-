package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main11586 {
	
	static Scanner scan = new Scanner(System.in);

	static int n = scan.nextInt();		
	static String[] arr = new String[n];

	public static void main(String[] args) {
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.next();		
		}
		
		int type = scan.nextInt();
		
		if(type==1) {
			answer1(n);
		}
		
		if(type==2) {
			answer2(n);
		}
		
		if(type==3) {
			answer3(n);
		}
		
		scan.close();
	}
	
	public static void answer1(int n) {

		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);	
		}		
	}

	public static void answer2(int n) {
		
		int count = 0;
		
		while(count<n) {
			for(int i=n-1; i>=0; i--) {
				System.out.print(arr[count].charAt(i));
			}
			System.out.println();
			count++;
		}
	}
	
	public static void answer3(int n) {
		
		for(int i=n-1; i>=0; i--) {
			System.out.println(arr[i]);	
		}		
	}
}
