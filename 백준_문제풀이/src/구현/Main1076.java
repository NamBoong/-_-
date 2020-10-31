package ±¸Çö;

import java.util.Scanner;

public class Main1076 {
	
	static long a = 0;
	static long answer = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String one = scan.next();
		String two = scan.next();
		String three = scan.next();
		
		middle(one, two);
		answer(three);
		
		System.out.println(answer);
		
		scan.close();
	}
	
	public static void middle(String one, String two) {
		
		int one1 = 0;
		int two2 = 0;
		
		switch(one) {
			case "black": one1 = 0;
			break;
							
			case "brown": one1 = 1;
			break;
			
			case "red": one1 = 2;
			break;
			
			case "orange": one1 = 3;
			break;
			
			case "yellow": one1 = 4;
			break;
			
			case "green": one1 = 5;
			break;
			
			case "blue": one1 = 6;
			break;
			
			case "violet": one1 = 7;
			break;
			
			case "grey": one1 = 8;
			break;
			
			case "white": one1 = 9;
			break;
		}
		
		switch(two) {
		case "black": two2 = 0;
		break;
						
		case "brown": two2 = 1;
		break;
		
		case "red": two2 = 2;
		break;
		
		case "orange": two2 = 3;
		break;
		
		case "yellow": two2 = 4;
		break;
		
		case "green": two2 = 5;
		break;
		
		case "blue": two2 = 6;
		break;
		
		case "violet": two2 = 7;
		break;
		
		case "grey": two2 = 8;
		break;
		
		case "white": two2 = 9;
		break;
	}
		
		
		a = one1*10+two2;
	}
	
	public static void answer(String three) {
		
		int three3 = 0;
		
		switch(three) {
		case "black": three3 = 1;
		break;
						
		case "brown": three3 = 10;
		break;
		
		case "red": three3 = 100;
		break;
		
		case "orange": three3 = 1000;
		break;
		
		case "yellow": three3 = 10000;
		break;
		
		case "green": three3 = 100000;
		break;
		
		case "blue": three3 = 1000000;
		break;
		
		case "violet": three3 = 10000000;
		break;
		
		case "grey": three3 = 100000000;
		break;
		
		case "white": three3 = 1000000000;
		break;
	}
		
		answer = a*three3;
	}

}
