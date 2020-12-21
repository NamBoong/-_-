package ¼öÇĞ;

import java.util.Scanner;

public class Main14489 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(answer(a, b, c));
		scan.close();
	}
	
	public static int answer(int a, int b, int c) {
		
		if((a+b)>=c*2) {
			return (a+b)-c*2;
		}
		else {
			return a+b;
		}
	}

}
