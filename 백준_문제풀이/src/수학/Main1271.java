package ¼öÇÐ;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1271 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();

		BigInteger answer = b.multiply(a.divide(b));
		
		System.out.println(a.divide(b));
		System.out.println(a.subtract(answer));
		scan.close();
	}

}
