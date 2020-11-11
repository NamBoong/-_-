package ±¸Çö;

import java.util.Scanner;

public class Main1568 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		
		long n = 1;
		
		int count = 0;
		
		while(0<=a) {
			
			if(a-n>=0) {
				a = a-n;
				n++;
				count++;
			}
			if(a-n<0) {
				n = 1;
				a = a-n;
				n++;
				count++;
			}
		}
		
		System.out.println(count-1);
		scan.close();
	}

}
