package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main1152 {

	static Scanner scan = new Scanner(System.in);
	
	static String n = scan.nextLine();
	
	public static void main(String[] args) {

		answer(n);
		scan.close();
	}

	public static void answer(String a) {
		
		String num = a;
		String b = num.trim();
		
		if(b.isEmpty()) {
			System.out.println(0);
		}
		else{
			String[] word = b.split(" ");
			System.out.println(word.length);
		}
	}
}
