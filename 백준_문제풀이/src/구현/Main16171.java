package ±¸Çö;

import java.util.Scanner;

public class Main16171 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		String a = scan.nextLine();
		
		System.out.println(answer(a));
		
		scan.close();
	}
	
	public static int answer(String a) {
		
		String b = scan.nextLine();
		
		String n = a.replaceAll("0", "");
		n = n.replaceAll("1", "");
		n = n.replaceAll("2", "");
		n = n.replaceAll("3", "");
		n = n.replaceAll("4", "");
		n = n.replaceAll("5", "");
		n = n.replaceAll("6", "");
		n = n.replaceAll("7", "");
		n = n.replaceAll("8", "");
		n = n.replaceAll("9", "");
		
		int type = 0;
		
		if(n.contains(b)) {
			type = 1;
		}
		
		return type;
	}

}
