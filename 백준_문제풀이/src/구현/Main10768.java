package ±¸Çö;

import java.util.Scanner;

public class Main10768 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		System.out.println(answer(month, day));
		scan.close();
	}
	
	public static String answer(int month, int day) {
		
		String a = "";
		
		if(month==2 && day==18) {
			a = "Special";
		}
		else if(month<2 || (month==2 && day<18)) {
			a = "Before";
		}
		else if(month>2 || (month==2 && day>18)) {
			a = "After";
		}
		
		return a;
	}

}
