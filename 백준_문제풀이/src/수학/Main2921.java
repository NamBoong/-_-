package ¼öÇÐ;

import java.util.Scanner;

public class Main2921 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(answer(n));
		
		scan.close();
	}
	
	public static int answer(int n) {
		
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			answer = answer + (i*(n+2));
		}
		
		return answer;
	}

}
