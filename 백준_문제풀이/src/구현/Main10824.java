package ±¸Çö;

import java.math.BigInteger;
import java.util.Scanner;

public class Main10824 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		String d = scan.next();
		
		answer(a, b, c, d);
		
		scan.close();
	}
	
	public static void answer(String a, String b, String c, String d) {
		
		String ab = a+b;
		String cd = c+d;
		
		BigInteger ab2 = new BigInteger(ab);
		BigInteger cd2 = new BigInteger(cd);
		System.out.println(ab2.add(cd2));
	}

}
