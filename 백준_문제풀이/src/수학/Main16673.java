package ¼öÇÐ;

import java.util.Scanner;

public class Main16673 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int c = scan.nextInt();
		
		System.out.println(answer(c));
		
		scan.close();
	}
	
	public static int answer(int c) {
		
		int k = scan.nextInt();
		int p = scan.nextInt();
		
		int count = 1;
		int answer = 0;
		
		while(count<=c) {
			
			answer = answer + (k*count + p*(int)Math.pow(count, 2));
			
			count++;
		}
		
		return answer;
	}

}
