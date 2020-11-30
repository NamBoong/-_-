package ¼öÇĞ;

import java.util.Scanner;

public class Main5522 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int answer = 0;
		int count = 0;
		
		while(count<5) {
			int num = scan.nextInt();			
			answer = answer + num;
			count++;
		}		
		System.out.println(answer);
		scan.close();
	}

}
