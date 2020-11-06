package ±¸Çö;

import java.util.Scanner;

public class Main2846 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		answer(n);
		scan.close();
	}
	
	public static void answer(int a) {
		
		int[] arr = new int[a];
		
		int ahill = 0;
		int bhill = 0;
		
		for(int i=0; i<a; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=1; i<a; i++) {
			if(arr[i-1]<arr[i]) {
				ahill = ahill + (arr[i]-arr[i-1]);
								
				if(ahill>bhill) {
					bhill = ahill;
				}
			}
			else {
				if(ahill>bhill) {
					bhill = ahill;
					ahill = 0;
				}
				else {
					ahill = 0;
				}
			}
			
		}
		
		System.out.println(bhill);
	}

}
