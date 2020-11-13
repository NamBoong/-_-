package ¼öÇÐ;

import java.util.Scanner;

public class Main4504 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		while(scan.hasNext()) {
			int a = scan.nextInt();
			
			if(a==0) {
				break;
			}
			
			if(a%n==0) {
				System.out.println(a + " is a multiple of " + n + ".");
			}
			else {
				System.out.println(a + " is NOT a multiple of " + n + ".");
			}
		}
		scan.close();
	}

}
