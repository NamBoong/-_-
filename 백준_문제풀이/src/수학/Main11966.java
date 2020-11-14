package ¼öÇÐ;

import java.util.Scanner;

public class Main11966 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		int count = 0;
		
		for(int i=0; i<=30; i++) {
			if(Math.pow(2, i)==n) {
				System.out.println(1);
				count++;
			}
		}
		
		if(count==0) {
			System.out.println(0);
		}
		
		scan.close();
	}

}
