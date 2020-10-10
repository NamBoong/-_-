package 입출력과사칙연산;

import java.util.Scanner;

public class Main2588 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println((b%10)*a);
		System.out.println(((b-(b%10))%100)/10*a);
		System.out.println((b/100)*a);
		System.out.println(a*b);
		
		scan.close();
		
	}

}
