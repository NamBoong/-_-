package ±¸Çö;

import java.util.Scanner;

public class Main2920 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		String n = scan.nextLine();
		
		answer(n);
		
		scan.close();
	}

	public static void answer(String n) {
		
		if(n.equals("1 2 3 4 5 6 7 8")) {
			System.out.println("ascending");
		}
		else if(n.equals("8 7 6 5 4 3 2 1")) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
		
	}
}
