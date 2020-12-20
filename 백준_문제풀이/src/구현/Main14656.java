package ±¸Çö;

import java.util.Scanner;

public class Main14656 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			num[i] = i+1;
		}
		
		System.out.println(answer(arr, num, n));
		scan.close();
	}
	
	public static int answer(int[] arr, int[] num, int n) {
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]!=num[i]) {
				count++;
			}
		}
		
		return count;
	}

}
