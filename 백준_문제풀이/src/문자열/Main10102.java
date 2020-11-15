package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main10102 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int n = scan.nextInt();
		String a = scan.next();
		
		System.out.println(answer(a));
		
		scan.close();
	}
	
	public static String answer(String a) {
		
		String[] arr = a.split("");
		
		int acount = 0;
		int bcount = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("A")) {
				acount++;
			}
			if(arr[i].equals("B")) {
				bcount++;
			}
		}
		
		if(acount>bcount) {
			return "A";
		}
		else if(acount<bcount) {
			return "B";
		}
		else {
			return "Tie";
		}
	}

}
