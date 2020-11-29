package ¼öÇÐ;

import java.math.BigInteger;
import java.util.Scanner;

public class Main2935 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BigInteger a = scan.nextBigInteger();
		String b = scan.next();
		BigInteger c = scan.nextBigInteger();

		if(b.equals("+")) {
			System.out.println(plus(a, c));
		}
		else if(b.equals("*")) {
			System.out.println(multiply(a, c));
		}
		
		scan.close();
	}
	
	public static BigInteger plus(BigInteger a, BigInteger b) {
		
		return a.add(b);
	}
	public static BigInteger multiply(BigInteger a, BigInteger b) {
		
		return a.multiply(b);
	}
}
