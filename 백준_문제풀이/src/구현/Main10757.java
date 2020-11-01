package ±¸Çö;

import java.math.BigInteger;
import java.util.Scanner;

public class Main10757 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		BigInteger aa = new BigInteger(a);
		BigInteger bb = new BigInteger(b);
		
		System.out.println(aa.add(bb));
		scan.close();
	}

}
