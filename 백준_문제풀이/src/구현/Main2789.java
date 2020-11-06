package ±¸Çö;

import java.util.Scanner;

public class Main2789 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		
		answer(a);
		scan.close();
	}
	
	public static void answer(String a) {
		
		String answer1 = a.replaceAll("C", "");
		answer1 = answer1.replaceAll("A", "");
		answer1 = answer1.replaceAll("M", "");
		answer1 = answer1.replaceAll("B", "");
		answer1 = answer1.replaceAll("R", "");
		answer1 = answer1.replaceAll("I", "");
		answer1 = answer1.replaceAll("D", "");
		answer1 = answer1.replaceAll("G", "");
		answer1 = answer1.replaceAll("E", "");
		
		System.out.println(answer1);
		
	}

}
