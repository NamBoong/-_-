package ±¸Çö;

import java.util.Scanner;

public class Main15969 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		System.out.println(answer(n));
		
	}
	
	public static int answer(int n) {
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		if(n==2) {
			if(arr[1]>arr[0]) {
				return arr[1]-arr[0];
			}
			else {
				return arr[0]-arr[1];
			}
		}		
		else{

			for(int i=0; i<n; i++) {
				for(int j=i+1; j<n; j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			return arr[arr.length-1]-arr[0];
						
		}

	}

}
