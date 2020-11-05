package ±¸Çö;

import java.util.Scanner;

public class Main10807 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}		
		
		int x = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}

}
