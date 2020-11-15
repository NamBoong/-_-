package ¼öÇÐ;

import java.util.Scanner;

public class Main10419 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(answer(arr[i]));
		}
		
		scan.close();
	}
	
	public static int answer(int n) {
		
		int answer = 0;
		
		for(int i=0; i<=n; i++) {
			if(i+Math.pow(i, 2)<=n) {
				answer = i;
			}
		}
		
		return answer;
	}

}
