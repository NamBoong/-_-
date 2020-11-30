package ¼öÇÐ;

import java.util.Scanner;

public class Main5032 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int coke = a+b;
		int answer = (a+b)/c;
		coke = coke - (answer*c) + answer;
		
		while(coke>=c) {
			if(coke<c) {
				System.out.println(answer);
			}
			coke = coke - c;
			answer++;
			coke++;

		}
		
		if(coke<c) {
			System.out.println(answer);
		}
		
		scan.close();
	}

}
