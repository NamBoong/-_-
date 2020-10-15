package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main2941 {

	static Scanner scan = new Scanner(System.in);
	
	static String n = scan.next();
	static int up = 0;
	
	public static void main(String[] args) {

		answer(n);
		
		System.out.println(up);
		
		scan.close();
		
	}
	
	public static void answer(String num) {
		
		String a = num;
		
		a = a.replace("c=", "a");
		a = a.replace("c-", "c");
		a = a.replace("s=", "b");
		a = a.replace("dz=", "k");
		a = a.replace("d-", "d");
		a = a.replace("lj", "i");
		a = a.replace("nj", "k");
		a = a.replace("s=", "k");
		a = a.replace("z=", "y");
		
		up = a.length();
		
	}

}
