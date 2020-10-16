package Àç±Í;

import java.util.Scanner;

public class Main10872 {

	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	
	public static void main(String[] args) {

		System.out.println(answer(n));
		scan.close();
	}
	
	public static int answer(int a) {
		
		int num = a;
		int sum = 1;
		
		for(int i=num; i>=1; i--) {
			sum = sum * i;
		}
		return sum;
	}

}
