package ¼öÇÐ;

import java.util.Scanner;

public class Main4880 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if(a==0 && b==0 && c==0) {
				break;
			}
			
			System.out.println(type(a, b, c) + " " + answer(a, b, c));		
		}
		
		scan.close();
	}
	
	public static String type(int a, int b, int c) {
		
		if(b-a==c-b) {
			return "AP";
		}
		else {
			return "GP";
		}
	}
	public static int answer(int a, int b, int c) {
		if(b-a==c-b) {
			return c+(b-a);
		}
		else {
			return c*(c/b);
		}
	}

}
