package ¼öÇÐ;

import java.util.Scanner;

public class Main16430 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = b-a;
		
		for(int i=2; i<10; i++) {
			if(c%i==0 && b%i==0) {
				c = c/i;
				b = b/i;
			}
		}
		
		System.out.println(c + " " + b);
		
		scan.close();
	}

}
