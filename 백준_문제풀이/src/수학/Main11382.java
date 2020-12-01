package ¼öÇÐ;

	import java.util.Scanner;
	import java.math.BigInteger;
	
public class Main11382 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		BigInteger c = scan.nextBigInteger();
		
		a = a.add(b);
		System.out.println(a.add(c));
		scan.close();
	}
}
