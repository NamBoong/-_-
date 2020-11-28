package ±¸Çö;

import java.util.Scanner;

public class Main7572 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(answer(n));
		scan.close();
	}
	
	public static String answer(int n) {
		
		String answer1 = "";
		int answer2 = 0;
		
		switch (n%12) {
			case 4 : answer1 = "A";
			break;
			case 5 : answer1 = "B";
			break;
			case 6 : answer1 = "C";
			break;
			case 7 : answer1 = "D";
			break;
			case 8: answer1 = "E";
			break;
			case 9 : answer1 = "F";
			break;
			case 10 : answer1 = "G";
			break;
			case 11 : answer1 = "H";
			break;
			case 0 : answer1 = "I";
			break;
			case 1 : answer1 = "J";
			break;
			case 2 : answer1 = "K";
			break;
			case 3 : answer1 = "L";
			break;
		}
		
		switch (n%10) {
		case 4 : answer2 = 0;
		break;
		case 5 : answer2 = 1;
		break;
		case 6 : answer2 = 2;
		break;
		case 7 : answer2 = 3;
		break;
		case 8: answer2 = 4;
		break;
		case 9 : answer2 = 5;
		break;
		case 0 : answer2 = 6;
		break;
		case 1 : answer2 = 7;
		break;
		case 2 : answer2 = 8;
		break;
		case 3 : answer2 = 9;
		break;
		}
		
		String answer = answer1 + answer2;
		
		return answer;
	}

}
