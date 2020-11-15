package ¼öÇÐ;

import java.util.Scanner;

public class Main10409 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int work = scan.nextInt();
		int time = scan.nextInt();
		
		System.out.println(answer(work, time));
		
		scan.close();
	}
	
	public static int answer(int a, int time) {
		
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<a; i++) {
			if(sum+arr[i]<=time) {
				sum = sum + arr[i];
				count++;
			}
			else {
				break;
			}
		}
		
		return count;
	}

}
