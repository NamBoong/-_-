package ±¸Çö;

import java.math.BigInteger;
import java.util.Scanner;

public class Main15964 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BigInteger n = scan.nextBigInteger();
		BigInteger m = scan.nextBigInteger();
		
		System.out.println(answer(n, m));
		scan.close();
	}
	
	public static BigInteger answer(BigInteger n, BigInteger m) {
		
		return (n.add(m)).multiply(n.subtract(m));
	}

}
