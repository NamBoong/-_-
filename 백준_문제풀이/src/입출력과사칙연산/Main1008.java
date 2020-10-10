package 입출력과사칙연산;

import java.util.Scanner;

public class Main1008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a/(double)b);
		
		scan.close();
	}

}
