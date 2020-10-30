package ±¸Çö;

import java.util.Scanner;

public class Main2576 {
	
	static Scanner scan = new Scanner(System.in);
	static int answer = 0;
	static int min = Integer.MAX_VALUE;
	static int check = 0;
	
	public static void main(String[] args) {
		
		int[] arr = new int[7];
		
		for(int i=0; i<7; i++) {
			arr[i] = scan.nextInt();
			answer(arr[i]);
		}		
		
		if(check==0) {
			System.out.println(-1);
		}
		
		else {
			System.out.println(answer);
			System.out.println(min);
		}
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		if(n%2==1) {
			answer = answer + n;
			if(min>n) {
				min = n;
			}
			check++;
		}
	
	}

}
