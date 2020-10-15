package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main5622 {

	static Scanner scan = new Scanner(System.in);
	
	static String a = scan.next();
	
	public static void main(String[] args) {
		
		answer(a);
		
		scan.close();
	}
	
	public static void answer(String code) {
		
		int sum = 0;
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)==65 || a.charAt(i)==66 || a.charAt(i)==67) {
				sum = sum + 3;
			}
			
			if(a.charAt(i)==68 || a.charAt(i)==69 || a.charAt(i)==70) {
				sum = sum + 4;
			}
			
			if(a.charAt(i)==71 || a.charAt(i)==72 || a.charAt(i)==73) {
				sum = sum + 5;
			}
			
			if(a.charAt(i)==74 || a.charAt(i)==75 || a.charAt(i)==76) {
				sum = sum + 6;
			}
			
			if(a.charAt(i)==77 || a.charAt(i)==78 || a.charAt(i)==79) {
				sum = sum + 7;
			}
			
			if(a.charAt(i)==80 || a.charAt(i)==81 || a.charAt(i)==82 || a.charAt(i)==83) {
				sum = sum + 8;
			}
			
			if(a.charAt(i)==84 || a.charAt(i)==85 || a.charAt(i)==86) {
				sum = sum + 9;
			}
			
			if(a.charAt(i)==87 || a.charAt(i)==88 || a.charAt(i)==89 || a.charAt(i)==90) {
				sum = sum + 10;
			}
		}
		
		System.out.println(sum);
	}

}
