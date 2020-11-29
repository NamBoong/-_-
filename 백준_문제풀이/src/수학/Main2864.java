package ¼öÇÐ;

import java.util.Scanner;

public class Main2864 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		System.out.println(min(a, b) + " " + max(a, b));
		scan.close();
	}
	
	public static int min(String a, String b) {		
		a = a.replaceAll("6", "5");
		b = b.replaceAll("6", "5");

		return Integer.parseInt(a)+Integer.parseInt(b);
	}
	public static int max(String a, String b) {		
		a = a.replaceAll("5", "6");
		b = b.replaceAll("5", "6");

		return Integer.parseInt(a)+Integer.parseInt(b);
	}

}
