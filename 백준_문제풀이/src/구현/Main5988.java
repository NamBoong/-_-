package ±¸Çö;

import java.math.BigInteger;
import java.util.Scanner;

public class Main5988 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] arr = new String[n];
		BigInteger[] arr2 = new BigInteger[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.next();
			arr2[i] = new BigInteger(arr[i]);
			
			answer(arr2[i]);
		}
		
		scan.close();
	}
	
	public static void answer(BigInteger n) {
		
		BigInteger a = new BigInteger("2");
		BigInteger zero =  new BigInteger("0");
		
		if(n.remainder(a).equals(zero)) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
